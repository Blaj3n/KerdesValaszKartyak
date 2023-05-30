package program.nezet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import program.modell.Kartya;

public class KartyaLejatszo extends javax.swing.JFrame {

    private ArrayList<Kartya> kartyak;
    private int aktKartya;
    private boolean kerdestMutat;
    
    public KartyaLejatszo() {
        initComponents();
        ini();
    }

    private void ini() {
        kartyak = new ArrayList<>();
        aktKartya = 0;
        kerdestMutat = true;
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
        txaKartya.setText("Válasz csomagot!");
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
        File file = dlgNyit.getSelectedFile();
        fajlMegnyitasa(file.getAbsolutePath());
        
        //demo();
        
    }//GEN-LAST:event_mnuCsomagValasztoActionPerformed

    /* ha választott csomagot:
      - megjelenik az 1. kártya
      - aktív a kártyához tartozó válasz megjelenítése gomb 
     */
    private void demo(){
        txaKartya.setText("a csomag 1. kártyájának kérdése");
        btnMutat.setEnabled(true);
    }
    
    private void btnMutatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutatActionPerformed
        //txaKartya.setText("a csomag 1. kártyájának válasza");
        //btnMutat.setText("következő kérdés");
        kartyatMutat();
    }//GEN-LAST:event_btnMutatActionPerformed

    private void fajlMegnyitasa(String fajl) {
        ini();
        try {
            List<String> sorok = Files.readAllLines(Paths.get(fajl));
            for (String sor : sorok) {
                String[] s = sor.split("/");
                String kerdes = s[0];
                String valasz = s[1];
                kartyak.add(new Kartya(kerdes, valasz));
            }
            kartyatMutat();
            btnMutat.setEnabled(true);
        } catch (IOException ex) {
            Logger.getLogger(KartyaLejatszo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void kartyatMutat(){
        if (aktKartya < kartyak.size()) {
            if (kerdestMutat) {
                String kerdes = kartyak.get(aktKartya).getKerdes();
                txaKartya.setText(kerdes);
                btnMutat.setText("Választ mutat");
                kerdestMutat = false;
            } else {
                String valasz = kartyak.get(aktKartya).getValasz();
                aktKartya++;
                txaKartya.setText(valasz);
                btnMutat.setText("Következő kártya");
                kerdestMutat = true;
            }
        } else {
            txaKartya.setText("Nincs több kártya a csomagban!");
            btnMutat.setEnabled(false);
        }
    }
    
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
