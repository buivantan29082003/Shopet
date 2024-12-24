
package entity;

import extendsion.Check;


public class Loai {

    private String maLoai;
    private String tenLoai;
    private String ngayThem;
    
    
    public Loai(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }
    
    
    public Loai(String maLoai, String tenLoai, String ngaythem) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.ngayThem = ngaythem;
    }

    
    public String toString() {
        return maLoai+Check.s+tenLoai+Check.s+getNgayThem();
    }
    
    
    public String getMaLoai() {
        return maLoai;
    }
    
    
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    
    
    public String getNgayThem() {
        return ngayThem;
    }

    
    public void setNgayThem(String ngayThem) {
        this.ngayThem = ngayThem;
    }

}
