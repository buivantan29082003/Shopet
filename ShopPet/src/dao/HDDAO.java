/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Auth;
import java.sql.*;
import entity.HoaDon;
import java.util.ArrayList;

public class HDDAO {

    public ArrayList<HoaDon> getAll() {
        ArrayList<HoaDon> list = new ArrayList<>();
        ResultSet rs = jdbchelper.query("{call selectAllHd()}");
        try {
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt("mahd"), rs.getString("ngaylap"), rs.getString("makh"), rs.getString("manv"), rs.getFloat("tongtien"), rs.getString("ghichu")));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return list;
    }

    
    public void deleteBill(int mahd) {
        jdbchelper.update("{call delete_Bill(?)}", mahd);
    }

    
    public void createBill(String makh) {
        jdbchelper.update("{call create_bill(?,?)}", makh, Auth.user.getMaNv());
    }

    
    public HoaDon getTopBill() {
        ResultSet rs = jdbchelper.query("{call getTopBill()}");
        try {
            while (rs.next()) {
                return new HoaDon(rs.getInt("mahd"), rs.getString("makh"), rs.getString("manv"));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return null;
    }

}
