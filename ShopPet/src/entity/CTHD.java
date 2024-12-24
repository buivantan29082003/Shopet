package entity;

import extendsion.Check;

public class CTHD {

    private float gia;
    private int sl;
    private String map;

    public CTHD(float gia, int sl, String map) {
        this.gia = gia;
        this.sl = sl;
        this.map = map;
    }

    
    public String toString() {
        return map + Check.s + gia + Check.s + sl + Check.s;
    }

    
    public float getGiá() {
        return gia;
    }

    
    public void setGiá(float giá) {
        this.gia = giá;
    }

    
    public int getSl() {
        return sl;
    }

    
    public void setSl(int sl) {
        this.sl = sl;
    }

    
    public String getMap() {
        return map;
    }

    
    public void setMap(String map) {
        this.map = map;
    }
}
