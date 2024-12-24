/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.CTHD;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author ADMIN
 */
public class CthdAO {

    public ArrayList<CTHD> getBy(int mahd) {
        ArrayList<CTHD> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getCthdBy(?)}", mahd);
            while (rs.next()) {
                list.add(new CTHD(rs.getFloat("gia"), rs.getInt("soluong"), rs.getString("matc")));
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return list;
    }

    
    public float getUpdateCthd(int mahd, String map, int sl) {
        ResultSet a = jdbchelper.query("{call UpdateCthd(?,?,?)}", mahd, map, sl);
        try {
            while (a.next()) {
                return a.getFloat("tong");
            }
        } catch (Exception e) {
        }jdbchelper.closeCon();
        return 1;
    }
}
