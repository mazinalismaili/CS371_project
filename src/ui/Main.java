/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import db.*;
import javax.swing.JFrame;

/**
 *
 * @author mazin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DBManager DB=new DBManager();
        try{
            
            DB.connect("username","password","KC-SCE-APPDB01","3306","schema");
            JFrame LoginFrame=new LoginFrame(DB);
            LoginFrame.setVisible(true);
        }
        catch(Exception e){
            
        }
    }
    
}
