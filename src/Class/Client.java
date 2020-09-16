/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.logging.Logger;

/**
 *
 * @author Vihanga
 */
public class Client {
    private String ClientID;
    private String ClientName;
    private String ClientAddress;
    private int ClientContact;
    private String ClientEmail;
    private String Client_SVATno;
    private String Client_VATno;

   

    public Client() {
    }

    public Client(String ClientID, String ClientName, String ClientAddress, int ClientContact, String ClientEmail, String Client_SVATno, String Client_VATno) {
        this.ClientID = ClientID;
        this.ClientName = ClientName;
        this.ClientAddress = ClientAddress;
        this.ClientContact = ClientContact;
        this.ClientEmail = ClientEmail;
        this.Client_SVATno = Client_SVATno;
        this.Client_VATno = Client_VATno;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String ClientID) {
        this.ClientID = ClientID;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getClientAddress() {
        return ClientAddress;
    }

    public void setClientAddress(String ClientAddress) {
        this.ClientAddress = ClientAddress;
    }

    public int getClientContact() {
        return ClientContact;
    }

    public void setClientContact(int ClientContact) {
        this.ClientContact = ClientContact;
    }

    public String getClientEmail() {
        return ClientEmail;
    }

    public void setClientEmail(String ClientEmail) {
        this.ClientEmail = ClientEmail;
    }

    public String getClient_SVATno() {
        return Client_SVATno;
    }

    public void setClient_SVATno(String Client_SVATno) {
        this.Client_SVATno = Client_SVATno;
    }

    public String getClient_VATno() {
        return Client_VATno;
    }

    public void setClient_VATno(String Client_VATno) {
        this.Client_VATno = Client_VATno;
    }

   
  
    
}
