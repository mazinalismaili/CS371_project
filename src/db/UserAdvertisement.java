/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author mazin
 * This class will be used to hold a specific user advertisements.
 */
public class UserAdvertisement {
    
    private String Advertisement_ID;
    private String Title;
    private String Description;
    private String Price;
    private String Status;
    private String Date;

    
    public UserAdvertisement(String Advertisement_ID, String Title, String Description, String Price, String Status, String Date) {
        this.Advertisement_ID = Advertisement_ID;
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.Status = Status;
        this.Date = Date;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    Object[] toArray(){
        return new Object[]{Advertisement_ID, Title,Description,Price, Status, Date};
    }
}
