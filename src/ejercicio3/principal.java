/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    double v[];
    double v1[];
    double vsuma[];
    double vresta[];

    public principal() {
        initComponents();
        txtlongitud2.setEditable(false);
        cmdcrear2.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdllenadoautomatico2.setEnabled(false);
        cmdllenadomanual.setEnabled(false);
        cmdllenadomanual2.setEnabled(false);
        cmdborrar.setEnabled(false);
        cmdborrar2.setEnabled(false);
        cmdcalcular.setEnabled(false);
        cmdborrar3.setEnabled(false);
        txtlongitud.requestFocusInWindow();
    }

    /**
     * This method is called from within the c onstructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtlongitud = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtlongitud2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdcrear = new javax.swing.JButton();
        cmdllenadomanual = new javax.swing.JButton();
        cmdllenadoautomatico = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmdcrear2 = new javax.swing.JButton();
        cmdllenadomanual2 = new javax.swing.JButton();
        cmdllenadoautomatico2 = new javax.swing.JButton();
        cmdborrar2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultadov1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtresultadov2 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtresultadosuma = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtresultadoresta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SUMA Y RESTA DE DOS VECTORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 230, 40));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales Vector 1"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 100, 30));

        txtlongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlongitudActionPerformed(evt);
            }
        });
        txtlongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlongitudKeyTyped(evt);
            }
        });
        jPanel1.add(txtlongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 200, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales Vector 2"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Longitud: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 70, 20));

        txtlongitud2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlongitud2KeyTyped(evt);
            }
        });
        jPanel2.add(txtlongitud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 210, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones Vector 1"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdcrear.setText("Crear");
        cmdcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdcrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

        cmdllenadomanual.setText("Llenado Manual");
        cmdllenadomanual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadomanualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdllenadomanual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 30));

        cmdllenadoautomatico.setText("Llenado Automatico");
        cmdllenadoautomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadoautomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdllenadoautomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        cmdborrar.setText("Borrar");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 160, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones Vector 2"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdcrear2.setText("Crear");
        cmdcrear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcrear2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdcrear2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

        cmdllenadomanual2.setText("LLenado Manual");
        cmdllenadomanual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadomanual2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdllenadomanual2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 30));

        cmdllenadoautomatico2.setText("LLenado Automatico");
        cmdllenadoautomatico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdllenadoautomatico2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdllenadoautomatico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));

        cmdborrar2.setText("Borrar");
        cmdborrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrar2ActionPerformed(evt);
            }
        });
        jPanel4.add(cmdborrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 160, 190));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones con Vectores"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel5.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 30));

        cmdborrar3.setText("Borrar");
        cmdborrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrar3ActionPerformed(evt);
            }
        });
        jPanel5.add(cmdborrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 180, 140));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Vector 1"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultadov1.setColumns(20);
        txtresultadov1.setRows(5);
        jScrollPane1.setViewportView(txtresultadov1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 100));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 200, 140));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Vector 2"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultadov2.setColumns(20);
        txtresultadov2.setRows(5);
        jScrollPane2.setViewportView(txtresultadov2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 90));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, 120));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Operaciones"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultadosuma.setColumns(20);
        txtresultadosuma.setRows(5);
        jScrollPane3.setViewportView(txtresultadosuma);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 140, 90));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 180, 120));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado de operaciones 2"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtresultadoresta.setColumns(20);
        txtresultadoresta.setRows(5);
        jScrollPane4.setViewportView(txtresultadoresta);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 80));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 180, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlongitudActionPerformed

    private void cmdcrear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcrear2ActionPerformed

        if (txtlongitud2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longuitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud2.requestFocusInWindow();
        } else if (Integer.parseInt(txtlongitud2.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La longitud debe ser mayor que cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud2.requestFocusInWindow();
            txtlongitud2.selectAll();
        } else {
            int longitud2;
            longitud2 = Integer.parseInt(txtlongitud2.getText());
            v1 = new double[longitud2];
            JOptionPane.showMessageDialog(this, "Vector creado correctamente!");

            cmdllenadoautomatico2.setEnabled(true);
            txtlongitud2.setEditable(true);
            cmdllenadomanual2.setEnabled(true);
            cmdborrar2.setEnabled(true);
            cmdcrear2.setEnabled(false);
        }
    }//GEN-LAST:event_cmdcrear2ActionPerformed

    private void txtlongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlongitudKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtlongitudKeyTyped

    private void txtlongitud2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlongitud2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtlongitud2KeyTyped

    private void cmdcrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcrearActionPerformed

        if (txtlongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longuitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtlongitud.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La longitud debe ser mayor que cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud.requestFocusInWindow();
            txtlongitud.selectAll();
        } else {
            int longitud;
            longitud = Integer.parseInt(txtlongitud.getText());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector creado correctamente!");
            txtlongitud.setEditable(false);
            cmdllenadoautomatico.setEnabled(true);
            cmdllenadomanual.setEnabled(true);
            cmdborrar.setEnabled(true);
            cmdcrear.setEnabled(false);
        }
    }//GEN-LAST:event_cmdcrearActionPerformed

    private void cmdllenadomanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadomanualActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posición: " + i));
            v[i] = n;
        }
        cmdllenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdborrar.setEnabled(true);
        for (int i = 0; i < v.length; i++) {
            txtresultadov1.append(v[i] + "\n");
        }
        txtlongitud2.setEditable(true);
        cmdcrear2.setEnabled(true);
        txtlongitud2.requestFocusInWindow();
    }//GEN-LAST:event_cmdllenadomanualActionPerformed

    private void cmdllenadomanual2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadomanual2ActionPerformed
        double n;
        for (int i = 0; i < v1.length; i++) {
            n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el valor en la posicion " + (i + 1)));
            v1[i] = n;
        }
        cmdllenadoautomatico2.setEnabled(false);
        cmdllenadomanual2.setEnabled(false);
        cmdborrar2.setEnabled(true);
        for (int i = 0; i < v.length; i++) {
            txtresultadov2.append(v1[i] + "\n");
        }
        cmdcalcular.setEnabled(true);
        cmdborrar3.setEnabled(true);
    }//GEN-LAST:event_cmdllenadomanual2ActionPerformed

    private void cmdllenadoautomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadoautomaticoActionPerformed

        int n;
        for (int i = 0; i < v.length; i++) {
            n = (int) (Math.random() * 25 + 1);
            v[i] = n;
        }
        cmdllenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdborrar.setEnabled(true);
        for (int i = 0; i < v.length; i++) {
            txtresultadov1.append(v[i] + "\n");
        }
        JOptionPane.showMessageDialog(this, "Vector creado correctamente");
        txtlongitud2.setEditable(true);
        cmdcrear2.setEnabled(true);
        txtlongitud2.requestFocusInWindow();
    }//GEN-LAST:event_cmdllenadoautomaticoActionPerformed

    private void cmdllenadoautomatico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdllenadoautomatico2ActionPerformed
        int n;
        for (int i = 0; i < v.length; i++) {
            n = (int) (Math.random() * 25 + 1);
            v[i] = n;
        }cmdllenadomanual2.setEnabled(false);
        cmdllenadoautomatico2.setEnabled(false);
        cmdborrar2.setEnabled(true);
        for (int i = 0; i < v.length; i++) {
            txtresultadov2.append(v[i] + "\n");
        }
        JOptionPane.showMessageDialog(this, "Vector creado correctamente");
        cmdcalcular.setEnabled(true);
        cmdborrar3.setEnabled(true);
    }//GEN-LAST:event_cmdllenadoautomatico2ActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
        txtresultadov1.setText("");
        txtlongitud.setText("");
        txtlongitud.requestFocusInWindow();
        v = null;
        txtlongitud.setEditable(true);
        cmdcrear.setEnabled(true);
        cmdllenadoautomatico.setEnabled(false);
        cmdllenadomanual.setEnabled(false);
        cmdborrar.setEnabled(false);
        cmdcalcular.setEnabled(false);
    }//GEN-LAST:event_cmdborrarActionPerformed

    private void cmdborrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrar2ActionPerformed
        txtresultadov2.setText("");
        txtlongitud2.setText("");
        txtlongitud2.requestFocusInWindow();
        txtlongitud2.setEditable(true);
        v1 = null;
        cmdcrear2.setEnabled(true);
        cmdllenadoautomatico2.setEnabled(false);
        cmdllenadomanual2.setEnabled(false);
        cmdcalcular.setEnabled(false);
        cmdborrar2.setEnabled(false);
    }//GEN-LAST:event_cmdborrar2ActionPerformed

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        if (v == null) {
            JOptionPane.showMessageDialog(this, "El vector 1 esta vacio, porfavor llenelo", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud.requestFocusInWindow();
            txtlongitud.setText("");
        } else if (v1 == null) {
            JOptionPane.showMessageDialog(this, "EL vector 2 esta vacio, por favor llenelo", "Error", JOptionPane.ERROR_MESSAGE);
            txtlongitud2.setText("");
            txtlongitud2.requestFocusInWindow();
        } else if (Integer.parseInt(txtlongitud.getText()) != Integer.parseInt(txtlongitud2.getText())) {
            JOptionPane.showMessageDialog(this, "Los vectores deben coinsidir", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int longitud;
            longitud = Integer.parseInt(txtlongitud.getText());
            vsuma = new double[longitud];
            vresta = new double[longitud];
            for (int i = 0; i < v.length; i++) {
                vsuma[i] = v[i] + v1[i];
                txtresultadosuma.append(v[i] + " + " + v1[i] + " = " + vsuma[i] + "\n");
            }
            for (int i = 0; i < v.length; i++) {
                vresta[i] = v[i] - v1[i];
                txtresultadoresta.append(v[i] + " - " + v1[i] + " = " + vresta[i] + "\n");
            }

        }
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void cmdborrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrar3ActionPerformed
        v = null;
        v1 = null;
        vsuma = null;
        vresta = null;
        txtlongitud.setText("");
        txtlongitud2.setText("");
        txtresultadoresta.setText("");
        txtresultadosuma.setText("");
        txtresultadov1.setText("");
        txtresultadov2.setText("");
        cmdcalcular.setEnabled(false);
        cmdllenadomanual.setEnabled(false);
        cmdllenadoautomatico.setEnabled(false);
        cmdborrar.setEnabled(false);
        txtlongitud2.setEditable(false);
        cmdcrear2.setEnabled(false);
        cmdllenadomanual2.setEnabled(false);
        cmdllenadoautomatico2.setEnabled(false);
        cmdborrar2.setEnabled(false);
        txtlongitud.requestFocusInWindow();
        txtlongitud.setEditable(true);
    }//GEN-LAST:event_cmdborrar3ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdborrar2;
    private javax.swing.JButton cmdborrar3;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JButton cmdcrear;
    private javax.swing.JButton cmdcrear2;
    private javax.swing.JButton cmdllenadoautomatico;
    private javax.swing.JButton cmdllenadoautomatico2;
    private javax.swing.JButton cmdllenadomanual;
    private javax.swing.JButton cmdllenadomanual2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtlongitud;
    private javax.swing.JTextField txtlongitud2;
    private javax.swing.JTextArea txtresultadoresta;
    private javax.swing.JTextArea txtresultadosuma;
    private javax.swing.JTextArea txtresultadov1;
    private javax.swing.JTextArea txtresultadov2;
    // End of variables declaration//GEN-END:variables
}
