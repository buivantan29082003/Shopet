/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KhuyenMai;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class CTKMDAO {

    public void delete_ctkm(int mag, String makm) {
        jdbchelper.update("{call delete_ctkm(?,?)}", mag, makm);
    }

    public void add_ctkm(int mag, String makm) {
        jdbchelper.update("{call add_ctkm(?,?)}", mag, makm);
    }
    

    public ArrayList<KhuyenMai> getBymag(int mag) {
        ArrayList<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getKm_byGiong(?)}", mag);
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getString("makm"), rs.getString("ngaybd"), rs.getString("ngaykt"), rs.getString("phantram")));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return list;
    }
    

    public ArrayList<KhuyenMai> getBymag_not(int mag) {
        ArrayList<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getKm_byGiong_not(?)}", mag);
            while (rs.next()) {
                list.add(new KhuyenMai(rs.getString("makm"), rs.getString("ngaybd"), rs.getString("ngaykt"), rs.getString("phantram")));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return list;
    }

}
