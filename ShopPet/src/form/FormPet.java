/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.GiongDAO;
import dao.PetDaO;
import entity.Giong;
import entity.Pet;
import extendsion.Check;
import extendsion.Ximage;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FormPet extends javax.swing.JFrame {

    ArrayList<Giong> listg = GiongDAO.getAll1();
    List<Pet> list ;
    PetDaO pd = new PetDaO();
    String path = "", matc = "";

    public FormPet() {
        initComponents();
        setDe();
    }

    public void loadComBo() {
    DefaultComboBoxModel l=new DefaultComboBoxModel<String>();
    DefaultComboBoxModel l1=new DefaultComboBoxModel<String>();
        listg.forEach(v->{
            l.addElement(v.getCom());
            l1.addElement(v.getCom());
        });
        com.setModel(l);
        mag.setModel(l1);
    }

    public void loadCard() {
        list = pd.getAll(listg.get(com.getSelectedIndex()).getMag());
        p1.removeAll();
        list.forEach(v -> {
            p1.add(ComponentItem.createCard(v, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    loadField(v);
                }
            }, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    deletePet(v.getMatc());
                }
            }));
        });
    }

    public void deletePet(String map) {
        pd.deletePet(map);
        loadCard();
    }

    public void loadField(Pet v) {
        mapet.setText(v.getMatc());
        mausac.setText(v.getMausac());
        kichtuoc.setValue(v.getKichthuoc());
        tiemngua.setText("" + v.getTiemngua());
        gia.setValue(v.getGia());
        soluong.setValue(v.getSoluong());
        ghichu.setText(v.getGhichu());
        mag.setSelectedItem(v.getTenloai());
        matc = v.getMatc();
    }

    public void setDe() {
        setVisible(true);
        loadCard();
        loadComBo();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mapet = new javax.swing.JTextField();
        mausac = new javax.swing.JTextField();
        soluong = new javax.swing.JSpinner();
        kichtuoc = new javax.swing.JSpinner();
        tiemngua = new javax.swing.JTextField();
        gia = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        ghichu = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mag = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        p1 = new javax.swing.JPanel();
        com = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        anh1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 51));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        LOGO.setText("Pet Shop");
        jPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("MÃ PET");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("MÀU SẮC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("KÍCH THƯỚC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("TIÊM NGỪA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("GIÁ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("SỐ LƯỢNG");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("GHI CHÚ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("MÃ GIỐNG");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        mapet.setEditable(false);
        jPanel1.add(mapet, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 430, -1));
        jPanel1.add(mausac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 430, -1));

        soluong.setModel(new javax.swing.SpinnerNumberModel(1, 0, 100, 1));
        soluong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(soluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 430, -1));

        kichtuoc.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(100.0f), Float.valueOf(1.0f)));
        kichtuoc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(kichtuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 430, -1));
        jPanel1.add(tiemngua, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 430, -1));

        gia.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(5.0E8f), Float.valueOf(1.0f)));
        gia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 430, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-reset-30.png"))); // NOI18N
        jButton2.setText("MỚI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-update-30.png"))); // NOI18N
        jButton3.setText("CẬP NHẬT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-add-30.png"))); // NOI18N
        jButton1.setText("THÊM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton3)
                .addGap(97, 97, 97)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(96, 96, 96))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(68, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 550, 60));

        ghichu.setColumns(20);
        ghichu.setRows(5);
        jScrollPane2.setViewportView(ghichu);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 430, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("THÚ CƯNG");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/22-staff-30.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1070, -1));

        mag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(mag, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 430, 30));

        p1.setLayout(new java.awt.GridLayout(10, 2));
        jScrollPane1.setViewportView(p1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 660, 550));

        com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        com.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comMouseClicked(evt);
            }
        });
        com.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comActionPerformed(evt);
            }
        });
        jPanel1.add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 310, -1));

        jButton4.setText("Chọn ảnh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        anh1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(anh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 430, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1280, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (checkNull()) {
            Pet n = getInput();
            n.setMatc(matc);
            pd.update_Pet(n);
            loadCard();
            p1.validate();
            p1.repaint();
            clearForm();
            mess.mess(this, "Update thành công!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comMouseClicked
        
    }//GEN-LAST:event_comMouseClicked

    private void comActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comActionPerformed
        loadCard();
        p1.validate();
        p1.repaint();
    }//GEN-LAST:event_comActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (checkNull()) {
            pd.insertPet(getInput());
            Ximage.save(path);
            loadCard();
            p1.validate();
            p1.repaint();
            mess.mess(this, "Thêm thành công !!!");
            clearForm();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public Pet getInput() {
        
        return new Pet(mapet.getText(), mausac.getText(), ghichu.getText(), (float) kichtuoc.getValue(), (int) soluong.getValue(),
                 (int) listg.get(mag.getSelectedIndex()).getMag(), tiemngua.getText(), (float) gia.getValue(), path);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser js = new JFileChooser();
        js.setFileFilter(new FileNameExtensionFilter("hinhanh", "jpg", "png"));
        js.setMultiSelectionEnabled(false);
        Ximage.x = js.showDialog(new JFrame(), "chon");
        Ximage.r = js.getSelectedFile();
        if (Ximage.r != null) {
            path = "src/logo/" + Ximage.r.getName();
            anh1.setText(path);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public boolean checkNull() {
        if (!Check.checkNull(mausac.getText(), tiemngua.getText())) {
            mess.mess(this, "Vui lòng nhập đầy đủ thông tin!!!");
            return false;
        }
        return true;
    }

    public void clearForm() {
        Check.clearForm(mausac, tiemngua);
        Check.clearForm(ghichu);
        matc = "";
    }

    public static void main(String args[]) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel anh1;
    private javax.swing.JComboBox<String> com;
    private javax.swing.JTextArea ghichu;
    private javax.swing.JSpinner gia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner kichtuoc;
    private javax.swing.JComboBox<String> mag;
    private javax.swing.JTextField mapet;
    private javax.swing.JTextField mausac;
    private javax.swing.JPanel p1;
    private javax.swing.JSpinner soluong;
    private javax.swing.JTextField tiemngua;
    // End of variables declaration//GEN-END:variables
}
