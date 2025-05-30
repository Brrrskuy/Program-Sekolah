package Project;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Connect.koneksi;
import javax.swing.table.DefaultTableModel;
import Form.*;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author user
 */
public class Lap_Nilai extends javax.swing.JFrame {

    /**
     * Creates new form Lap_Nilai
     */
    public Lap_Nilai() {
        initComponents();
        datatable();
    }
private void datatable(){
        DefaultTableModel tbl= new DefaultTableModel();
        tbl.addColumn("No. ID");
        tbl.addColumn("NIS");
        tbl.addColumn("Nama Siswa");
        tbl.addColumn("Kode Pelajaran");
        tbl.addColumn("Mata Pelajaran");
        tbl.addColumn("Nilai Tugas");
        tbl.addColumn("Nilai Ulangan");
        tbl.addColumn("Nilai UTS");
        tbl.addColumn("Nilai UAS");
        tbl.addColumn("Nilai Rata-Rata");
        tabel.setModel(tbl);
        try{
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM nilai");
            while (res.next())
            {
                tbl.addRow(new Object[]{
                res.getString("id"),
                res.getString("nis"),
                res.getString("nama_siswa"),
                res.getString("kodepel"),
                res.getString("mapel"),
                res.getString("tugas"),
                res.getString("ulangan"),
                res.getString("uts"),
                res.getString("uas"),
                res.getString("ratarata"),
                });
            tabel.setModel(tbl);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
            
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
        txtcari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        bkeluar = new javax.swing.JButton();
        bcari = new javax.swing.JButton();
        bcetak = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bcetak2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.setGridColor(new java.awt.Color(0, 0, 0));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        bkeluar.setBackground(new java.awt.Color(255, 204, 204));
        bkeluar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bkeluar.setForeground(new java.awt.Color(255, 0, 0));
        bkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/close.png"))); // NOI18N
        bkeluar.setText("Kembali");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bcari.setBackground(new java.awt.Color(255, 204, 204));
        bcari.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bcari.setForeground(new java.awt.Color(204, 0, 204));
        bcari.setText("CARI");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        bcetak.setBackground(new java.awt.Color(255, 204, 204));
        bcetak.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bcetak.setForeground(new java.awt.Color(0, 204, 255));
        bcetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/print_preview.png"))); // NOI18N
        bcetak.setText("CETAK SELURUH NILAI SISWA");
        bcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setText("Laporan Data Nilai");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bcetak2.setBackground(new java.awt.Color(255, 204, 204));
        bcetak2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bcetak2.setForeground(new java.awt.Color(0, 204, 255));
        bcetak2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/print_preview.png"))); // NOI18N
        bcetak2.setText("CETAK NILAI RAPORT SISWA");
        bcetak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetak2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bkeluar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bcetak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bcetak2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcari)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcetak)
                    .addComponent(bcetak2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(bkeluar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked

    }//GEN-LAST:event_tabelMouseClicked

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        Menu xx;
        xx = new Menu();
        xx.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        try{
            Statement statement = (Statement)koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM nilai where "+"nis like '%"+txtcari.getText()+"%' OR "+"nama_siswa like '%"+txtcari.getText()+"%'");
            DefaultTableModel tbl= new DefaultTableModel();
            tbl.addColumn("No. ID");
            tbl.addColumn("NIS");
            tbl.addColumn("Nama Siswa");
            tbl.addColumn("Kode Pelajaran");
            tbl.addColumn("Mata Pelajaran");
            tbl.addColumn("Nilai Tugas");
            tbl.addColumn("Nilai Ulangan");
            tbl.addColumn("Nilai UTS");
            tbl.addColumn("Nilai UAS");
            tbl.addColumn("Nilai Rata-Rata");
            tabel.setModel(tbl);
            while(res.next()){
                tbl.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("nis"),
                    res.getString("nama_siswa"),
                    res.getString("kodepel"),
                    res.getString("mapel"),
                    res.getString("tugas"),
                    res.getString("ulangan"),
                    res.getString("uts"),
                    res.getString("uas"),
                    res.getString("ratarata"),
                });
                tabel.setModel(tbl);
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null ,"error");
        }
    }//GEN-LAST:event_bcariActionPerformed

    private void bcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakActionPerformed
        try{
            HashMap parameter = new HashMap();
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql:" + "///koneksi","root","");
            File file = new File ("src/Laporan/Laporan_Nilai.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, cn);
            JasperViewer.viewReport(jp,false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,
                "Data Tidak Dapat di Cetak!!"+"\n"+ e.getMessage(), "Cetak Data",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bcetakActionPerformed

    private void bcetak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetak2ActionPerformed
        try{
            String NamaFile = "src/Laporan/Laporan_Nilai_Persiswa.jasper";
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "koneksi";
            String driver = "com.mysql.Driver";
            String username = "root";
            String password = "";
            Class.forName ("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection(url + dbName, username, password);
            HashMap param = new HashMap();
            //Mengambil parameter
            param.put("nis", Integer.valueOf(txtcari.getText()));

            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, koneksi);
            JasperViewer.viewReport(JPrint, false);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_bcetak2ActionPerformed

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
            java.util.logging.Logger.getLogger(Lap_Nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lap_Nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lap_Nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lap_Nilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lap_Nilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcari;
    private javax.swing.JButton bcetak;
    private javax.swing.JButton bcetak2;
    private javax.swing.JButton bkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
