/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.student;
import motify.studentmotify;

/**
 *
 * @author TranTien
 */
public class HocVien extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    List<student> studentList = new ArrayList<>();
    
    /**
     * Creates new form HocVien
     */
    public HocVien() {
        initComponents();
        tableModel = (DefaultTableModel) tblStudent.getModel();
        showStudent();
        
    }
    
    public void showStudent() {
        studentList = studentmotify.findAll();
        // xoa du lieu
        tableModel.setRowCount(0);
        
        for (student s :studentList) {
            tableModel.addRow(new Object[] {
                tableModel.getRowCount() + 1, s.getName(), s.getPhone(), s.getAddress(), s.getBirthday(), s.getGender()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ipnBieudo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlbBieudo = new javax.swing.JLabel();
        jpnTrangchu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlbTrangchu = new javax.swing.JLabel();
        jpnHocvien = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jlbHocvien = new javax.swing.JLabel();
        jpnLophoc = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlbLophoc = new javax.swing.JLabel();
        jpnKhoahoc = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jlbKhoahoc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpnView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jlb_ten = new javax.swing.JLabel();
        jlb_diachi = new javax.swing.JLabel();
        jlb_bdate = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        txt_diachi = new javax.swing.JTextField();
        jDateChooser_BD = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jlb_add = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_gender1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Menu.setBackground(new java.awt.Color(38, 40, 55));
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(38, 40, 55));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\user_groups_50px.png")); // NOI18N
        jLabel1.setText("Management trainees");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 80));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jPanel_Menu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 80));

        ipnBieudo.setBackground(new java.awt.Color(38, 40, 55));
        ipnBieudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel3.setOpaque(true);
        ipnBieudo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jlbBieudo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbBieudo.setForeground(new java.awt.Color(255, 255, 255));
        jlbBieudo.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\statistics_50px.png")); // NOI18N
        jlbBieudo.setText(" Statistics");
        ipnBieudo.add(jlbBieudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 80));

        jPanel_Menu.add(ipnBieudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 330, 80));

        jpnTrangchu.setBackground(new java.awt.Color(38, 40, 55));
        jpnTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        jpnTrangchu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 153, 0));
        jLabel5.setOpaque(true);
        jpnTrangchu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jlbTrangchu.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbTrangchu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangchu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTrangchu.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\imac_50px.png")); // NOI18N
        jlbTrangchu.setText(" Main Screen");
        jlbTrangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbTrangchuMouseClicked(evt);
            }
        });
        jpnTrangchu.add(jlbTrangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 80));

        jPanel_Menu.add(jpnTrangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 330, 80));

        jpnHocvien.setBackground(new java.awt.Color(38, 40, 55));
        jpnHocvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 51, 51));
        jLabel7.setOpaque(true);
        jpnHocvien.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jlbHocvien.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbHocvien.setForeground(new java.awt.Color(255, 255, 255));
        jlbHocvien.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\user_location_50px.png")); // NOI18N
        jlbHocvien.setText(" Management trainees ");
        jpnHocvien.add(jlbHocvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 80));

        jPanel_Menu.add(jpnHocvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 330, 80));

        jpnLophoc.setBackground(new java.awt.Color(38, 40, 55));
        jpnLophoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(0, 153, 0));
        jLabel9.setOpaque(true);
        jpnLophoc.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jlbLophoc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbLophoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbLophoc.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\course_50px.png")); // NOI18N
        jlbLophoc.setText(" Class management");
        jlbLophoc.setToolTipText("");
        jpnLophoc.add(jlbLophoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 80));

        jPanel_Menu.add(jpnLophoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 330, 80));

        jpnKhoahoc.setBackground(new java.awt.Color(38, 40, 55));
        jpnKhoahoc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(0, 153, 0));
        jLabel11.setOpaque(true);
        jpnKhoahoc.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jlbKhoahoc.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jlbKhoahoc.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhoahoc.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\classroom_50px.png")); // NOI18N
        jlbKhoahoc.setText(" Course management ");
        jpnKhoahoc.add(jlbKhoahoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 80));

        jPanel_Menu.add(jpnKhoahoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 330, 80));

        jLabel6.setBackground(new java.awt.Color(0, 153, 0));
        jLabel6.setOpaque(true);
        jPanel_Menu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jLabel14.setBackground(new java.awt.Color(0, 153, 0));
        jLabel14.setOpaque(true);
        jPanel_Menu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jPanel3.setBackground(new java.awt.Color(38, 40, 55));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(0, 153, 0));
        jLabel15.setOpaque(true);
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 80));

        jLabel16.setBackground(new java.awt.Color(38, 40, 55));
        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\exit_50px.png")); // NOI18N
        jLabel16.setText("Log Out");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 80));

        jPanel_Menu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 330, 80));
        jPanel_Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 82, 340, 10));

        jPanel1.add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 670));

        jpnView.setBackground(new java.awt.Color(153, 153, 153));
        jpnView.setForeground(new java.awt.Color(255, 255, 255));
        jpnView.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        tblStudent.setBackground(new java.awt.Color(153, 153, 153));
        tblStudent.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma Hoc Vien", "Ten Hoc Vien", "So Dien Thoai", "Dia Chi", "Ngay Sinh", "Gioi Tinh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        jpnView.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 760, 290));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");
        jpnView.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_phone.setBackground(new java.awt.Color(153, 153, 153));
        txt_phone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(255, 255, 255));
        txt_phone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        jpnView.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 450, 30));

        jlb_ten.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlb_ten.setForeground(new java.awt.Color(255, 255, 255));
        jlb_ten.setText("FullName");
        jpnView.add(jlb_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jlb_diachi.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlb_diachi.setForeground(new java.awt.Color(255, 255, 255));
        jlb_diachi.setText("Address");
        jpnView.add(jlb_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jlb_bdate.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlb_bdate.setForeground(new java.awt.Color(255, 255, 255));
        jlb_bdate.setText("BirthDay");
        jpnView.add(jlb_bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txt_ten.setBackground(new java.awt.Color(153, 153, 153));
        txt_ten.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_ten.setForeground(new java.awt.Color(255, 255, 255));
        txt_ten.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenActionPerformed(evt);
            }
        });
        jpnView.add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 15, 450, 30));

        txt_diachi.setBackground(new java.awt.Color(153, 153, 153));
        txt_diachi.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_diachi.setForeground(new java.awt.Color(255, 255, 255));
        txt_diachi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_diachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diachiActionPerformed(evt);
            }
        });
        jpnView.add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 450, 30));

        jDateChooser_BD.setForeground(new java.awt.Color(153, 153, 153));
        jpnView.add(jDateChooser_BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 450, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\search_32px.png")); // NOI18N
        jLabel8.setText("Search");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jpnView.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, 40));

        jlb_add.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jlb_add.setForeground(new java.awt.Color(255, 255, 255));
        jlb_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\add_user_group_man_man_32px.png")); // NOI18N
        jlb_add.setText("Add ");
        jlb_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlb_addMouseClicked(evt);
            }
        });
        jpnView.add(jlb_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 100, 40));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\remove_32px.png")); // NOI18N
        jLabel18.setText("Delete");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jpnView.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 120, 40));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\uninstalling_updates_32px.png")); // NOI18N
        jLabel19.setText("Update");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jpnView.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 120, 40));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        jpnView.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_gender1.setBackground(new java.awt.Color(153, 153, 153));
        txt_gender1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_gender1.setForeground(new java.awt.Color(255, 255, 255));
        txt_gender1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gender1ActionPerformed(evt);
            }
        });
        jpnView.add(txt_gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 450, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\TranTien\\Desktop\\reset_32px.png")); // NOI18N
        jLabel20.setText("Reset");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jpnView.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 120, 40));

        jPanel1.add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 760, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbTrangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbTrangchuMouseClicked

    }//GEN-LAST:event_jlbTrangchuMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenActionPerformed

    private void txt_diachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diachiActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
       txt_ten.setText("");
       txt_phone.setText("");
       txt_diachi.setText("");
       txt_gender1.setText("");
       jDateChooser_BD.setDateFormatString("");
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jlb_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlb_addMouseClicked
        String name = txt_ten.getText();
        String address = txt_diachi.getText();
        String phone = txt_phone.getText();
        String gender = txt_gender1.getText();
        String birthday;
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        birthday = dateformat.format(jDateChooser_BD.getDate());
        student std = new student(name, phone, address, birthday, gender);
        studentmotify.insert(std);
        showStudent();
        
    }//GEN-LAST:event_jlb_addMouseClicked

    private void txt_gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gender1ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        int selectedIndex = tblStudent.getSelectedRow();
        if (selectedIndex >=0) {
            student std = studentList.get(selectedIndex);
            int option = JOptionPane.showConfirmDialog(this, "Do you want delete");
          //  System.out.println("option" + option);
          if (option == 0) {
              studentmotify.delete(std.getId_student());
              showStudent();
          }
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String input = JOptionPane.showInputDialog(this, "Enter fullname to search");
        if(input.length()>0) {
            studentList = studentmotify.findByFullName(input);
            tableModel.setRowCount(0);
            
              for (student s :studentList) {
            tableModel.addRow(new Object[] {
                tableModel.getRowCount() + 1, s.getName(), s.getPhone(), s.getAddress(), s.getBirthday(), s.getGender()
            });
        }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

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
            java.util.logging.Logger.getLogger(HocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HocVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ipnBieudo;
    private com.toedter.calendar.JDateChooser jDateChooser_BD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbBieudo;
    private javax.swing.JLabel jlbHocvien;
    private javax.swing.JLabel jlbKhoahoc;
    private javax.swing.JLabel jlbLophoc;
    private javax.swing.JLabel jlbTrangchu;
    private javax.swing.JLabel jlb_add;
    private javax.swing.JLabel jlb_bdate;
    private javax.swing.JLabel jlb_diachi;
    private javax.swing.JLabel jlb_ten;
    private javax.swing.JPanel jpnHocvien;
    private javax.swing.JPanel jpnKhoahoc;
    private javax.swing.JPanel jpnLophoc;
    private javax.swing.JPanel jpnTrangchu;
    private javax.swing.JPanel jpnView;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_gender1;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}