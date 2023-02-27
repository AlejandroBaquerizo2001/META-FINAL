/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modulos;

/**
 *
 * @author aleja
 */
public class consulta extends javax.swing.JFrame {

    /**
     * Creates new form consulta
     */
    public consulta() {
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

        btregresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btcobro = new javax.swing.JButton();
        btpagot = new javax.swing.JButton();
        btpagoe = new javax.swing.JButton();
        btbanco = new javax.swing.JButton();
        btfactura = new javax.swing.JButton();
        btusuario = new javax.swing.JButton();
        btmercaderia1 = new javax.swing.JButton();
        btmercaderia = new javax.swing.JButton();
        btventa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btregresar.setText("Regresar");
        btregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cobro.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/en linea.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 130, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/efectivo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 130, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 130, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/factura.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 130, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mercaderia.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 130, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 130, 140));

        btcobro.setText("Cobros");
        btcobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcobroActionPerformed(evt);
            }
        });
        getContentPane().add(btcobro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btpagot.setText("Pago por Transacción");
        getContentPane().add(btpagot, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        btpagoe.setText("Pago en Efectivo");
        getContentPane().add(btpagoe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        btbanco.setText("Entidad Bancaria");
        getContentPane().add(btbanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        btfactura.setText("Facturas");
        btfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        btusuario.setText("Usuario");
        getContentPane().add(btusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        btmercaderia1.setText("Mercaderia Saliente");
        getContentPane().add(btmercaderia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        btmercaderia.setText("Mercaderia Entrante");
        getContentPane().add(btmercaderia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        btventa.setText("Ventas");
        getContentPane().add(btventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mercaderia.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 130, 120));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Módulo de Consulta al Sistema");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresarActionPerformed
        // TODO add your handling code here:
        menuprincipal open=new menuprincipal();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btregresarActionPerformed

    private void btfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btfacturaActionPerformed

    private void btcobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcobroActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbanco;
    private javax.swing.JButton btcobro;
    private javax.swing.JButton btfactura;
    private javax.swing.JButton btmercaderia;
    private javax.swing.JButton btmercaderia1;
    private javax.swing.JButton btpagoe;
    private javax.swing.JButton btpagot;
    private javax.swing.JButton btregresar;
    private javax.swing.JButton btusuario;
    private javax.swing.JButton btventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
