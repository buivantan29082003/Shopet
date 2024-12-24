/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class KhachHang {
    private String sdt;
    private String tenkh;

    public KhachHang(String tenkh) {
        this.tenkh=tenkh;
    }

    @Override
    public String toString() {
        return sdt+" --- "+tenkh;
    }
    
    
    
    public KhachHang(String sdt,String tenkh) {
        this.sdt=sdt;
        this.tenkh=tenkh;
    }


    public KhachHang() {
    }

    /**
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    /**
     * @return the tenkh
     */
    public String getTenkh() {
        return tenkh;
    }

    /**
     * @param tenkh the tenkh to set
     */
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
    
}
