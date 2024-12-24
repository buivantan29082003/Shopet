/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import extendsion.Check;


public class NhanVien {
    private String tenNv;
    private String maNv;
    private String matKhau,mail,hinhanh;
    private int vaitro;
    
    
    public NhanVien(String maNv, String tenNv, String matKhau, int vaitro) {
        this.tenNv = tenNv;
        this.maNv = maNv;
        this.matKhau = matKhau;
        this.vaitro = vaitro;
    }

    
    public void setUpdate(String ten,String em){
        tenNv=ten;
        mail=em;
    }

    
    public NhanVien() {
    }

    
    public NhanVien(String tennv) {
        this.tenNv=tennv;
    }
    
    
    public NhanVien(String maNv, String tenNv, String matKhau, int vaitro,String mail,String hinhanh) {
        this.tenNv = tenNv;
        this.maNv = maNv;
        this.matKhau = matKhau;
        this.vaitro = vaitro;
        this.mail=mail;
         this.hinhanh=hinhanh;
    }
    
    public NhanVien(String maNv, String tenNv, String matKhau, int vaitro,String mail) {
        this.tenNv = tenNv;
        this.maNv = maNv;
        this.matKhau = matKhau;
        this.vaitro = vaitro;
        this.mail=mail;
    }
    
    
    public String toString() {
        return this.getMaNv()+Check.s+this.getTenNv()+Check.s+String.valueOf(vaitro==1?"Trưởng phòng":"Nhân viên")+Check.s+getEmail()+Check.s+getHinhanh();
    }
    
    
    public int getVaiTro(){
        return vaitro;
    }
    
    
    public String getTenNv() {
        return tenNv;
    }

    /**
     * @param tenNv the tenNv to set
     */
    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    /**
     * @return the maNv
     */
    public String getMaNv() {
        return maNv;
    }

    /**
     * @param maNv the maNv to set
     */
    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    /**
     * @return the matKhau
     */
    public String getMatKhau() {
        return matKhau;
    }

    /**
     * @param matKhau the matKhau to set
     */
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    /**
     * @return the vaitro
     */
    public int getVaitro() {
        return vaitro;
    }

    /**
     * @param vaitro the vaitro to set
     */
    public void setVaitro(int vaitro) {
        this.vaitro = vaitro;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return mail;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.mail = email;
    }

    /**
     * @return the hinhanh
     */
    public String getHinhanh() {
        return hinhanh;
    }

    /**
     * @param hinhanh the hinhanh to set
     */
    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
}
