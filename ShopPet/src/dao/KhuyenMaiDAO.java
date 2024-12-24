/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Giong;
import entity.KhuyenMai;
import entity.Loai;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class KhuyenMaiDAO {

    public ArrayList<KhuyenMai> getAll() {
        ArrayList<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getAll_km()}");
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getString("makm"), rs.getString("ngaybd"), rs.getString("ngaykt"), rs.getString("phantram")));
            }
        } catch (SQLException e) {
        }jdbchelper.closeCon();
        return list;
    }
    

    public int insert(KhuyenMai k) {
        try {
            int kq = jdbchelper.update("{call insert_km(?,?,?,?)}", k.getMakm(), Float.parseFloat(k.getPhantram()), k.getNgaykt(), k.getNgaybd());
            return kq;
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

    public void delete(String makm) {
        try {
            jdbchelper.update("{call delete_km(?)}", makm);
        } catch (Exception e) {
        }
    }

    public int update(KhuyenMai k) {
        int i = -1;
        try {
            i = jdbchelper.update("{call update_km(?,?,?,?)}", k.getMakm(), k.getPhantram(), k.getNgaybd(), k.getNgaykt());
        } catch (Exception e) {
        }
        return i;
    }
}
