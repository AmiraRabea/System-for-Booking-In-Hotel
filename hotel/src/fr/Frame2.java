/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author elwady
 */
public class Frame2 extends javax.swing.JFrame {

    /** Creates new form Frame2 */
    public Frame2() {
        initComponents();
         buttonGroup1.add(jRadioButton3);
         buttonGroup1.add(jRadioButton4);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(890, 560));
        setPreferredSize(new java.awt.Dimension(890, 560));
        getContentPane().setLayout(null);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 460, 70, 30);

        jLabel1.setText("Frist Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(24, 146, 100, 20);

        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(24, 184, 50, 20);

        jLabel3.setText("Address");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(24, 228, 60, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 139, 80, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(90, 177, 220, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(90, 225, 220, 30);

        jLabel4.setText("Phone");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(24, 269, 60, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(90, 266, 220, 30);

        jLabel5.setText("Reach Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(24, 326, 80, 20);

        jButton2.setText("Reservation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 383, 110, 30);

        jLabel7.setText("Room");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(24, 104, 60, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(107, 326, 97, 20);

        jLabel16.setFont(new java.awt.Font("Wide Latin", 3, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 204));
        jLabel16.setText("Paradise");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(230, 20, 350, 30);

        jButton4.setText("Up Date");
        jButton4.setActionCommand("Update");
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 420, 90, 30);

        jLabel8.setText("Type");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 110, 50, 14);

        jRadioButton4.setText("Including");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(490, 140, 80, 23);

        jRadioButton3.setText("Normal");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(410, 140, 70, 23);

        jLabel9.setText("Stay");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 144, 40, 20);

        jLabel14.setText("Price for one day");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(360, 174, 100, 20);

        jLabel15.setText("=");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 174, 30, 20);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(409, 240, 60, 30);

        jLabel12.setText("Number");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(360, 204, 60, 20);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(409, 200, 60, 30);

        jLabel10.setText("Period");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 240, 50, 30);

        jLabel18.setText("Last Name");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(180, 144, 90, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(240, 140, 70, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(410, 110, 90, 20);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(90, 100, 80, 30);

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/3155552_17110812210058910303.jpg"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 880, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Frame1 f2=new Frame1();
        f2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

}
