/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package form;

import dao.NhanVienDAO;
import entity.Auth;
import entity.NhanVien;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class FormLogin extends javax.swing.JDialog {

    NhanVienDAO nvd = new NhanVienDAO();

    public FormLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tenDn.setBackground(new java.awt.Color(0, 0, 0, 1));
        MatKhau.setBackground(new java.awt.Color(0, 0, 0, 1));
        setLocationRelativeTo(null);
    }

    public boolean checkNull() {
        if (tenDn.getText().equals("") || MatKhau.getText().equals("")) {
            clickSound.SoundErro();
            mess.mess(this, "Vui lòng nhập đầy đủ thông tin");
            return false;
        }
        return true;
    }

    public void dangNhap() {
        NhanVien nv = nvd.selectBy(tenDn.getText());
        if (nv == null) {
            clickSound.SoundErro();
            JOptionPane.showMessageDialog(this, "Mã nhân viên không tồn tại, vui lòng nhập lại...");
        } else if (!String.valueOf(MatKhau.getPassword()).equals(nv.getMatKhau())) {
            if (JOptionPane.showConfirmDialog(this, "Mật khẩu sai,Bạn quên mật khẩu ?") == 0) {
                this.dispose();
            }
        } else {
            this.dispose();
            new FormHomePet();
            Auth.user = nv;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgMain = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dauX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        btnDn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tenDn = new javax.swing.JTextField();
        MatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        imgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/5.login.gif"))); // NOI18N
        imgMain.setText("jLabel1");

        logo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 51, 51));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        logo.setText("Pet Shop");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("GOOD A DAY!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imgMain, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(67, 67, 67)
                .addComponent(imgMain, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 520));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dauX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/9.ICONX.png"))); // NOI18N
        dauX.setText("jLabel3");
        dauX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dauX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dauXMouseClicked(evt);
            }
        });
        jPanel2.add(dauX, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 470, 49));

        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HELLO! LET'S GET STARTED!!");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, 458, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("USERNAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 192, -1, -1));

        ten.setForeground(new java.awt.Color(0, 204, 204));
        ten.setText("___________________________________________________________________");
        ten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 226, 331, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/7.avt.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 29, 55));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("PASSWORD");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("___________________________________________________________________");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 304, 331, 30));

        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/6.hidepass.png"))); // NOI18N
        hidepass.setText("jLabel6");
        hidepass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel2.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 29, 55));

        showpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/6passShow.png"))); // NOI18N
        showpass.setText("jLabel6");
        showpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 29, 55));

        btnDn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDn.setForeground(new java.awt.Color(0, 204, 204));
        btnDn.setText("LOGIN");
        btnDn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDnActionPerformed(evt);
            }
        });
        jPanel2.add(btnDn, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 405, 378, 45));

        jLabel10.setText("FORGET PASSWORD?");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        tenDn.setText("nv01");
        tenDn.setBorder(null);
        jPanel2.add(tenDn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 212, 320, 30));

        MatKhau.setFont(MatKhau.getFont());
        MatKhau.setText("1234567");
        MatKhau.setBorder(null);
        jPanel2.add(MatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 320, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 470, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dauXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dauXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_dauXMouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        MatKhau.setEchoChar((char) 0);
        hidepass.setVisible(false);
        hidepass.setEnabled(false);
        showpass.setEnabled(true);
        showpass.setEnabled(false);
    }//GEN-LAST:event_hidepassMouseClicked

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        MatKhau.setEchoChar((char) 8226);
        hidepass.setVisible(true);
        hidepass.setEnabled(true);
        showpass.setEnabled(false);
        showpass.setEnabled(false);
    }//GEN-LAST:event_showpassMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            //xuat hien do mo ao
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDnActionPerformed
        if(checkNull()){
            dangNhap();
        }
    }//GEN-LAST:event_btnDnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormLogin dialog = new FormLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField MatKhau;
    private javax.swing.JButton btnDn;
    private javax.swing.JLabel dauX;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel imgMain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel showpass;
    private javax.swing.JLabel ten;
    private javax.swing.JTextField tenDn;
    // End of variables declaration//GEN-END:variables
}
