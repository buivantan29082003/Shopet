/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.NhanVienDAO;
import dao.PetDaO;
import dao.jdbchelper;
import entity.Chitiet;
import entity.Pet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;



class UpdateAfterDay{
    ArrayList<Pet> lp=new ArrayList<>();
    ArrayList<Chitiet> lg=new ArrayList<>();
    float gia;
    public UpdateAfterDay() {
        lp=new PetDaO().UpdateTing();
        lg=new PetDaO().UpdateGiong();
    }
    
    public void Updating() {
      lp.forEach(v1->{ 
          gia=v1.getGia();
          lg.stream().filter(v->v.getMag()==v1.getMag()).forEach(v->{
              gia=(gia*(1- ((float)v.getPhantram())/100));
          });
          v1.setGia(gia);
      });
       jdbchelper.UpdateTinBatch(lp);
    }
}

public class FormHiPet extends javax.swing.JFrame {

   
    
    public FormHiPet() {
        initComponents();
        new UpdateAfterDay().Updating();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackG = new javax.swing.JPanel();
        lblPetDouble = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loadingValue = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        BGimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackG.setBackground(new java.awt.Color(0, 255, 255));
        BackG.setPreferredSize(new java.awt.Dimension(900, 500));
        BackG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPetDouble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/4.hiPet.gif"))); // NOI18N
        lblPetDouble.setText("jLabel1");
        BackG.add(lblPetDouble, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 310, 260));

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/5like.png"))); // NOI18N
        line.setText("jLabel1");
        BackG.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 360, 30));

        loadingBar.setBackground(new java.awt.Color(255, 255, 204));
        BackG.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, 710, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Welcome to Pet Shop!!");
        BackG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 410, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        jLabel2.setText("Pet Shop");
        BackG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        loadingValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loadingValue.setForeground(new java.awt.Color(204, 0, 0));
        loadingValue.setText("0 %");
        BackG.add(loadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        loading.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 0, 102));
        loading.setText("Loading...");
        BackG.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, -1));

        BGimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/3.BackGround.jpg"))); // NOI18N
        BGimg.setText("jLabel1");
        BackG.add(BGimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackG, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackG, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        FormHiPet pt = new FormHiPet();
        pt.setVisible(true);
        try {
            for (int i = 0; i <= 100; i+=11) {
                Thread.sleep(100);
                pt.loadingValue.setText(i + "%");

                if (i == 10) {
                    pt.loading.setText("Turning on Modules...");
                }
                if (i == 20) {
                    pt.loading.setText("Loading Modules...");
                }
                if (i == 50) {
                    pt.loading.setText("Connecting to Database...");
                }
                if (i == 70) {
                    pt.loading.setText("Connection Successfull !!...");
                }
                if (i == 80) {
                    pt.loading.setText("Launching Aplication...");
                }
                pt.loadingBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        pt.dispose();
       new FormLogin(pt, true).setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGimg;
    private javax.swing.JPanel BackG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPetDouble;
    private javax.swing.JLabel line;
    private javax.swing.JLabel loading;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingValue;
    // End of variables declaration//GEN-END:variables
}
