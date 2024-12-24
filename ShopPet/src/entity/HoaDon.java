
package entity;

import extendsion.Check;


public class HoaDon {
    private String ngaylap,ghichu,makh,manv;
    private float tongtien;
    private int mahd;

    public HoaDon(int mahd,String ngaylap, String makh, String manv, float tongtien, String ghichu) {
        this.ngaylap = ngaylap;
        this.ghichu = ghichu;
        this.makh = makh;
        this.manv = manv;
        this.tongtien = tongtien;
        this.mahd = mahd;
    }

    @Override
    public String toString() {
        return mahd+Check.s+ngaylap+Check.s+makh+Check.s+manv+Check.s+tongtien+Check.s+ghichu;
    }

    public HoaDon() {
    }
    
    public HoaDon(int mahd,String makh,String manv) {
        this.mahd=mahd;
        this.makh=makh;
        this.manv=manv;
    }
    
    
    public String getNgaylap() {
        return ngaylap;
    }

    
    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    
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
     * @return the makh
     */
    public String getMakh() {
        return makh;
    }

    /**
     * @param makh the makh to set
     */
    public void setMakh(String makh) {
        this.makh = makh;
    }

    /**
     * @return the manv
     */
    public String getManv() {
        return manv;
    }

    /**
     * @param manv the manv to set
     */
    public void setManv(String manv) {
        this.manv = manv;
    }

    /**
     * @return the tongtien
     */
    public float getTongtien() {
        return tongtien;
    }

    /**
     * @param tongtien the tongtien to set
     */
    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    /**
     * @return the mahd
     */
    public int getMahd() {
        return mahd;
    }

    /**
     * @param mahd the mahd to set
     */
    public void setMahd(int mahd) {
        this.mahd = mahd;
    }
}
