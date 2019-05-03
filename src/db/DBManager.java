/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author mazin
 */
public class DBManager {
    Connection connection;
    public void connect(String userName, String password, String serverName, String portNumber, String dbName) throws SQLException, InstantiationException, IllegalAccessException {
        System.out.println("Loading driver...");

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", userName);
        connectionProps.put("password", password);

        conn = DriverManager.getConnection(
                "jdbc:mysql://"
                + serverName
                + ":" + portNumber + "/" + dbName + "?useSSL=true" ,
                
                connectionProps);

        System.out.println("Connected to database");
        this.connection=conn;
    }
    
    // get  general advertisements 
    public Object[][] getAdevertisements(){
    
        PreparedStatement stmt = null;
        
        Object[][] result = new Object[][]{};
        
        String query = "SELECT Advertisement_ID, AdvTitle, AdvDetails, Price, Status_ID, AdvDateTime FROM advertisements WHERE Status_ID =?";
        
        try{
            stmt=connection.prepareStatement(query);
            stmt.setString(1,"AC"); //binding the parameter with the given string
            //stmt.setString(1,"CAT"); //binding the parameter with the given string
            ResultSet rs = stmt.executeQuery();
            int count = getResultSetSize(rs);
            result=getFinalAds(count,rs);
        }
        
        catch(SQLException e) {
            System.out.println(e.getMessage());
            return result;
        }
        return result;
    }
    
    // get the final object result fot the previous (above) function.
    private Object[][] getFinalAds(int count,ResultSet rs) throws SQLException {
        Object[][] result=new Object[count][4];
        int index=0;
       do {
            //String Account_ID = rs.getString("Advertisement_ID");
            String Title = rs.getString("AdvTitle");
            String Details = rs.getString("AdvDetails");
            String Price = rs.getString("Price");
            //String Status = rs.getString("Status_ID");
            String Time = rs.getString("AdvDateTime");

            Advertisement advertisement=new Advertisement(Title,Details,Price,Time);
            result[index++]=advertisement.toArray();
        }
       while(rs.next());
        return result;
    } 
    
    // get user advertisements
    public Object[][] getUserAdevertisements(String username){
        PreparedStatement stmt = null;
        Object[][] result = new Object[][]{};
        String query = "SELECT Advertisement_ID, AdvTitle, AdvDetails, Price, Status_ID, AdvDateTime FROM advertisements WHERE User_ID =?";

        
        try{
            stmt=connection.prepareStatement(query);
            stmt.setString(1,username); //binding the parameter with the given string
            ResultSet rs = stmt.executeQuery();
            int count = getResultSetSize(rs);
            result=getFinalUserAds(count,rs);
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            return result;
        }
        
        return result;
    }
    
    // get the final object result fot the previous (above) function.
    private Object[][] getFinalUserAds(int count,ResultSet rs) throws SQLException {
        Object[][] result=new Object[count][6];
        int index=0;
       do {
            String Account_ID = rs.getString("Advertisement_ID");
            String Title = rs.getString("AdvTitle");
            String Details = rs.getString("AdvDetails");
            String Price = rs.getString("Price");
            String Status="";
            //String Status = rs.getString("Status_ID");
            String Time = rs.getString("AdvDateTime");
            if("AC".equals(rs.getString("Status_ID")))
            {
                 Status = "ACTIVE";
            }
            else if("PN".equals(rs.getString("Status_ID")))
            {
                Status = "Pending"; 
            }
            else if("DI".equals(rs.getString("Status_ID"))){
               Status = "Disapproved";  
            }else{Status = "null";}
            

            UserAdvertisement advertisement=new UserAdvertisement(Account_ID, Title,Details,Price,Status ,Time);
            result[index++]=advertisement.toArray();
        }
       while(rs.next());
        return result;
    } 
    
    // function to check if the user exist.
    public boolean checkUser(String user_ID){
        // we will use try to check if the user is found, else we'll throw message that the user is not fount
        
        PreparedStatement stmt = null;
        
        String query = "select * FROM users WHERE User_ID=?";

        try {
            stmt=connection.prepareStatement(query);
            stmt.setString(1,user_ID); //binding the parameter with the given string
            ResultSet rs = stmt.executeQuery();
            int count = getResultSetSize(rs);
            if (count == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;
    }
    
    // function to check if the Moderator exist.
    public boolean checkModerator(String moderator_ID){
        // we will use try to check if the Moderator is found, else we'll throw message that the Moderator is not fount
PreparedStatement stmt = null;
        
        String query = "select * FROM moderators WHERE User_ID=?";

        try {
            stmt=connection.prepareStatement(query);
            stmt.setString(1,moderator_ID); //binding the parameter with the given string
            ResultSet rs = stmt.executeQuery();
            int count = getResultSetSize(rs);
            if (count == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return false;    }
    
    // add new advertisement
    public boolean addAdvertisement(){
    return false;
    }

    // delete advertisement
    public boolean deleteAdvertisement(){
    return false;
    }

    // edit advertisement
    public boolean editAdvertisement(){
    return false;
    }
    
    // claim an advertisement
    public boolean claimAdvertisemsnt(){
        return false;
    }
    // aprrove advertisement
    public boolean approveAdvertisemsnt(){
        return false;
    }
    
    /* This function from: "Canvas/DB_Classroom" project */
    private int getResultSetSize(ResultSet rs) {
        int count = 0;
        try {
            while (rs.next()) {
                count++;
            }
            rs.first();
        } catch (SQLException e) {

        }
        return count;
    }

}
