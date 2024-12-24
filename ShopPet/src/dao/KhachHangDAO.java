/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KhachHang;
import entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KhachHangDAO {

    public KhachHang GetKhhdct(String sdt) {
        ResultSet rs = jdbchelper.query("{call getKhByhdct(?)}", sdt);
        KhachHang nv = new KhachHang();
        try {
            while (rs.next()) {
                nv = new KhachHang(rs.getString("tenkh"));
            }
            return nv;
        } catch (Exception e) {
            System.out.println(e);
        }jdbchelper.closeCon();
        return null;
    }

    
    public ArrayList<KhachHang> getKhBy() {
        ArrayList<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getKhBy()}");
            while (rs.next()) {
                list.add(new KhachHang(rs.getString("sdt"), rs.getString("tenkh")));

            }
        } catch (Exception e) {
            System.out.println(e);
        }jdbchelper.closeCon();
        return list;
    }
}
