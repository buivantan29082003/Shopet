/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entity.Pet;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class jdbchelper {
    static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    static  String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=shop_pet;"
                    + "user=sa;"
                    + "password=1234@Spdf;"
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
    static Connection  conn;
    static{
        try {
            Class.forName(driver);
       } catch (Exception e) {
            System.out.println("jdbc helper:"+e);
        }
    }
    
    public static void GetMetaDtata() throws SQLException{
        conn=DriverManager.getConnection(connectionUrl);
        DatabaseMetaData m=conn.getMetaData();
        System.out.println(m.supportsBatchUpdates());
    }
    
    public static void addBatchQurey(ArrayList<Pet> list,int mahd){
        try {
            conn=DriverManager.getConnection(connectionUrl);
            conn.setAutoCommit(false);
            PreparedStatement p=conn.prepareCall("{call insert_cthd(?,?,?,?)}");
            for (Pet pet : list) {
                p.setInt(1,mahd); p.setString(2,pet.getMatc());p.setFloat(3,pet.getGia());p.setInt(4,pet.getSoluong());
                p.addBatch();
            }
            
            p.executeBatch();
            conn.commit();
            p.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void UpdateTinBatch(ArrayList<Pet> list){
        try {
            conn=DriverManager.getConnection(connectionUrl);
            conn.setAutoCommit(false);
            PreparedStatement p=conn.prepareCall("{call Updategia(?,?)}");
            for (Pet pet : list) {
                p.setString(1,pet.getMatc()); p.setFloat(2,pet.getGia());
                p.addBatch();
            }
            p.executeBatch();
            conn.commit();
            p.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static PreparedStatement getStmt(String sql,Object...args){
        
            PreparedStatement stmt = null;
        try {
            conn=DriverManager.getConnection(connectionUrl);
            if(sql.trim().startsWith("{")){
                stmt=conn.prepareCall(sql);
            }else{
                stmt=conn.prepareStatement(sql);
            }
            for (int i= 0;i<args.length; i++) {
                stmt.setObject(i+1,args[i]);
            }
        } catch (Exception e) {
            return null;
        }
        return stmt;
    }
    
    
    public static ResultSet query(String sql,Object...args){
        try {
            PreparedStatement stmt=jdbchelper.getStmt(sql,args);
            return stmt.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
    public static Object value(String sql,Object...args){
        try {
            ResultSet rs=jdbchelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static int update(String sql,Object...args){
        try {
            PreparedStatement stmt=jdbchelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            System.out.println("jdbc helper "+e);
            return -1;
        }
    }
    
    public static void closeCon(){
        try {
            conn.close();
        } catch (Exception e) {
        }
    }
//    public static void main(String[] args) throws SQLException {
//        ResultSet rs=jdbchelper.query("{call getBy_km(?)}","km2");
//        while(rs.next()){
//            System.out.println(rs.getString("makm")+"-"+rs.getFloat("phantram"));
//        }
//    }

  public static void main(String[] args){
      ArrayList<Pet> list=new PetDaO().getAll(6);
//      jdbchelper.addBatchQurey(list);
    }
}
