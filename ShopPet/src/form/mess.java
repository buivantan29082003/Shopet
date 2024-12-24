/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class mess {
    public static void mess(JFrame j,String mess){
        JOptionPane.showMessageDialog(j, mess);
    }
    public static void mess(JDialog j,String mess){
        JOptionPane.showMessageDialog(j, mess);
    }
    
    
}
