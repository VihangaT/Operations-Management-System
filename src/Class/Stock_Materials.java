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
public class Stock_Materials {
    private String MaterialID;
    private String MaterialName;
    private int MQuantity;
    private int MReorderLevel;

     public Stock_Materials(){} 
     
    public Stock_Materials(String MaterialID, String MaterialName, int MQuantity, int MReorderLevel) {
        this.MaterialID = MaterialID;
        this.MaterialName = MaterialName;
        this.MQuantity = MQuantity;
        this.MReorderLevel = MReorderLevel;
    }

    public String getMaterialID() {
        return MaterialID;
    }

    public void setMaterialID(String MaterialID) {
        this.MaterialID = MaterialID;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    public int getMQuantity() {
        return MQuantity;
    }

    public void setMQuantity(int MQuantity) {
        this.MQuantity = MQuantity;
    }

    public int getMReorderLevel() {
        return MReorderLevel;
    }

    public void setMReorderLevel(int MReorderLevel) {
        this.MReorderLevel = MReorderLevel;
    }

   
    
}
