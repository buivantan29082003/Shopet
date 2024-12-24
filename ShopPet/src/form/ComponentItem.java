/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import entity.HoaDon;
import entity.Pet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.AncestorListener;

/**
 *
 * @author ADMIN
 */
public class ComponentItem {
    
    
//    public static JLabel createJlabel(Pet nv){
//        JLabel lb=new JLabel(new ImageIcon("src/logo/Screenshot 2023-08-05 202647.png"));
//        lb.setSize(1500,150);
//        return lb;
//    }
    
    public static JPanel createCard(Pet nv,ActionListener ac,ActionListener ac1){
        JLabel lb=new JLabel(new ImageIcon(nv.getHinhanh()));
        lb.setSize(1500,150);
        JPanel card=createPanel();
        card.setSize(300,300);
        card.add(lb,BorderLayout.NORTH);
        card.add(createButton(nv,ac,ac1),BorderLayout.PAGE_END);
        return card;
    }
    
    public static JPanel createPanel(){
        JPanel card=new JPanel(new BorderLayout());
        return card;
    }
    
    
    
    public static Panel createButton(Pet v,ActionListener ac,ActionListener ac1){
        Panel p=new Panel(new GridLayout(1,2));
        JButton btn=new JButton("Mã pet:  "+v.getMatc());
        btn.addActionListener(ac);
        JButton btn1=new JButton("Delete: "+v.getMatc());
        btn1.addActionListener(ac1);
        p.add(btn);
        p.add(btn1);
        return p;
    }
    
    
    public static JPanel cardAvoice(HoaDon h){
        JPanel p=new JPanel(new  GridLayout(1,6));
        JLabel l=new JLabel(""+h.getMahd()+"001");
        p.add(l);
        p.add(new JLabel(h.getManv()+"001"));
        p.add(new JLabel(h.getTongtien()+"1000"));
        p.add(new JLabel(h.getMakh()+"001"));
        p.add(new JLabel(h.getGhichu()+"001"));
        return p;
    }
    
    
}
