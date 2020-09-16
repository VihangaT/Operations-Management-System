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
public class Employee {
    private String EmpNo;
    private String EmpName;
    private String EmpEmail;
    private int EmpContact;
    private String EmpRole;
    private int EmpSalaryR;

    public Employee(String EmpNo, String EmpName, String EmpEmail, int EmpContact, String EmpRole, int EmpSalaryR) {
        this.EmpNo = EmpNo;
        this.EmpName = EmpName;
        this.EmpEmail = EmpEmail;
        this.EmpContact = EmpContact;
        this.EmpRole = EmpRole;
        this.EmpSalaryR = EmpSalaryR;
    }

    public String getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(String EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String EmpEmail) {
        this.EmpEmail = EmpEmail;
    }

    public int getEmpContact() {
        return EmpContact;
    }

    public void setEmpContact(int EmpContact) {
        this.EmpContact = EmpContact;
    }

    public String getEmpRole() {
        return EmpRole;
    }

    public void setEmpRole(String EmpRole) {
        this.EmpRole = EmpRole;
    }

    public int getEmpSalaryR() {
        return EmpSalaryR;
    }

    public void setEmpSalaryR(int EmpSalaryR) {
        this.EmpSalaryR = EmpSalaryR;
    }

    
    
    
}
