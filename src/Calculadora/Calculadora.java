/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author HP
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BSuma = new javax.swing.JButton();
        BResta = new javax.swing.JButton();
        BMultiplicar = new javax.swing.JButton();
        BDividir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPantalla1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPantalla2 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPantalla3 = new javax.swing.JTextPane();
        CE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BSuma.setText("Sumar");
        BSuma.setName("boton1"); // NOI18N
        BSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSumaMouseClicked(evt);
            }
        });
        BSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSumaActionPerformed(evt);
            }
        });

        BResta.setText("Restar");
        BResta.setName("boton2"); // NOI18N
        BResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRestaActionPerformed(evt);
            }
        });

        BMultiplicar.setText("Multiplicar");
        BMultiplicar.setName("boton3"); // NOI18N
        BMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMultiplicarActionPerformed(evt);
            }
        });

        BDividir.setText("Dividir");
        BDividir.setName("boton4"); // NOI18N
        BDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDividirActionPerformed(evt);
            }
        });

        txtPantalla1.setName("txtPantalla1"); // NOI18N
        txtPantalla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantalla1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtPantalla1);

        jScrollPane2.setName("Numero 2"); // NOI18N

        txtPantalla2.setName("txtPantalla2"); // NOI18N
        txtPantalla2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantalla2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtPantalla2);

        jLabel1.setText("Numero 1");

        jLabel2.setText("Numero 2");

        jLabel3.setText("Resultado");

        txtPantalla3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantalla3KeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtPantalla3);

        CE.setText("CE");
        CE.setName("boton5"); // NOI18N
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BResta, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(BDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSuma)
                    .addComponent(BResta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BMultiplicar)
                    .addComponent(BDividir))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSumaActionPerformed
        //txtPantalla3.setText("Te la voy a sumar krnal");
        float num1, num2;
        num1= Float.parseFloat(txtPantalla1.getText());
        num2= Float.parseFloat(txtPantalla2.getText());
        txtPantalla3.setText(Float.toString(num1+num2));
    }//GEN-LAST:event_BSumaActionPerformed

    private void BSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSumaMouseClicked
      
    }//GEN-LAST:event_BSumaMouseClicked

    private void BRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRestaActionPerformed
        float num1, num2;
        num1= Float.parseFloat(txtPantalla1.getText());
        num2= Float.parseFloat(txtPantalla2.getText());
        txtPantalla3.setText(Float.toString(num1-num2));
    }//GEN-LAST:event_BRestaActionPerformed

    private void BMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMultiplicarActionPerformed
        float num1, num2;
        num1= Float.parseFloat(txtPantalla1.getText());
        num2= Float.parseFloat(txtPantalla2.getText());
        txtPantalla3.setText(Float.toString(num1*num2));
    }//GEN-LAST:event_BMultiplicarActionPerformed

    private void BDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDividirActionPerformed
        float num1, num2;
        num1= Float.parseFloat(txtPantalla1.getText());
        num2= Float.parseFloat(txtPantalla2.getText());
        txtPantalla3.setText(Float.toString(num1/num2));
    }//GEN-LAST:event_BDividirActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        
    }//GEN-LAST:event_CEActionPerformed

    private void txtPantalla1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantalla1KeyTyped
        Validaciones.soloNumeros(evt, txtPantalla1);
    }//GEN-LAST:event_txtPantalla1KeyTyped

    private void txtPantalla2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantalla2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla2KeyTyped

    private void txtPantalla3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantalla3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla3KeyTyped

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BDividir;
    private javax.swing.JButton BMultiplicar;
    private javax.swing.JButton BResta;
    private javax.swing.JButton BSuma;
    private javax.swing.JButton CE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane txtPantalla1;
    private javax.swing.JTextPane txtPantalla2;
    private javax.swing.JTextPane txtPantalla3;
    // End of variables declaration//GEN-END:variables
}
