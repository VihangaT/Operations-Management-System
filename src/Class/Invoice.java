/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Vihanga
 */
public class Invoice {
    private String Date;
    private String InvoiceNo;
    private String Description;
    private int Quantity;
    private int Price;

    public Invoice(String Date, String InvoiceNo, String Description, int Quantity, int Price) {
        this.Date = Date;
        this.InvoiceNo = InvoiceNo;
        this.Description = Description;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(String InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

   
    
    
}
