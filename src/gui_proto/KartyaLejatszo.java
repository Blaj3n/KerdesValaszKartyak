/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_proto;

import javax.swing.JFileChooser;

/**
 *
 * @author csolti
 */
public class KartyaLejatszo extends javax.swing.JFrame {

    /**
     * Creates new form KartyaLejatszo
     */
    public KartyaLejatszo() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaKartya = new javax.swing.JTextArea();
        btnMutat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCsomagValaszto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gyakorlás a csomag kártyáival");

        jLabel1.setText("Aktuális kártya tartalma:");

        txaKartya.setEditable(false);
        txaKartya.setColumns(20);
        txaKartya.setRows(5);
        jScrollPane1.setViewportView(txaKartya);

        btnMutat.setText("Válasz mutatása");
        btnMutat.setEnabled(false);
        btnMutat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutatActionPerformed(evt);
            }
        });

        jMenu1.setText("Program");

        mnuCsomagValaszto.setText("Csomag kiválasztása...");
        mnuCsomagValaszto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCsomagValasztoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCsomagValaszto);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1)
                    .addComponent(btnMutat))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMutat)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCsomagValasztoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCsomagValasztoActionPerformed
        JFileChooser dlgNyit = new JFileChooser();
        dlgNyit.showOpenDialog(rootPane);
        fajlMegnyitasa();
        
        demo();
        
    }//GEN-LAST:event_mnuCsomagValasztoActionPerformed

    private void btnMutatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutatActionPerformed
        txaKartya.setText("a csomag 1. kártyájának válasza");
        btnMutat.setText("következő kérdés");
    }//GEN-LAST:event_btnMutatActionPerformed

    /* ha választott csomagot:
      - megjelenik az 1. kártya
      - aktív a kártyához tartozó válasz megjelenítése gomb 
     */
    private void demo(){
        txaKartya.setText("a csomag 1. kártyájának kérdése");
        btnMutat.setEnabled(true);
    }
    
    private void fajlMegnyitasa() {
        //tényleges kiírás
    }
    
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
            java.util.logging.Logger.getLogger(KartyaLejatszo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KartyaLejatszo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KartyaLejatszo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KartyaLejatszo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KartyaLejatszo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMutat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuCsomagValaszto;
    private javax.swing.JTextArea txaKartya;
    // End of variables declaration//GEN-END:variables
}
