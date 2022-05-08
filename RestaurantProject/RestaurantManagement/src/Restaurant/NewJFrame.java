/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Busra
 */
public class NewJFrame extends javax.swing.JFrame {
      public static int a=999;//odenen hesap global degisken tanimlandi.
       
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pp2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pp3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_centre = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        tf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        ts1 = new javax.swing.JCheckBox();
        ts3 = new javax.swing.JCheckBox();
        ts2 = new javax.swing.JCheckBox();
        ts4 = new javax.swing.JCheckBox();
        ts5 = new javax.swing.JCheckBox();
        ts6 = new javax.swing.JCheckBox();
        ts7 = new javax.swing.JCheckBox();
        p2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        jl8 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        jl9 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        jl10 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Restoran Yönetim Sistemi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        pp1.setBackground(new java.awt.Color(102, 102, 102));
        pp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Masa Ekle");

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );

        pp2.setBackground(new java.awt.Color(102, 102, 102));
        pp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Masa Sil");

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(27, 27, 27))
        );

        pp3.setBackground(new java.awt.Color(102, 102, 102));
        pp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseclicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseentered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseexited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Masa Görüntüle");

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(pp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        panel_centre.setLayout(new java.awt.CardLayout());

        p1.setBackground(new java.awt.Color(204, 204, 204));

        tf1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        tf1.setToolTipText("Masa no giriniz");
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Masa No");

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        cb1.setText("Mantı");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setText("Pide");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Toplam");

        cb3.setText("Kebap");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb4.setText("Kola");

        cb5.setText("Ayran");

        cb6.setText("Su");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("EKLE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ts1.setText("Türlü");

        ts3.setText("Çay");

        ts2.setText("Köfte");
        ts2.setPreferredSize(new java.awt.Dimension(63, 25));

        ts4.setText("Kahve");

        ts5.setText("Puding");

        ts6.setText("Baklava");

        ts7.setText("Sütlaç");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ts2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ts1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ts4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ts3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ts6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ts5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ts7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(162, 162, 162))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(102, 102, 102)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1)
                    .addComponent(cb4)
                    .addComponent(ts5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb5)
                        .addComponent(ts6))
                    .addComponent(cb2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb3)
                    .addComponent(cb6)
                    .addComponent(ts7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ts3)
                    .addComponent(ts1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ts2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ts4))
                .addGap(16, 16, 16)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        panel_centre.add(p1, "card2");

        p2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Masa no");

        combo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jl8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jl8.setText("Hesap");

        jl9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jl9.setText("Ödenen Tutar");

        jl10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jl10.setText("Para üstü");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Masa seç");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("ÖDE");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl9)
                            .addComponent(jl10))
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4))))
                        .addContainerGap())
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jl8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(75, 75, 75)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(279, 279, 279))))))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl8))
                .addGap(27, 27, 27)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl9)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl10))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panel_centre.add(p2, "card3");

        p3.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Dolu Masa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Masa", "Tutar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Urun", "Fiyat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("Menü");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panel_centre.add(p3, "card4");

        jPanel1.add(panel_centre, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseclicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseclicked
        if(evt.getSource()==pp1){
            p1.setVisible(true);
            p2.setVisible(false);
            p3.setVisible(false);
        }
        if(evt.getSource()==pp2){
            p1.setVisible(false);
            p2.setVisible(true);
            p3.setVisible(false);
        }
        if(evt.getSource()==pp3){
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(true);
        }
    }//GEN-LAST:event_mouseclicked

    private void mouseentered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseentered
         if(evt.getSource()==pp1){
            pp1.setBackground(new Color(100,100,200));
        }
        if(evt.getSource()==pp2){
            pp2.setBackground(new Color(100,100,200));
        }
        if(evt.getSource()==pp3){
            pp3.setBackground(new Color(100,100,200));
        }
    }//GEN-LAST:event_mouseentered

    private void mouseexited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseexited
        if(evt.getSource()==pp1){
            pp1.setBackground(new Color(102,102,102));
        }
        if(evt.getSource()==pp2){
            pp2.setBackground(new Color(102,102,102));
        }
        if(evt.getSource()==pp3){
            pp3.setBackground(new Color(102,102,102));
        }
    }//GEN-LAST:event_mouseexited





    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       int amount = 0;
       Object table=combo1.getSelectedItem();
       table=table.toString();
       Menu menu1=new Menu();//menu nesnesi tanimlanir
        Menu food1=new Food(30,"Mantı","Ana Yemek");//menudeki yemekler tanimlanir
        Menu food2=new Food(20,"Pide","Ana Yemek");
        Menu food3=new Food(40,"Kebap","Ana Yemek");
        Menu food4=new Food(40,"Türlü","Ana Yemek");
        Menu food5=new Food(40,"Kofte","Ana Yemek");
        Menu food6=new Food(20,"Puding","Tatli");
        Menu food7=new Food(30,"Baklava","Tatli");
        Menu food8=new Food(20,"Sutlac","Tatli");
        
        Menu beverage1=new Beverages(10,"Kola",200);//menudeki icecekler tanimlanir
        Menu beverage2=new Beverages(5,"Ayran",250);
        Menu beverage3=new Beverages(5,"Su",200);
        Menu beverage4=new Beverages(5,"Cay",200);
        Menu beverage5=new Beverages(15,"Kahve",200);
        menu1.addFood((Food) food1);
        menu1.addFood((Food) food2);
        menu1.addFood((Food) food3);
        menu1.addFood((Food) food4);
        menu1.addFood((Food) food5);
        menu1.addFood((Food) food6);
        menu1.addFood((Food) food7);
        menu1.addFood((Food) food8);
        menu1.addBeverage((Beverages) beverage1);
        menu1.addBeverage((Beverages) beverage2);
        menu1.addBeverage((Beverages) beverage3);
        menu1.addBeverage((Beverages) beverage4);
        menu1.addBeverage((Beverages) beverage5);
        
        if(cb1.isSelected()){//checkbox secildiginde menu classından secilenin fiyati get komudu ile getilir
           amount = (int) (amount + food1.getPrice());
       }
       if(cb2.isSelected()){
           amount = (int) (amount + food2.getPrice());
       }
       if(cb3.isSelected()){
           amount = (int) (amount + food3.getPrice());
       }
       if(ts1.isSelected()){
           amount = (int) (amount + food4.getPrice());
       }
       if(ts2.isSelected()){
           amount = (int) (amount + food5.getPrice());
       }
       if(ts5.isSelected()){
           amount = (int) (amount + food6.getPrice());
       }
       if(ts6.isSelected()){
           amount = (int) (amount + food7.getPrice());
       }
       if(ts7.isSelected()){
           amount = (int) (amount + food8.getPrice());
       }
       if(cb4.isSelected()){
           amount = (int) (amount + beverage1.getPrice());
       }
       if(cb5.isSelected()){
           amount = (int) (amount + beverage2.getPrice());
       }
       if(cb6.isSelected()){
           amount = (int) (amount + beverage3.getPrice());
       }
       if(ts3.isSelected()){
           amount = (int) (amount + beverage4.getPrice());
       }
       if(ts4.isSelected()){
           amount = (int) (amount + beverage5.getPrice());
       }
     tf1.setText(String.format("%d",amount));
      try{
             
                addAcc(amount,table.toString());
            
        }
        catch(Exception err){
            
            JOptionPane.showMessageDialog(null, "ERROR");
        }
     
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
          Object table1=combo2.getSelectedItem();
           table1=table1.toString();
           int remainder;
           try{
            
                showAcc(table1.toString());
                
        }
        catch(Exception err){
            
            JOptionPane.showMessageDialog(null, "ERROR");
        }
           if(a==999){
               JOptionPane.showMessageDialog(null, "This numbered table is not occupied.");
           }
           else{
               tf2.setText(String.format("%d",a));
           }
           
            
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Object table3=combo2.getSelectedItem();
           table3 = table3.toString();
          int remainder = Integer.parseInt(tf3.getText())-a;
            tf4.setText(String.format("%d",remainder));
           try{
             
                deleteAcc(table3.toString());
            
        }
        catch(Exception err){
            
            JOptionPane.showMessageDialog(null, "ERROR");
        }
           
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
         try
        {
            String host = "jdbc:derby://localhost:1527/host";
            String uName = "ebs";
            String uPass= "123";
            
            Connection con = DriverManager.getConnection(host,uName,uPass);
            Statement stmt = con.createStatement();
            
            String sqlkod = "SELECT * FROM DEPO";
            ResultSet rs=stmt.executeQuery(sqlkod);
            DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
               String table1= rs.getString("Table");
               String amount1=rs.getString("Amount");
               String DbDATA[]={table1,amount1};
               
               tblModel.addRow(DbDATA);
           }
            
        }
        
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    }//GEN-LAST:event_jButton3MouseClicked


    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try
        {
            String host = "jdbc:derby://localhost:1527/host";
            String uName = "ebs";
            String uPass= "123";
            
            Connection con = DriverManager.getConnection(host,uName,uPass);
            Statement stmt = con.createStatement();
            DefaultTableModel tblModel=(DefaultTableModel)jTable2.getModel();
            
            String sqlkod = "SELECT * FROM MENUM";
            ResultSet rs=stmt.executeQuery(sqlkod);
            while(rs.next()){
               String product= rs.getString("URUN");
               String price=rs.getString("FIYAT");
               String DbDATA2[]={product,price};
               
               tblModel.addRow(DbDATA2);
           }
            
        }
        
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
    }
    
    private void addAcc(int tutar, String masa){
        
        try
        {
            
            String host = "jdbc:derby://localhost:1527/host";
            String uName = "ebs";
            String uPass= "123";
            boolean flag=true;
            Connection con = DriverManager.getConnection(host,uName,uPass);
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM DEPO";
            ResultSet rs =stmt.executeQuery(query);
            
            while (rs.next()) {
                
                String table4 = rs.getString("MASA");
                int amount4 = Integer.parseInt(rs.getString("TUTAR"));
                if(table4.equals(masa)){// secilen masa veritabanında alınır
                     JOptionPane.showMessageDialog(null, "FULL");
                     flag=false;
                }
                
                
                             
            }
            if(flag){
                String sqlkod = String.format("INSERT INTO DEPO VALUES( '%s',%d)",masa,tutar);//masa ekleme 
            stmt.executeUpdate(sqlkod);
            JOptionPane.showMessageDialog(null, "Table added");
            }
            
        }
        
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Table didnt add");
        }
        
        
      
    }
     private void showAcc(String masa){
        String query = "SELECT * FROM DEPO";
        
        try {
            String host = "jdbc:derby://localhost:1527/host";
            String uName = "ebs";
            String uPass= "123";
            
            Connection con1 = DriverManager.getConnection(host,uName,uPass);
            Statement stmt = con1.createStatement();
            int remainder=0;
            ResultSet rs =stmt.executeQuery(query);
            
            while (rs.next()) {
                
                String table = rs.getString("MASA");
                int amount = Integer.parseInt(rs.getString("TUTAR"));
                if(table.equals(masa)){
                     System.out.println(amount);
                    a = amount;
                     
                }
                
                
                System.out.println("Table : " + table + " Amount: " + amount);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Could not see table");
        }
    
        
    }
    
      private void deleteAcc(String masa){
     
     
        try
        {
            String host = "jdbc:derby://localhost:1527/host";
            String uName = "ebs";
            String uPass= "123";
            
            Connection con1 = DriverManager.getConnection(host,uName,uPass);
            Statement stmt = con1.createStatement();
            
            
            
            String sqlkod1 = String.format("DELETE FROM DEPO WHERE MASA = ('%s')",masa);//secilen masa silinir
            stmt.executeUpdate(sqlkod1);
            JOptionPane.showMessageDialog(null, "Table deleted");
           
        }
        
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Table didnt delete");
        }
        
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jl10;
    private javax.swing.JLabel jl8;
    private javax.swing.JLabel jl9;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel panel_centre;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JCheckBox ts1;
    private javax.swing.JCheckBox ts2;
    private javax.swing.JCheckBox ts3;
    private javax.swing.JCheckBox ts4;
    private javax.swing.JCheckBox ts5;
    private javax.swing.JCheckBox ts6;
    private javax.swing.JCheckBox ts7;
    // End of variables declaration//GEN-END:variables
}

