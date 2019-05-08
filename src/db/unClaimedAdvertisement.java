/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author mazin
 */
public class unClaimedAdvertisement {
    String Advertisement_ID;
    String Title;
    String Description;
    String Price;
    String Date;
    String Username;

    public unClaimedAdvertisement(String ad_ID, String Title, String Description, String Price, String Date, String Username) {
        this.Advertisement_ID = ad_ID;
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.Date = Date;
        this.Username = Username;
    }

    public String getAdvertisement_ID() {
        return Advertisement_ID;
    }

    public void setAdvertisement_ID(String Advertisement_ID) {
        this.Advertisement_ID = Advertisement_ID;
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

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    
    Object[] toArray(){
        return new Object[]{Advertisement_ID,Title,Description,Price,Date,Username};
}
}
