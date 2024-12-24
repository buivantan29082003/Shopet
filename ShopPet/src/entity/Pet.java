
package entity;

import extendsion.Check;

public class Pet {
    
    private String matc,mausac,ghichu,tenloai,tiemngua,hinhanh;
    private float kichthuoc,gia,giagiam;
    private int soluong,mag;
   
    
    public Pet() {
    }

    
    public Pet(String map,float gia,int mg,String n) {
        this.matc=map;
        this.gia=gia;
        this.mag=mg;
    }
   
    
    public Pet(String matc,String mausac, String ghichu, float kichthuoc, int soluong, int mag, String tiemngua, float gia,String tenloai,String hinhanh) {
        this.matc = matc;
        this.mausac = mausac;
        this.ghichu = ghichu;
        this.kichthuoc = kichthuoc;
        this.soluong = soluong;
        this.mag = mag;
        this.tiemngua = tiemngua;
        this.gia = gia;
        this.tenloai=tenloai;
        this.hinhanh=hinhanh;
    }
    
    
    public Pet(String matc,float gia,int sl,float giagiam){
        this.matc=matc;
        this.gia=gia;
        this.soluong=sl;
        this.giagiam=giagiam;
    }
    
    
    public Pet(String matc,float gia,int sl){
        this.matc=matc;
        this.gia=gia;
        this.soluong=sl;
    }
    
    
    public String getTable(){
        return matc+Check.s+gia+Check.s+soluong+Check.s+giagiam;
    }

    
    public Pet(String matc,String mausac, String ghichu, float kichthuoc, int soluong, int mag, String tiemngua, float gia,String hinhanh) {
        this.matc = matc;
        this.mausac = mausac;
        this.ghichu = ghichu;
        this.kichthuoc = kichthuoc;
        this.soluong = soluong;
        this.mag = mag;
        this.tiemngua = tiemngua;
        this.gia = gia;
        this.hinhanh=hinhanh;
    }
    
   
    public String getMatc() {
        return matc;
    }

    /**
     * @param matc the matc to set
     */
    public void setMatc(String matc) {
        this.matc = matc;
    }

    /**
     * @return the tentc
     */
   

    /**
     * @return the mausac
     */
    public String getMausac() {
        return mausac;
    }

    /**
     * @param mausac the mausac to set
     */
    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    /**
     * @return the ghichu
     */
    public String getGhichu() {
        return ghichu;
    }

    /**
     * @param ghichu the ghichu to set
     */
    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    /**
     * @return the kichthuoc
     */
    public float getKichthuoc() {
        return kichthuoc;
    }

    /**
     * @param kichthuoc the kichthuoc to set
     */
    public void setKichthuoc(float kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    /**
     * @return the soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the mag
     */
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
     * @return the tiemngua
     */
    public String getTiemngua() {
        return tiemngua;
    }

    /**
     * @param tiemngua the tiemngua to set
     */
    public void setTiemngua(String tiemngua) {
        this.tiemngua = tiemngua;
    }

    /**
     * @return the gia
     */
    public float getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(float gia) {
        this.gia = gia;
    }

    /**
     * @return the tenloai
     */
    public String getTenloai() {
        return tenloai;
    }

    /**
     * @param tenloai the tenloai to set
     */
    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
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

    /**
     * @return the giagiam
     */
    public float getGiagiam() {
        return giagiam;
    }

    
    public void setGiagiam(float giagiam) {
        this.giagiam = giagiam;
    }
    
}
