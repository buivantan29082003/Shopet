/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Giong;
import java.util.ArrayList;
import java.sql.*;

public class GiongDAO {

    public ArrayList<Giong> getAll() {
        ArrayList<Giong> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call selectAll_giong}");
            while (rs.next()) {
                list.add(new Giong(Integer.parseInt(rs.getString("mag")), rs.getString("teng"), rs.getString("nguongoc"), rs.getString("dactinh"), rs.getString("maloai")));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return list;
    }

    
    public static ArrayList<Giong> getAll1() {
        ArrayList<Giong> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call selectGiongAllpet}");
            while (rs.next()) {
                list.add(new Giong(Integer.parseInt(rs.getString("mag")), rs.getString("teng")));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return list;
    }

    
    public void insert(Giong k) {
        jdbchelper.update("{call insert_giong_1(?,?,?,?)}", k.getTeng(), k.getNguongoc(), k.getDactinh(), k.getMaloai());
       
    }

    public void update(Giong k) {
            jdbchelper.update("{call update_giong(?,?,?,?)}", k.getTeng(), k.getNguongoc(), k.getDactinh(), k.getMag());
    }
    

    public void delete_giong(int mag) {
        jdbchelper.update("{call delete_giong(?)}", mag);
    }

}
