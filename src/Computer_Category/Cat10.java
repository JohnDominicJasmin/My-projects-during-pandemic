/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer_Category;

import QandA.front;
import javax.swing.JOptionPane;

/**
 *
 * @author micojasmin
 */
class hp9 extends hp8{
    
}
public class Cat10 extends javax.swing.JFrame {
hp9 h9 = new hp9();
    /**
     * Creates new form Cat5
     */
    public Cat10() {
        initComponents();
        jButtonCheck.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButtonControlUnit = new javax.swing.JRadioButton();
        jRadioButtonTransmission = new javax.swing.JRadioButton();
        jRadioButtonDataFlow = new javax.swing.JRadioButton();
        jRadioButtonDataCapture = new javax.swing.JRadioButton();
        jButtonCheck = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setRows(5);
        jTextArea1.setText("Finite number of sequential instructions\nare called?");
        jScrollPane1.setViewportView(jTextArea1);

        jRadioButtonControlUnit.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jRadioButtonControlUnit.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonControlUnit.setText("D. Program Flow");
        jRadioButtonControlUnit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonControlUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonControlUnitActionPerformed(evt);
            }
        });

        jRadioButtonTransmission.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jRadioButtonTransmission.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonTransmission.setText("A. Flow Chart");
        jRadioButtonTransmission.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonTransmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTransmissionActionPerformed(evt);
            }
        });

        jRadioButtonDataFlow.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jRadioButtonDataFlow.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonDataFlow.setText("B.Control Flow");
        jRadioButtonDataFlow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonDataFlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDataFlowActionPerformed(evt);
            }
        });

        jRadioButtonDataCapture.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jRadioButtonDataCapture.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonDataCapture.setText("C. Algorithm");
        jRadioButtonDataCapture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonDataCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDataCaptureActionPerformed(evt);
            }
        });

        jButtonCheck.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButtonCheck.setText("Check");
        jButtonCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(231, 231, 231)
                            .addComponent(jButtonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButtonDataCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButtonTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonControlUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButtonDataFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButtonDataFlow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonTransmission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDataCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonControlUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButtonCheck))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTransmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTransmissionActionPerformed
         if (jRadioButtonTransmission.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonDataCapture.setEnabled(false);
            jRadioButtonDataFlow.setEnabled(false);
            jRadioButtonControlUnit.setEnabled(false);

        } else if (!jRadioButtonTransmission.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonDataCapture.setEnabled(true);
            jRadioButtonDataFlow.setEnabled(true);
            jRadioButtonControlUnit.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonTransmissionActionPerformed

    private void jRadioButtonDataFlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDataFlowActionPerformed
         if (jRadioButtonDataFlow.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonDataCapture.setEnabled(false);
            jRadioButtonTransmission.setEnabled(false);
            jRadioButtonControlUnit.setEnabled(false);

        } else if (!jRadioButtonDataFlow.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonDataCapture.setEnabled(true);
            jRadioButtonTransmission.setEnabled(true);
            jRadioButtonControlUnit.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonDataFlowActionPerformed

    private void jRadioButtonDataCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDataCaptureActionPerformed
         if (jRadioButtonDataCapture.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonTransmission.setEnabled(false);
            jRadioButtonDataFlow.setEnabled(false);
            jRadioButtonControlUnit.setEnabled(false);

        } else if (!jRadioButtonDataCapture.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonTransmission.setEnabled(true);
            jRadioButtonDataFlow.setEnabled(true);
            jRadioButtonControlUnit.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonDataCaptureActionPerformed

    private void jRadioButtonControlUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonControlUnitActionPerformed
         if (jRadioButtonControlUnit.isSelected()) {
             jButtonCheck.setVisible(true);
            jRadioButtonDataCapture.setEnabled(false);
            jRadioButtonDataFlow.setEnabled(false);
            jRadioButtonTransmission.setEnabled(false);

        } else if (!jRadioButtonControlUnit.isSelected()) {
            jButtonCheck.setVisible(false);
            jRadioButtonDataCapture.setEnabled(true);
            jRadioButtonDataFlow.setEnabled(true);
            jRadioButtonTransmission.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonControlUnitActionPerformed

    private void jButtonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckActionPerformed
      if (jRadioButtonDataCapture.isSelected()) {

            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS CORRECT");
            new Result().setVisible(true);
            setVisible(false);
        } else if (!jRadioButtonDataCapture.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "YOUR ANSWER IS WRONG" + "\n" + --h9.life +" "+ "lives left");
            if (h9.life == 0) {
                h9.life=3;
                JOptionPane.showMessageDialog(rootPane, "GAME OVER!");
                new front().setVisible(true);
                setVisible(false);
            }
        }        
    }//GEN-LAST:event_jButtonCheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Cat9().setVisible(true);
        setVisible(false);
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
            java.util.logging.Logger.getLogger(Cat10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cat10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cat10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cat10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cat10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButtonControlUnit;
    private javax.swing.JRadioButton jRadioButtonDataCapture;
    private javax.swing.JRadioButton jRadioButtonDataFlow;
    private javax.swing.JRadioButton jRadioButtonTransmission;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
