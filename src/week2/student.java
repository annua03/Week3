/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week2;

/**
 *
 * @author arman
 */
public class student {

    private int std;
    private String sname;
    private String address;

    public student(int std, String sname) {
        this.std = std;
        this.sname = sname;
    }

    public int getStd() {
        return std;
    }

    public String getSname() {
        return sname;
    }

    public String getAddress() {
        return address;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
