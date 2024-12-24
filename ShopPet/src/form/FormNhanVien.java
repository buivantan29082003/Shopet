/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.NhanVienDAO;
import entity.NhanVien;
import extendsion.Check;
import extendsion.Ximage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class FormNhanVien extends javax.swing.JFrame {

    ArrayList<NhanVien> list;
    NhanVienDAO nvd = new NhanVienDAO();
    DefaultTableModel dt = Check.getTableMd(new String[]{"Mã nhân viên", "Tên nhân viên", "Vai trò", "Email", "Hình ảnh"});
    String path = "";
    int id = -1;

    public FormNhanVien() {
        initComponents();
        setDe();
        setVisible(true);
    }

    public void setDe() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        table.setModel(dt);
        loadTable();
    }

    public void loadList() {
        list = nvd.selectAll();
    }

    public void loadTable() {
        loadList();
        dt.setRowCount(0);
        list.forEach(v -> {
            dt.addRow(v.toString().split(Check.s));
        });
    }

    public boolean checPass() {
        if (matkhau.getText().length() < 7) {
            mess.mess(this, "Vui lòng nhập mật khẩu lớn hơn 6 kí tự");
            return false;
        }
        return true;
    }
    
    public NhanVien getInput() {
        return new NhanVien(manv.getText(), tennv.getText(), matkhau.getText(), getVaitro(), email.getText(), path);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LOGO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        manv = new javax.swing.JTextField();
        tennv = new javax.swing.JTextField();
        btnnv = new javax.swing.JRadioButton();
        btntp = new javax.swing.JRadioButton();
        anh = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        matkhau = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 0));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        LOGO.setText("Pet Shop");
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("MÃ NV");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("HỌ TÊN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("VAI TRÒ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Mật khẩu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jButton6.setText("<<");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 100, 30));

        jButton5.setText(">>");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 100, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-reset-30.png"))); // NOI18N
        jButton4.setText("MỚI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 120, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-delete-30.png"))); // NOI18N
        jButton3.setText("XÓA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 120, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-add-30.png"))); // NOI18N
        jButton2.setText("THÊM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 120, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-update-30.png"))); // NOI18N
        jButton1.setText("CẬP NHẬT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 390, 30));
        getContentPane().add(manv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 390, 30));
        getContentPane().add(tennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 390, 30));

        buttonGroup1.add(btnnv);
        btnnv.setForeground(new java.awt.Color(0, 255, 102));
        btnnv.setText("NHÂN VIÊN");
        getContentPane().add(btnnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        buttonGroup1.add(btntp);
        btntp.setForeground(new java.awt.Color(0, 255, 0));
        btntp.setText("QUẢN LÝ");
        getContentPane().add(btntp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/13.Pomeranian.jpg"))); // NOI18N
        anh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        anh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anhMouseClicked(evt);
            }
        });
        getContentPane().add(anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 160));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 900, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/34.LOAI2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1020, 260));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("EMAIL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));
        getContentPane().add(matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 390, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        id = table.getSelectedRow();
        loadField();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (checkNull() && checContaint() && checEmail() && checPass()) {
            nvd.insert(getInput());
            mess.mess(this, "Thêm thành công !!!");
            loadTable();
            Ximage.save(path);
            clearForm();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    

    public int getVaitro() {
        return btnnv.isSelected() ? 0 : 1;
    }

    private void anhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anhMouseClicked
        JFileChooser js = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("hinhanh", "jpg", "png");
        js.setFileFilter(fil);
        js.setMultiSelectionEnabled(false);
        Ximage.x = js.showDialog(new JFrame(), "chon");
        Ximage.r = js.getSelectedFile();
        if (Ximage.r != null) {
            path = "src/logo/" + Ximage.r.getName();
            anh.setIcon(new ImageIcon(Ximage.r.getAbsolutePath()));
        }
    }//GEN-LAST:event_anhMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (id > -1) {
            if (nvd.delete_nhanvien(list.get(id).getMaNv()) != -1) {
                clearForm();
                loadTable();
                mess.mess(this, "Xóa thành công !!!");
            }
        } else {
            mess.mess(this, "Không thể xóa nhân viên này!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (checkNullUpdate()&&id!=-1&&Validate.ValiDate.validateEmail(email.getText())) {
            NhanVien nv = list.get(id);
            nv.setUpdate(tennv.getText(),email.getText());
            if(!path.equals("")&&!path.equals(nv.getHinhanh())) {
                nv.setHinhanh(path);
                Ximage.save(path);
            }
            nvd.update(nv);
            clearForm();
            loadTable();
            mess.mess(this, "Update thành công");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean checkNullUpdate() {
        if (!Check.checkNull(tennv.getText(), email.getText())) {
            mess.mess(this, "Vui lòng điển tên và email để update nhân viên!!!");
            return false;
        }
        return true;
    }

    public boolean checEmail() {
        if (!Validate.ValiDate.validateEmail(email.getText().trim())) {
            mess.mess(this, "Vui lòng nhập email đúng định dạng!!!");
            return false;
        }
        return true;
    }

    public boolean checContaint() {
        for (NhanVien n : list) {
            if (n.getMaNv().equalsIgnoreCase(manv.getText())) {
                mess.mess(this, "Mã nhân viên này đã tồn tại vui lòng nhập khác!!!");
                return false;
            }
        }
        return true;
    }

    public boolean checkNull() {
        if (!Check.checkNull(manv.getText(), tennv.getText(), email.getText(), matkhau.getText())) {
            mess.mess(this, "Vui lòng điền đầy đủ thông tin");
            return false;
        }
        return true;
    }

    public void loadField() {
        if (id > -1) {
            NhanVien n = list.get(id);
            manv.setText(n.getMaNv());
            tennv.setText(n.getTenNv());
            email.setText(n.getEmail());
            loadVaitro(n.getVaitro());
            anh.setIcon(new ImageIcon(n.getHinhanh()));
        }
    }

    public void loadVaitro(int a) {
        if (a == 1) {
            btntp.setSelected(true);
        } else {
            btnnv.setSelected(true);
        }
    }

    public void clearForm() {
        Check.clearForm(manv, tennv, email, matkhau);
        path ="";
        anh.setIcon(new ImageIcon(path));
    }

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
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel anh;
    private javax.swing.JRadioButton btnnv;
    private javax.swing.JRadioButton btntp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manv;
    private javax.swing.JTextField matkhau;
    private javax.swing.JTable table;
    private javax.swing.JTextField tennv;
    // End of variables declaration//GEN-END:variables
}
