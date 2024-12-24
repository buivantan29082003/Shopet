/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extendsion;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Check {
    public static String s="<><>";
    public static boolean checkNull(String...t){
        for (String string : t) {
            if(string.equals("")){
                return false;
            }
        }return true;
    }
    public static DefaultTableModel getTableMd(String[] s){
        DefaultTableModel dt=new DefaultTableModel();
        dt.setColumnCount(0);
        for (String string : s) {
            dt.addColumn(string);
        }
        return dt;
    }
    
    public static void clearForm(JTextField...s){
        for (JTextField st : s) {
            st.setText("");
        }
    }
     public static void clearForm(JTextArea...s){
        for (JTextArea st : s) {
            st.setText("");
        }
    }
    
    public static boolean checkNumber(String...s){
        for (String st : s) {
            try {
                Float.parseFloat(st);
            }catch (Exception e) {
                return false;
            }
        }
        return true;
    }

}
