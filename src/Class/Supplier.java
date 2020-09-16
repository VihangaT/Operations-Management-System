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
public class Supplier {
    String SupID;
    String Fname;
    String Address;
     String Email;
     int ContactNo;
     int CLimit;

    public Supplier(){} 
     
    public Supplier(String SupID, String Fname, String Address, String Email, int ContactNo, int CLimit) {
        this.SupID = SupID;
        this.Fname = Fname;
        this.Address = Address;
        this.Email = Email;
        this.ContactNo = ContactNo;
        this.CLimit = CLimit;
    }

    public String getSupID() {
        return SupID;
    }

    public void setSupID(String SupID) {
        this.SupID = SupID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

    public int getCLimit() {
        return CLimit;
    }

    public void setCLimit(int CLimit) {
        this.CLimit = CLimit;
    }


   
    

    
    
    
    
    
}
