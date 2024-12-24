/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.jdbchelper.conn;
import entity.Chitiet;
import entity.Giong;
import entity.Pet;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class PetDaO {
    
    
    public ArrayList<Pet> getAll(int mag) {
        ArrayList<Pet> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getPetBy(?)}",mag);
            while (rs.next()) {
                list.add(new Pet(rs.getString("matc"),rs.getString("mausac"),rs.getString("ghichu"),rs.getFloat("kichthuoc"), rs.getInt("soluong"),rs.getInt("mag"), rs.getString("tiemngua"),rs.getFloat("gia"),rs.getString("teng"),rs.getString("hinhanh")));
            }
        } catch (Exception e) {
        }
        jdbchelper.closeCon();
        return list;
    }
    
    
     public ArrayList<Pet> UpdateTing(){
        ArrayList<Pet> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getAll_pet()}");
            while (rs.next()) {
                list.add(new Pet(rs.getString("matc"),rs.getFloat("gia"),rs.getInt("mag"),""));
            }
        } catch (Exception e) {
        }
        jdbchelper.closeCon();
        return list;
    }
     
     
    public ArrayList<Chitiet> UpdateGiong(){
        ArrayList<Chitiet> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getAll_Giong_Khuyenmai()}");
            while (rs.next()) {
                list.add(new Chitiet(rs.getInt("mag"),rs.getInt("phantram")));
            }
        } catch (Exception e) {
        }
        jdbchelper.closeCon();
        return list;
    }
   
    
    
    public ArrayList<Pet> getKm(){
        ArrayList<Pet> list = new ArrayList<>();
        try {
            ResultSet rs = jdbchelper.query("{call getTcKm()}");
            while (rs.next()) {
                list.add(new Pet(rs.getString("matc"),rs.getFloat("gia"),rs.getInt("soluong"),rs.getFloat("giagiam")));
            }
        } catch (Exception e) {
            
        }
        jdbchelper.closeCon();
        return list;
    }
    
    
    
    public void insertPet(Pet p){
        jdbchelper.update("{call insert_Pet(?,?,?,?,?,?,?,?)}",p.getMausac(),p.getKichthuoc(),p.getTiemngua(),p.getSoluong(),
                p.getGia(),p.getGhichu(),p.getMag(),p.getHinhanh());
    }
    
    
    public void deletePet(String map){
        jdbchelper.update("{call delete_Pet(?)}",map);
    }
    
    
    public void update_Pet(Pet p){
        jdbchelper.update("{call update_Pet(?,?,?,?,?,?,?,?,?)}",p.getMatc(),p.getMausac(),p.getKichthuoc(),p.getTiemngua(),p.getSoluong(),
                p.getGia(),p.getGhichu(),p.getMag(),p.getHinhanh());
    }
}
