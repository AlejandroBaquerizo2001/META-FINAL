/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modulos;

import vista.ingresarbanco;
import vista.ingresarmercaderia;
import vista.ingresarusuarios;
import vista.ingresocobros;

/**
 *
 * @author aleja
 */
public class ingresar extends javax.swing.JFrame {

    /**
     * Creates new form ingresar
     */
    public ingresar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btventa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btmercaderia = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btusuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btfactura = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btbanco = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btcobro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btregresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btventa.setText("Ventas");
        getContentPane().add(btventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 130, 140));

        btmercaderia.setText("Mercaderia");
        btmercaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmercaderiaActionPerformed(evt);
            }
        });
        getContentPane().add(btmercaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mercaderia.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, 120));

        btusuario.setText("Usuario");
        btusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, 110));

        btfactura.setText("Facturas");
        btfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 140));

        btbanco.setText("Entidad Bancaria");
        btbanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbancoActionPerformed(evt);
            }
        });
        getContentPane().add(btbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 130, 130));

        btcobro.setText("Cobros");
        btcobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcobroActionPerformed(evt);
            }
        });
        getContentPane().add(btcobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cobro.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 130));

        btregresar.setText("Regresar");
        btregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Módulo de Ingresos al Sistema");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btfacturaActionPerformed

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        // TODO add your handling code here:
        menuprincipal open=new menuprincipal();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btregresarActionPerformed

    private void btcobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcobroActionPerformed
        // TODO add your handling code here:
        ingresocobros open=new ingresocobros ();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btcobroActionPerformed

    private void btbancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbancoActionPerformed
        // TODO add your handling code here:
        ingresarbanco open = new ingresarbanco();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btbancoActionPerformed

    private void btusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btusuarioActionPerformed
        // TODO add your handling code here:
        ingresarusuarios igus =new ingresarusuarios();
        igus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btusuarioActionPerformed

    private void btmercaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmercaderiaActionPerformed
        // TODO add your handling code here:
    ingresarmercaderia ingmerca = new ingresarmercaderia();
    ingmerca.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btmercaderiaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbanco;
    private javax.swing.JButton btcobro;
    private javax.swing.JButton btfactura;
    private javax.swing.JButton btmercaderia;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton btusuario;
    private javax.swing.JButton btventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
