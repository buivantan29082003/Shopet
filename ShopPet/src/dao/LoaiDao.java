/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Loai;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class LoaiDao {

    public ArrayList<Loai> getAll() {
        ArrayList<Loai> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getAll_loai()}");
            while (rs.next()) {
                list.add(new Loai(rs.getString("maloai"), rs.getString("tenloai"), rs.getString("ngaythem")));
            }
        } catch (SQLException e) {
        }jdbchelper.closeCon();
        return list;
    }
    
    public static ArrayList<Loai> getAll1() {
        ArrayList<Loai> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call selectLoaiAll()}");
            while (rs.next()) {
                list.add(new Loai(rs.getString("maloai"), rs.getString("tenloai")));
            }
        } catch (SQLException e) {
        }jdbchelper.closeCon();
        return list;
    }
    
    

    public boolean checkDelete(String s) {
        try {
            ResultSet rs = jdbchelper.query("{call checkDelete_loai(?)}", s);
            while (rs.next()) {
                return false;
            }
        } catch (SQLException e) {
        }jdbchelper.closeCon();
        return true;
    }
    
    
    public void deleteLoai(String ml){
            jdbchelper.update("{call delete_loai(?)}",ml);
    }
    
    
    public void update(Loai l){
        jdbchelper.update("{call update_loai (?,?)}",l.getMaLoai(),l.getTenLoai());
    }

    
    public void insert(Loai l) {
            jdbchelper.update("{call insert_loai(?,?)}", l.getMaLoai(), l.getTenLoai());
    }
}
