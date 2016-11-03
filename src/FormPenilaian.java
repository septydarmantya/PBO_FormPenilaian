public class FormPenilaian extends javax.swing.JFrame {

    public FormPenilaian() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        proses = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        mapel = new javax.swing.JTextField();
        nilai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Form Penilaian");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel2.setText("Absen");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setText("Mapel");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel4.setText("Nilai");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel5.setText("Hasil");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel7.setText("Nama");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 130, -1));

        absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenActionPerformed(evt);
            }
        });
        getContentPane().add(absen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, -1));
        getContentPane().add(mapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, -1));
        getContentPane().add(nilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 130, -1));

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed

    }//GEN-LAST:event_namaActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        String Nama = nama.getText().toString();
        int Absen = Integer.parseInt(absen.getText());
        String Mapel = mapel.getText().toString();
        int Nilai = Integer.parseInt(nilai.getText());
        
        hasil.setText(String.valueOf("Nama :" + Nama + "\nAbsen : "+ Absen 
                +"\nMapel : "+Mapel+"\nNilai : "+ Nilai));
    }//GEN-LAST:event_prosesActionPerformed

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
     
    }//GEN-LAST:event_absenActionPerformed
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
            java.util.logging.Logger.getLogger(FormPenilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPenilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPenilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPenilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPenilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mapel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilai;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
