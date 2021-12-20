/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rizalfadiaalfikri;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JDesktopPane;
/**
 *
 * @author ASUS
 */
public class MenuList extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormList
     */
    public MenuList() {
        initComponents();
        this.refreshData();
    }
    
    public void refreshData(){
        DefaultTableModel tableModel = (DefaultTableModel) datatable.getModel();
        
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        
        tableModel.addColumn("id");
        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Kelas");
        tableModel.addColumn("Mata Kuliah");
        tableModel.addColumn("Nilai Akhir");
        tableModel.addColumn("Nilai Indexs");
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Pertemuan10\\akademik.accdb");
            
            String sql = "SELECT * FROM nilai";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()) {
                String id = String.valueOf(result.getInt("ID"));
                String nim = result.getString("nim");
                String nama = result.getString("nama");
                String kelas = result.getString("kelas");
                String mata_kuliah = result.getString("mata_kuliah");
                String nilai_akhir = String.valueOf(result.getString("nilai_akhir"));
                String nilai_indeks = String.valueOf(result.getString("nilai_indeks"));
                
                String[] row = {id, nim, nama, kelas, mata_kuliah, nilai_akhir, nilai_indeks};
                tableModel.addRow(row);
            }
                
        }catch (Exception e) {
            System.out.println(e);
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

        data_table = new javax.swing.JScrollPane();
        datatable = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_detail = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        datatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"19402092", "Rizal Fadia Al Fikri", "SI-R41/19", "Pemrograman Java", "90", "A"},
                {null, null, null, "", null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Kelas", "Mata Kuliah", "Nilai Akhir", "Nilai Index"
            }
        ));
        data_table.setViewportView(datatable);

        btn_tambah.setBackground(new java.awt.Color(0, 240, 0));
        btn_tambah.setText("Tambah Data");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_refresh.setBackground(new java.awt.Color(255, 0, 255));
        btn_refresh.setText("Refresh Data");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_detail.setBackground(new java.awt.Color(0, 255, 255));
        btn_detail.setText("Detail Data");
        btn_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(255, 255, 0));
        btn_edit.setText("Edit Data");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setText("Delete Data");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(data_table, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_table, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_detail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailActionPerformed
        // TODO add your handling code here:
        int row = datatable.getSelectedRow();
        String detail_id = datatable.getModel().getValueAt(row, 0).toString();
        
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Pertemuan10\\akademik.accdb");
            
            String sql = "SELECT * FROM nilai Where id = " + detail_id;
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()) {
                String message = "";
                message += "================\n";
                message += "Detail Data\n";
                message += "================\n";
                message += "Id : " + String.valueOf(result.getInt("ID")) + "\n";
                message += "NIM : " + result.getString("nim") + "\n";
                message += "Nama : " + result.getString("nama") + "\n";
                message += "Jenis_kelamin : " + result.getString("jenis_kelamin") + "\n";
                message += "No Telp : " + result.getString("no_telp") + "\n";
                message += "Alamat : " + result.getString("alamat") + "\n";
                message += "Kelas : " + result.getString("kelas") + "\n";
                message += "Mata Kuliah : " + result.getString("mata_kuliah") + "\n";
                message += "Absen Pertemuan 1 : " + result.getString("absen_1") + "\n";
                message += "Absen Pertemuan 2 : " + result.getString("absen_2") + "\n";
                message += "Absen Pertemuan 3 : " + result.getString("absen_3") + "\n";
                message += "Absen Pertemuan 4 : " + result.getString("absen_4") + "\n";
                message += "Absen Pertemuan 5 : " + result.getString("absen_5") + "\n";
                message += "Absen Pertemuan 6 : " + result.getString("absen_6") + "\n";
                message += "Nilai Absen : " + String.valueOf(result.getInt("nilai_absen")) + "\n";
                message += "Nilai Tugas : " + String.valueOf(result.getInt("nilai_tugas")) + "\n";
                message += "Nilai UTS : " + String.valueOf(result.getInt("nilai_uts")) + "\n";
                message += "Nilai UAS : " + String.valueOf(result.getInt("nilai_uas")) + "\n";
                message += "Nilai Akhir : " + String.valueOf(result.getInt("nilai_akhir")) + "\n";
                message += "Nilai Indeks : " + String.valueOf(result.getString("nilai_indeks")) + "\n";
                
                JOptionPane.showMessageDialog(null, message,"Informaton",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_detailActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Edit Data","Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Delete Data","Information",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        JDesktopPane desktopPane = getDesktopPane();
        MenuTambah menuTambah = new MenuTambah();
        desktopPane.add(menuTambah);
        menuTambah.setVisible(true);
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        this.refreshData();
    }//GEN-LAST:event_btn_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_detail;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JScrollPane data_table;
    private javax.swing.JTable datatable;
    // End of variables declaration//GEN-END:variables

}