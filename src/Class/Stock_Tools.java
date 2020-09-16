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
public class Stock_Tools {
    private String ToolID;
    private String Toolname;
    private int TQuantity;
    private int TReOrderLevel;

    public Stock_Tools(String ToolID, String Toolname, int TQuantity, int TReOrderLevel) {
        this.ToolID = ToolID;
        this.Toolname = Toolname;
        this.TQuantity = TQuantity;
        this.TReOrderLevel = TReOrderLevel;
    }

    public String getToolID() {
        return ToolID;
    }

    public void setToolID(String ToolID) {
        this.ToolID = ToolID;
    }

    public String getToolname() {
        return Toolname;
    }

    public void setToolname(String Toolname) {
        this.Toolname = Toolname;
    }

    public int getTQuantity() {
        return TQuantity;
    }

    public void setTQuantity(int TQuantity) {
        this.TQuantity = TQuantity;
    }

    public int getTReOrderLevel() {
        return TReOrderLevel;
    }

    public void setTReOrderLevel(int TReOrderLevel) {
        this.TReOrderLevel = TReOrderLevel;
    }

    
}
