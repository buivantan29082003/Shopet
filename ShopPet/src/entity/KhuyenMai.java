

package entity;

import extendsion.Check;


public class KhuyenMai {
    private String makm,ngaybd,ngaykt,phantram;

    public KhuyenMai(String makm, String ngaybd, String ngaykt, String phantram) {
        this.makm = makm;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.phantram = phantram;
    }

    
    public String toString() {
        return makm+Check.s+phantram+Check.s+ngaybd+Check.s+ngaykt;
    }

    
    
    public String getMakm() {
        return makm;
    }

    
    public void setMakm(String makm) {
        this.makm = makm;
    }

    /**
     * @return the ngaybd
     */
    public String getNgaybd() {
        return ngaybd;
    }

    /**
     * @param ngaybd the ngaybd to set
     */
    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    /**
     * @return the ngaykt
     */
    public String getNgaykt() {
        return ngaykt;
    }

    /**
     * @param ngaykt the ngaykt to set
     */
    public void setNgaykt(String ngaykt) {
        this.ngaykt = ngaykt;
    }

    /**
     * @return the phantram
     */
    public String getPhantram() {
        return phantram;
    }

    /**
     * @param phantram the phantram to set
     */
    public void setPhantram(String phantram) {
        this.phantram = phantram;
    }

}
