/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import extendsion.Check;


public class Giong {
    private String teng,nguongoc,dactinh,maloai;
    private int mag;
    public Giong(int mag,String teng, String nguongoc, String dactinh, String maloai) {
        this.mag = mag;
        this.teng=teng;
        this.nguongoc = nguongoc;
        this.dactinh = dactinh;
        this.maloai = maloai;
    }
    
     public Giong(String teng, String nguongoc, String dactinh, String maloai) {
        this.teng=teng;
        this.nguongoc = nguongoc;
        this.dactinh = dactinh;
        this.maloai = maloai;
    }

     
    public Giong(int mag,String teng) {
        this.mag=mag;
        this.teng=teng;
    }
     
    
    public boolean correct(String mal,String lenl){
        return !maloai.equals(mal)&&!teng.equals(lenl);
    }
    
    
    public String getCom(){
        return teng;
    }
    
    
    public String toString() {
        return getMag()+Check.s+getTeng()+Check.s+getNguongoc()+Check.s+getDactinh()+Check.s+getMaloai();
    }

    
    public int getMag() {
        return mag;
    }

    /**
     * @param mag the mag to set
     */
    public void setMag(int mag) {
        this.mag = mag;
    }

    /**
     * @return the teng
     */
    public String getTeng() {
        return teng;
    }

    /**
     * @param teng the teng to set
     */
    public void setTeng(String teng) {
        this.teng = teng;
    }

    /**
     * @return the nguongoc
     */
    public String getNguongoc() {
        return nguongoc;
    }

    /**
     * @param nguongoc the nguongoc to set
     */
    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    /**
     * @return the dactinh
     */
    public String getDactinh() {
        return dactinh;
    }

    /**
     * @param dactinh the dactinh to set
     */
    public void setDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    /**
     * @return the maloai
     */
    public String getMaloai() {
        return maloai;
    }

    /**
     * @param maloai the maloai to set
     */
    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    
}
