/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugasuas;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class FromMahasiswa extends javax.swing.JFrame {
    
    private Connection koneksi;
    private Statement pernyataan;
    private ResultSet Hasil;
    public FromMahasiswa() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        TxtNama = new javax.swing.JTextField();
        TxtTelp = new javax.swing.JTextField();
        CboJenjang = new javax.swing.JComboBox<>();
        CboJurusan = new javax.swing.JComboBox<>();
        TblSimpan = new javax.swing.JButton();
        TblBaru = new javax.swing.JButton();
        TblEdit = new javax.swing.JButton();
        TblHapus = new javax.swing.JButton();
        TblBatal = new javax.swing.JButton();
        TblKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Form Pendaftaran Mahasiswa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(24, 24, 24))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabel);

        jLabel8.setText("Tabel Mahasiswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel8)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID");

        jLabel2.setText("Data Mahasiswa");

        jLabel3.setText("Nama");

        jLabel4.setText("Jenjang");

        jLabel5.setText("Jurusan");

        jLabel6.setText("Telepon");

        CboJenjang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "D3", "D4" }));

        CboJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "lmu Komunikasi", "Akuntansi", "Manajemen", "Sastra Inggris", "Sastra Jepang", "Bahasa Inggris", "Kesehatan Masyarakat", "Teknik Elektro", "Teknik Industri", "Kedokteran", "Bisnis Digital" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboJenjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CboJenjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CboJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        TblSimpan.setText("Simpan");
        TblSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblSimpanActionPerformed(evt);
            }
        });

        TblBaru.setText("Baru");

        TblEdit.setText("Edit");

        TblHapus.setText("Hapus");

        TblBatal.setText("Batal");

        TblKeluar.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TblSimpan)
                .addGap(18, 18, 18)
                .addComponent(TblBaru)
                .addGap(18, 18, 18)
                .addComponent(TblEdit)
                .addGap(18, 18, 18)
                .addComponent(TblHapus)
                .addGap(18, 18, 18)
                .addComponent(TblBatal)
                .addGap(18, 18, 18)
                .addComponent(TblKeluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TblSimpan)
                    .addComponent(TblBaru)
                    .addComponent(TblEdit)
                    .addComponent(TblHapus)
                    .addComponent(TblBatal)
                    .addComponent(TblKeluar))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void kosong() {
    TxtNama.setText("");
    TxtID.setText("");
    CboJenjang.setSelectedItem(null);
    CboJurusan.setSelectedItem(null);
    TxtTelp.setText("");
}

private void bisa_isi () {      
    TxtID.setEnabled(true);
    TxtNama.setEnabled(true);
    TxtTelp.setEnabled(true);
    CboJenjang.setEnabled(true);
    CboJurusan.setEnabled(true);
}


private void tidak_bisa_isi (){
    TxtNama.setEnabled(false);
    TxtTelp.setEnabled(false);
    CboJenjang.setEnabled(false);
    CboJurusan.setEnabled(false);
}

private void tombol_mati(){
    //TblBaru.setVisible(false);
    TblSimpan.setText("Simpan");
    TblSimpan.setEnabled(false);
    TblHapus.setEnabled(false);
    TblEdit.setEnabled(false);
}

private void tombol_hidup(){
    TblSimpan.setText("Simpan");
    TblSimpan.setText("Simpan");
    TblSimpan.setEnabled(false);
    TblEdit.setEnabled(true);
    TblHapus.setEnabled(true);
    
}
private void koneksi_database() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa","root","");
        pernyataan=koneksi.createStatement();
    } 
	catch (Exception e) {
        JOptionPane.showMessageDialog(null,e);
    }
}
private void isi_table() {
    DefaultTableModel tbl=new DefaultTableModel();
    
    tbl.addColumn("ID");
    tbl.addColumn("Nama");
    tbl.addColumn("Jenjang");
    tbl.addColumn("Jurusan");
    tbl.addColumn("No. Telepon");
    tabel.setModel(tbl);
    try {
        hasil=pernyataan.executeQuery("Select * from mahasiswa.tabelmahasiswa");
        while(hasil.next()){
            tbl.addRow(new Object[] {
                hasil.getString("Nim"),
                hasil.getString("Nama"),
                hasil.getString("Jenjang"),
                hasil.getString("Jurusan"),
                hasil.getString("Telepon"),
            });
            tabel.setModel(tbl);
        }
    } catch (Exception e) {}
}

private void update(){
    try{
        pernyataan.executeUpdate("update tabelmahasiswa set "
            +"nama='"+TxtNama.getText()+"',"
            +"telepon='"+TxtTelp.getText()+"',"
            +"jenjang='"+CboJenjang.getSelectedItem()+"',"
            +"jurusan='"+CboJurusan.getSelectedItem()+"'"
            +"where "
            +"nim='"+TxtNim.getText()+"'"
        );
        JOptionPane.showMessageDialog (null, "Berhasil diupdate");
    }
    catch (Exception e){
        JOptionPane.showMessageDialog (null, "Keterangan Error :"+e);
    }
    isi_table();
}


=======

//---------------------------isi-dibawah-ini------------------------------------


//----------------------------isi-diatas-ini------------------------------------
private void simpan() {
    try {
        pernyataan.executeUpdate("insert into tabelmahasiswa values"
                               + "("+" "+TxtID.getText()+"',"
                               + ""+""+TxtNama.getText()+"',"
                               + ""+""+CboJenjang.getSelectedItem()+","
                               + ""+""+CboJurusan.getSelectedItem()+"',"
                               + ""+" "+TxtTelp.getText()+"')");
    } 
    catch (Exception e) {
        JOptionPane.showMessageDialog (null, "Keterangan Error: "+e);
    }
    isi_table();
    tidak_bisa_isi();
    TblSimpan.setEnabled(false);
}
<<<<<<< HEAD

private void simpan() {
    try {
        pernyataan.executeUpdate("insert into tabelmahasiswa values"
                               + "("+" "+TxtID.getText()+"',"
                               + ""+""+TxtNama.getText()+"',"
                               + ""+""+CboJenjang.getSelectedItem()+","
                               + ""+""+CboJurusan.getSelectedItem()+"',"
                               + ""+" "+TxtTelp.getText()+"')");
    } 
    catch (Exception e) {
        JOptionPane.showMessageDialog (null, "Keterangan Error: "+e);
    }
    isi_table();
    tidak_bisa_isi();
    TblSimpan.setEnabled(false);
}
>>>>>>> genta

=======
>>>>>>> 049473a2b3e9158bf31dd75d4c7e4e1f61980aa3
    private void TblSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TblSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(FromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboJenjang;
    private javax.swing.JComboBox<String> CboJurusan;
    private javax.swing.JTable Tabel;
    private javax.swing.JButton TblBaru;
    private javax.swing.JButton TblBatal;
    private javax.swing.JButton TblEdit;
    private javax.swing.JButton TblHapus;
    private javax.swing.JButton TblKeluar;
    private javax.swing.JButton TblSimpan;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtTelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
