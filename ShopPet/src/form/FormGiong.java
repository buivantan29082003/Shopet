
package form;
import dao.GiongDAO;
import dao.LoaiDao;
import entity.Giong;
import entity.Loai;
import extendsion.Check;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;



public class FormGiong extends javax.swing.JFrame {
    
    ArrayList<Loai> listl;
    ArrayList<Giong> list;
    GiongDAO gd=new GiongDAO();
    DefaultTableModel dt=Check.getTableMd(new String[]{"Mã giống","Tên giống","Nguồn gốc","Tập tính","Mã loại"});
    int id=-1;
    
    public FormGiong() {
        initComponents();
        this.setVisible(true);
        setDe();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    
    public void loadComBo(){
        DefaultComboBoxModel<String> comb= new DefaultComboBoxModel<>();;
        listl.forEach(v->{comb.addElement(v.getMaLoai()+" - "+v.getTenLoai());});
        com.setModel(comb);
    }
    
    public boolean checkContaintGiong(){
        return list.stream().filter(v->{
            if(!v.correct(listl.get(com.getSelectedIndex()).getMaLoai(),teng.getText())){
                mess.mess(this,"Giống này đã có trong danh sách,vui lòng nhập lại!!!");
                return false;
            } return true;
        }).toList().size()==1;
    }
    
    
    public boolean checkContaintGiongUpdate(){
        int mag=list.get(id).getMag();
        String a=listl.get(com.getSelectedIndex()).getMaLoai();
        for (Giong loai : list) {
            if(loai.getMag()!=mag){
                if(loai.getMaloai().equals(a)&&loai.getTeng().equalsIgnoreCase(teng.getText())){
                    mess.mess(this,"Giống này đã có trong danh sách,vui lòng nhập lại!!!");
                    return false; 
                }
            }
        }
        return true;
    }
    
    
    public void loadTable(){
        dt.setRowCount(0);
        list=gd.getAll();
        list.forEach(v->{
            dt.addRow(v.toString().split(Check.s));
        });
    }
    
    
    public Giong getInput(){
        return new Giong(teng.getText(), nguongoc.getText(),taptinh.getText(),listl.get(com.getSelectedIndex()).getMaLoai());
    }
    
    
    public boolean checkNull(){
        if(!Check.checkNull(teng.getText(),taptinh.getText(),nguongoc.getText())){
            mess.mess(this,"Vui lòng nhập đầy đủ thông tin !");
            return false;
        }
        return true;
    }
    
    
    public void setDe(){
        listl=new LoaiDao().getAll1();
        table.setModel(dt);
        loadTable();
        loadComBo();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        XemChiTiet = new javax.swing.JLabel();
        mag = new javax.swing.JTextField();
        teng = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taptinh = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nguongoc = new javax.swing.JTextArea();
        com = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/34.LOAI2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/27.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("GIỐNG");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("MÃ LOÀI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        LOGO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LOGO.setForeground(new java.awt.Color(0, 255, 255));
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/2.logopet.png"))); // NOI18N
        LOGO.setText("Pet Shop");
        getContentPane().add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("TẬP TÍNH");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("NGUỒN GỐC");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("TÊN GIỐNG");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("MÃ GIỐNG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/icons8-preview.gif"))); // NOI18N
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 40, 40));

        XemChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        XemChiTiet.setForeground(new java.awt.Color(255, 51, 0));
        XemChiTiet.setText("XEM KHUYẾN MÃI");
        XemChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XemChiTietMouseClicked(evt);
            }
        });
        getContentPane().add(XemChiTiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        mag.setEditable(false);
        getContentPane().add(mag, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 290, 30));
        getContentPane().add(teng, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 290, 30));

        taptinh.setColumns(20);
        taptinh.setRows(5);
        jScrollPane2.setViewportView(taptinh);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 290, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/31.LoaiPet.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1150, 210));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/27.jpg"))); // NOI18N
        jLabel10.setText("jLabel9");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 250));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/27.jpg"))); // NOI18N
        jLabel11.setText("jLabel9");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 440, 250));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgPet/27.jpg"))); // NOI18N
        jLabel12.setText("jLabel9");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 390, 250));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1200, 250));

        nguongoc.setColumns(20);
        nguongoc.setRows(5);
        jScrollPane3.setViewportView(nguongoc);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 290, 60));

        com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 290, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(31, 7, 80, 25);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 80, 80, 25);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 150, 80, 25);

        jButton4.setText("Làm mới");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 210, 80, 25);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 140, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public void clearForm(){
        Check.clearForm(mag,teng);
        Check.clearForm(taptinh,nguongoc);
        id=-1;
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!checkNull()||!checkContaintGiong()){
        }else{
            gd.insert(getInput());
            loadTable();
            clearForm();
            mess.mess(this,"Thêm thành công!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        id=table.getSelectedRow();
        loadTextField();
    }//GEN-LAST:event_tableMouseClicked

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(checkNull()&&checkContaintGiongUpdate()&&id!=-1){
            Giong k=getInput();
            k.setMag(list.get(id).getMag());k.setMaloai(list.get(id).getMaloai());
            gd.update(k);
            clearForm();
            loadTable();
            mess.mess(this,"Update thành công!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(id!=-1){
            gd.delete_giong(list.get(id).getMag());
            clearForm();
            loadTable();
            mess.mess(this,"Xóa thành công giống!!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void XemChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XemChiTietMouseClicked
        if(id!=-1){
            new chitietkhuyenmai(list.get(id).getMag());
        }
    }//GEN-LAST:event_XemChiTietMouseClicked

    public void loadTextField(){
        if(id!=-1){
            Giong k=list.get(id);
            mag.setText(String.valueOf(k.getMag()));
            teng.setText(k.getTeng());
            nguongoc.setText(k.getNguongoc());
            taptinh.setText(k.getDactinh());
            listl.stream().filter(v->v.getMaLoai()==k.getMaloai()).forEach(v->{ com.setSelectedItem(v.getMaLoai()+" - "+v.getTenLoai());
            });
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel XemChiTiet;
    private javax.swing.JComboBox<String> com;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mag;
    private javax.swing.JTextArea nguongoc;
    private javax.swing.JTable table;
    private javax.swing.JTextArea taptinh;
    private javax.swing.JTextField teng;
    // End of variables declaration//GEN-END:variables
}
