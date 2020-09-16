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
public class Stock_Spareparts {
    private String SparepartID;
    private String SparepartName;
    private int SPquantity;
    private int SPreorderlvl;

    public Stock_Spareparts(String SparepartID, String SparepartName, int SPquantity, int SPreorderlvl) {
        this.SparepartID = SparepartID;
        this.SparepartName = SparepartName;
        this.SPquantity = SPquantity;
        this.SPreorderlvl = SPreorderlvl;
    }

    public String getSparepartID() {
        return SparepartID;
    }

    public void setSparepartID(String SparepartID) {
        this.SparepartID = SparepartID;
    }

    public String getSparepartName() {
        return SparepartName;
    }

    public void setSparepartName(String SparepartName) {
        this.SparepartName = SparepartName;
    }

    public int getSPquantity() {
        return SPquantity;
    }

    public void setSPquantity(int SPquantity) {
        this.SPquantity = SPquantity;
    }

    public int getSPreorderlvl() {
        return SPreorderlvl;
    }

    public void setSPreorderlvl(int SPreorderlvl) {
        this.SPreorderlvl = SPreorderlvl;
    }

    
    
}
