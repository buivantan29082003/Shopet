/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.*;
import entity.NhanVien;
import java.awt.List;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JFrame;

public class NhanVienDAO{

    
    public NhanVien getNvcthd(String manv){
       ResultSet rs=jdbchelper.query("{call getNvBycthd(?)}",manv);
       NhanVien nv=new NhanVien();
        try {
            while(rs.next()){
                System.out.println("dat");
                nv=new NhanVien(rs.getString("tennv"));
            }
            return nv;
        } catch (Exception e) {
        }
        jdbchelper.closeCon();
        return null;
    }
   
    
    public void insert(NhanVien nv) {
        jdbchelper.update("{call insert_nhanvien(?,?,?,?,?,?)}",nv.getMaNv(),nv.getTenNv(),nv.getMatKhau(),nv.getVaiTro(),nv.getEmail(),nv.getHinhanh());
    }

    public int delete_nhanvien(String manv){
        return jdbchelper.update("{call delete_nhanvien(?)}",manv);
    }


    public void update(NhanVien nv) {
        jdbchelper.update("{call update_nhanvien(?,?,?,?)}",nv.getTenNv(),nv.getEmail(),nv.getMaNv(),nv.getHinhanh());
    }

    
    
    public NhanVien selectBy(String id) {
        ArrayList<NhanVien> list = this.selectBySql("{call getNvBy(?)}",id);
        if (list.isEmpty()){
            return null;
        }
        jdbchelper.closeCon();
        return list.get(0);
    }
    

    public ArrayList<NhanVien> selectAll() {
        ArrayList<NhanVien> list=new ArrayList<>();
        try {
            ResultSet rs=jdbchelper.query("{call getAll_nhanvien()}");
            while (rs.next()) {                
                list.add(new NhanVien(rs.getString("manv"),
                        rs.getString("tennv"),rs.getString("matkhau"), rs.getInt("vaitro"),rs.getString("email"),rs.getString("hinhanh")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        jdbchelper.closeCon();
        return list;
    }
    
    
    protected ArrayList<NhanVien> selectBySql(String sql, Object... args) {
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query(sql, args);
            while (rs.next()) {
                list.add(new NhanVien(rs.getString("manv"), rs.getString("tennv"), rs.getString("matkhau"), rs.getInt("vaitro"), rs.getString("email")));
            }
            jdbchelper.conn.close();
        } catch (Exception e) {
            return list;
        }
        jdbchelper.closeCon();
        return list;
    }

}
