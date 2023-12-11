/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainhub;

import mainhub.animalapp.Menu;
import mainhub.forestapp.MainGUI;
import mainhub.sealifeapp.SeaLifeGUI;


/**
 *
 * @author Alex
 */
//the mainhub or base where all the 3 sections/apps are connected to each other via branch files
public class MainHubGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainHubGUI
     */
    public MainHubGUI() {
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
        forestappBTN = new javax.swing.JButton();
        sealifeappBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        animalappBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/logoforGUI2.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 710, 110));

        forestappBTN.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        forestappBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/forestBTnlogo.png"))); // NOI18N
        forestappBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forestappBTNActionPerformed(evt);
            }
        });
        getContentPane().add(forestappBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 300, 70));

        sealifeappBTN.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sealifeappBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/sealifeBTn.png"))); // NOI18N
        sealifeappBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sealifeappBTNActionPerformed(evt);
            }
        });
        getContentPane().add(sealifeappBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/sidebar22.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 110));

        animalappBTN.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        animalappBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/animalBtnbrown.png"))); // NOI18N
        animalappBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalappBTNActionPerformed(evt);
            }
        });
        getContentPane().add(animalappBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 350, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/elephant300.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 326, 350, 250));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/sebastian-unrau-sp-p7uuT0tw-unsplash (1).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 300, 250));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/jellyfish-21741_640 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 300, 240));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/depperblue.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sealifeappBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sealifeappBTNActionPerformed
        // TODO add your handling code here:
       SeaLifeGUI sealife = new SeaLifeGUI();
       sealife.setVisible(true);
    }//GEN-LAST:event_sealifeappBTNActionPerformed

    private void forestappBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forestappBTNActionPerformed
        // TODO add your handling code here:
       MainGUI main = new MainGUI();
       main.setVisible(true);
    }//GEN-LAST:event_forestappBTNActionPerformed

    private void animalappBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalappBTNActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);

    }//GEN-LAST:event_animalappBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHubGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHubGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton animalappBTN;
    private javax.swing.JButton forestappBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton sealifeappBTN;
    // End of variables declaration//GEN-END:variables
}