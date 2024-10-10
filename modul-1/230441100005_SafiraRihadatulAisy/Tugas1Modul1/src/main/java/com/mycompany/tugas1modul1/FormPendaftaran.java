/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tugas1modul1;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormPendaftaran extends javax.swing.JFrame {
    private Simpan Simpan;
    int x;
    public FormPendaftaran() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TempatLahir = new javax.swing.JTextField();
        NamaLengkap = new javax.swing.JTextField();
        Lakilaki = new javax.swing.JRadioButton();
        perempuan = new javax.swing.JRadioButton();
        NoTelepon = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        ProgramStudi = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        Kirim = new javax.swing.JButton();
        Fakultas = new javax.swing.JComboBox<>();
        Batal = new javax.swing.JButton();
        TanggalLahir = new com.toedter.calendar.JDateChooser();
        Bidang = new javax.swing.JComboBox<>();
        cbDataKirim = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        jLabel13.setText("Fakultas :");

        jTextField5.setBackground(new java.awt.Color(204, 255, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORMULIR PENDAFTARAN");

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PERLOMBAAN OLAHRAGA");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Nama Lengkap :");

        jLabel5.setText("Tempat Lahir :");

        jLabel6.setText("Tanggal Lahir :");

        jLabel7.setText("Jenis Kelamin :");

        jLabel8.setText("Alamat :");

        jLabel9.setText("No. Telepon :");

        jLabel10.setText("Email :");

        jLabel11.setText("Program Studi :");

        jLabel12.setText("Fakultas :");

        jLabel14.setText("Bidang :");

        TempatLahir.setBackground(new java.awt.Color(204, 204, 204));

        NamaLengkap.setBackground(new java.awt.Color(204, 204, 204));

        buttonGroup1.add(Lakilaki);
        Lakilaki.setText("Laki - Laki");

        buttonGroup1.add(perempuan);
        perempuan.setText("perempuan");

        NoTelepon.setBackground(new java.awt.Color(204, 204, 204));
        NoTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoTeleponActionPerformed(evt);
            }
        });
        NoTelepon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NoTeleponKeyReleased(evt);
            }
        });

        Alamat.setBackground(new java.awt.Color(204, 204, 204));

        ProgramStudi.setBackground(new java.awt.Color(204, 204, 204));

        Email.setBackground(new java.awt.Color(204, 204, 204));

        Hapus.setBackground(new java.awt.Color(255, 0, 0));
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Kirim.setBackground(new java.awt.Color(51, 153, 255));
        Kirim.setText("Kirim");
        Kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KirimActionPerformed(evt);
            }
        });

        Fakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hukum", "Teknik", "Ekonomi dan Bisnis", "Pertanian", "Keislaman", "Pendidikan", "Ilmu Sosial dan Politik" }));

        Batal.setBackground(new java.awt.Color(255, 255, 51));
        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        Bidang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basket", "Volly", "Bulu Tangkis", "Futsal" }));

        cbDataKirim.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbDataKirim.setText("Data yang saya masukkan sudah benar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbDataKirim)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Batal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProgramStudi)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 1, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TempatLahir)
                                            .addComponent(NamaLengkap)
                                            .addComponent(Alamat)
                                            .addComponent(TanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Lakilaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(perempuan))
                                            .addComponent(NoTelepon)
                                            .addComponent(Email)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Hapus)
                                        .addGap(18, 18, 18)
                                        .addComponent(Kirim))
                                    .addComponent(Bidang, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Lakilaki)
                    .addComponent(perempuan))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ProgramStudi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Bidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDataKirim)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Batal)
                    .addComponent(Hapus)
                    .addComponent(Kirim))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\safira rihadatul a\\OneDrive\\圖片\\piala.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        NamaLengkap.setText(""); 
        TempatLahir.setText(""); 
        TanggalLahir.setDate(null);
        NoTelepon.setText(""); 
        Alamat.setText(""); 
        ProgramStudi.setText("");
        Email.setText(""); 
        buttonGroup1.clearSelection(); // Jenis Kelamin
        Fakultas.setSelectedIndex(0); 
        Bidang.setSelectedIndex(0);
        cbDataKirim.setSelected(false); 
    }//GEN-LAST:event_HapusActionPerformed

    private void KirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KirimActionPerformed
        if (cbDataKirim.isSelected()){
            String nama = NamaLengkap.getText();
            String tempatLahir = TempatLahir.getText();
            Date tanggalLahir = TanggalLahir.getDate(); // Mengambil tanggal yang dipilih
            String jenisKelamin = Lakilaki.isSelected() ? "Laki-laki" : "Perempuan";
            String alamat = Alamat.getText();
            String noTelepon = NoTelepon.getText();
            String email = Email.getText();
            String fakultas = Fakultas.getSelectedItem().toString();
            String prodi = ProgramStudi.getText();
            String bidang = Bidang.getSelectedItem().toString();
                                                                                                                                                                          
            Simpan = new Simpan (nama, tempatLahir, tanggalLahir, jenisKelamin, alamat, noTelepon, email, fakultas, prodi, bidang);
            Simpan.setVisible(true);
                
              
        }else {
            JOptionPane.showMessageDialog(this, "Harap konfirmasi Kebenaran Data Dengan Mencentangnya.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_KirimActionPerformed

    private void NoTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoTeleponActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin Ingin keluar?", "Keluar", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_BatalActionPerformed

    private void NoTeleponKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoTeleponKeyReleased
        // TODO add your handling code here:
        try {
            x = Integer.parseInt(NoTelepon.getText());
        } catch (NumberFormatException nfe) {
            NoTelepon.setText("");
        }
    }//GEN-LAST:event_NoTeleponKeyReleased

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JButton Batal;
    private javax.swing.JComboBox<String> Bidang;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Fakultas;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kirim;
    private javax.swing.JRadioButton Lakilaki;
    private javax.swing.JTextField NamaLengkap;
    private javax.swing.JTextField NoTelepon;
    private javax.swing.JTextField ProgramStudi;
    private com.toedter.calendar.JDateChooser TanggalLahir;
    private javax.swing.JTextField TempatLahir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbDataKirim;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton perempuan;
    // End of variables declaration//GEN-END:variables
}
