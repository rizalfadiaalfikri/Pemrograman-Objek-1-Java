/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;

/**
 *
 * @author ASUS
 */
public class MenuTambah extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuTambah
     */
    public MenuTambah() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_uts1 = new javax.swing.JLabel();
        txt_uts1 = new javax.swing.JTextField();
        lbl_nilai_uts1 = new javax.swing.JLabel();
        txt_nilai_uts1 = new javax.swing.JTextField();
        lbl_nim = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        lbl_nama1 = new javax.swing.JLabel();
        txt_nama1 = new javax.swing.JTextField();
        lbl_jenis_kelamin = new javax.swing.JLabel();
        rb_laki_laki = new javax.swing.JRadioButton();
        rb_perempuan = new javax.swing.JRadioButton();
        lbl_notelpn = new javax.swing.JLabel();
        txt_notelpn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        lbl_alamat = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JTextField();
        lbl_kelas = new javax.swing.JLabel();
        chb_pertemuan6 = new javax.swing.JCheckBox();
        lbl_mata_kuliah = new javax.swing.JLabel();
        cmb_mata_kuliah = new javax.swing.JComboBox<>();
        chb_pertemuan7 = new javax.swing.JCheckBox();
        chb_pertemuan1 = new javax.swing.JCheckBox();
        lbl_absen = new javax.swing.JLabel();
        chb_pertemuan2 = new javax.swing.JCheckBox();
        chb_pertemuan3 = new javax.swing.JCheckBox();
        chb_pertemuan4 = new javax.swing.JCheckBox();
        lbl_nilai_uts = new javax.swing.JLabel();
        txt_nilai_uts = new javax.swing.JTextField();
        lbl_nilai_uts2 = new javax.swing.JLabel();
        txt_nilai_uas = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        lbl_nilai_tugas = new javax.swing.JLabel();
        txt_nilai_tugas = new javax.swing.JTextField();

        lb_uts1.setText("Nilai UTS");

        txt_uts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uts1ActionPerformed(evt);
            }
        });

        lbl_nilai_uts1.setText("Nilai UTS");

        lbl_nim.setText("NIM");

        lbl_nama1.setText("Nama");

        lbl_jenis_kelamin.setText("Jenis kelamin");

        rb_laki_laki.setText("Laki - Laki");
        rb_laki_laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_laki_lakiActionPerformed(evt);
            }
        });

        rb_perempuan.setText("Perempuan");
        rb_perempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_perempuanActionPerformed(evt);
            }
        });

        lbl_notelpn.setText("No Telpn");

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        lbl_alamat.setText("Alamat");

        lbl_kelas.setText("Kelas");

        chb_pertemuan6.setText("Pertemuan 5");
        chb_pertemuan6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_pertemuan6ActionPerformed(evt);
            }
        });

        lbl_mata_kuliah.setText("Matakuliah");

        cmb_mata_kuliah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algoritma", "Database", "Java", "Pemrograman Visual" }));

        chb_pertemuan7.setText("Pertemuan 6");
        chb_pertemuan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_pertemuan7ActionPerformed(evt);
            }
        });

        chb_pertemuan1.setText("Pertemuan 1");
        chb_pertemuan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_pertemuan1ActionPerformed(evt);
            }
        });

        lbl_absen.setText("Absen");

        chb_pertemuan2.setText("Pertemuan 2");
        chb_pertemuan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_pertemuan2ActionPerformed(evt);
            }
        });

        chb_pertemuan3.setText("Pertemuan 3");
        chb_pertemuan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_pertemuan3ActionPerformed(evt);
            }
        });

        chb_pertemuan4.setText("Pertemuan 4");
        chb_pertemuan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_pertemuan4ActionPerformed(evt);
            }
        });

        lbl_nilai_uts.setText("Nilai UTS");

        lbl_nilai_uts2.setText("Nilai UAS");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        lbl_nilai_tugas.setText("Nilai Tugas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_kelas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbl_alamat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_notelpn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_notelpn, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbl_jenis_kelamin)
                                .addGap(18, 18, 18)
                                .addComponent(rb_laki_laki, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(rb_perempuan))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nim)
                                    .addComponent(lbl_nama1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nama1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nilai_uts2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nilai_uas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nilai_uts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nilai_uts, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_mata_kuliah)
                            .addComponent(lbl_absen)
                            .addComponent(lbl_nilai_tugas))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_nilai_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmb_mata_kuliah, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chb_pertemuan1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chb_pertemuan6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(chb_pertemuan3)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(chb_pertemuan2)
                                                .addGap(1, 1, 1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(chb_pertemuan7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(chb_pertemuan4))))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nama1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_laki_laki)
                    .addComponent(rb_perempuan)
                    .addComponent(lbl_jenis_kelamin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_notelpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_notelpn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbl_alamat)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_kelas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_mata_kuliah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_mata_kuliah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_pertemuan1)
                    .addComponent(chb_pertemuan2)
                    .addComponent(lbl_absen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_pertemuan3)
                    .addComponent(chb_pertemuan4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_pertemuan6)
                    .addComponent(chb_pertemuan7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nilai_tugas)
                    .addComponent(txt_nilai_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nilai_uts)
                    .addComponent(txt_nilai_uts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nilai_uts2)
                    .addComponent(txt_nilai_uas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_batal)
                    .addComponent(btn_simpan))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_uts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_uts1ActionPerformed

    private void rb_laki_lakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_laki_lakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_laki_lakiActionPerformed

    private void rb_perempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_perempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_perempuanActionPerformed

    private void chb_pertemuan6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_pertemuan6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_pertemuan6ActionPerformed

    private void chb_pertemuan7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_pertemuan7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_pertemuan7ActionPerformed

    private void chb_pertemuan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_pertemuan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_pertemuan1ActionPerformed

    private void chb_pertemuan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_pertemuan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_pertemuan2ActionPerformed

    private void chb_pertemuan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_pertemuan3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_pertemuan3ActionPerformed

    private void chb_pertemuan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_pertemuan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_pertemuan4ActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        System.out.println("Ini dari button simpan");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_batalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JCheckBox chb_pertemuan1;
    private javax.swing.JCheckBox chb_pertemuan2;
    private javax.swing.JCheckBox chb_pertemuan3;
    private javax.swing.JCheckBox chb_pertemuan4;
    private javax.swing.JCheckBox chb_pertemuan6;
    private javax.swing.JCheckBox chb_pertemuan7;
    private javax.swing.JComboBox<String> cmb_mata_kuliah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_uts1;
    private javax.swing.JLabel lbl_absen;
    private javax.swing.JLabel lbl_alamat;
    private javax.swing.JLabel lbl_jenis_kelamin;
    private javax.swing.JLabel lbl_kelas;
    private javax.swing.JLabel lbl_mata_kuliah;
    private javax.swing.JLabel lbl_nama1;
    private javax.swing.JLabel lbl_nilai_tugas;
    private javax.swing.JLabel lbl_nilai_uts;
    private javax.swing.JLabel lbl_nilai_uts1;
    private javax.swing.JLabel lbl_nilai_uts2;
    private javax.swing.JLabel lbl_nim;
    private javax.swing.JLabel lbl_notelpn;
    private javax.swing.JRadioButton rb_laki_laki;
    private javax.swing.JRadioButton rb_perempuan;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_kelas;
    private javax.swing.JTextField txt_nama1;
    private javax.swing.JTextField txt_nilai_tugas;
    private javax.swing.JTextField txt_nilai_uas;
    private javax.swing.JTextField txt_nilai_uts;
    private javax.swing.JTextField txt_nilai_uts1;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JTextField txt_notelpn;
    private javax.swing.JTextField txt_uts1;
    // End of variables declaration//GEN-END:variables
}
