/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 * @author mazin
 * This class will hold the general advertisements on the User Form. 
 */
public class Advertisement {

    private String Title;
    private String Description;
    private String Price;
    private String Date;
    
    public Advertisement(String Title, String Description, String Price, String Date) {
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.Date = Date;
    }
   
    
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
     Object[] toArray(){
        return new Object[]{Title,Description,Price,Date};
    }
}
