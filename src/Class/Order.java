/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Yasiru
 */
public class Order {
    
    String OrderID;
    String Date;
    String ClientID;
    String OrderItem;
    int Quantity;
    String Description;

    public Order(){}
    public Order(String OrderID, String Date, String ClientID, String OrderItem, int Quantity, String Description) {
        this.OrderID = OrderID;
        this.Date = Date;
        this.ClientID = ClientID;
        this.OrderItem = OrderItem;
        this.Quantity = Quantity;
        this.Description = Description;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String ClientID) {
        this.ClientID = ClientID;
    }

    public String getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(String OrderItem) {
        this.OrderItem = OrderItem;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    
   
    
    
    
}
