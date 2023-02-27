package modulos;

import javax.swing.JOptionPane;
import modelo.EntidadUsuario;
import modelo.UsuarioDao;

/**
 *
 * @author aleja
 */
public class login extends javax.swing.JFrame {
 
    //llamamos a nuestras clases UsuarioDao y EntidadUsuario done estan declaradas las variables
    UsuarioDao udao=new UsuarioDao();
    EntidadUsuario us=new EntidadUsuario();
   
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);//linea de comando para centrar la ventana.
        //estos comandos solo son para evitar que pongamos el usuario y contraseña cada vez que ingresemos al sistema
        //txtUser.setText("Alejandro");
        //txtPass.setText("alegu2001");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btsalir = new javax.swing.JButton();
        btingresar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btsalir.setText("Salir ");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        btingresar.setText("Ingresar");
        btingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 192, 210, 30));

        jTextField2.setBackground(new java.awt.Color(153, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setText("Contraseña:");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, 30));

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField1.setText("Usuario:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/us.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, 140));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel3.setText("Gestión Administrativa de Servicio de Venta y Facturación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 498, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btingresarActionPerformed
        // llamamos a nuestro metodo validar
        validar();
    }//GEN-LAST:event_btingresarActionPerformed

    //declaramos nuestro metodo validar 
    public void validar(){
    
        //donde definimos que el dni y el user son los unicos datos que debe ingresar
        String dni=txtPass.getText();
        String user=txtUser.getText();
        //sentenciamos una restriccion if-else
        if (txtUser.getText().equals("") || txtPass.getText().equals("")){
            //donde si ingresamos sin colocar datos validos nos muestre un mensaje de error
            JOptionPane.showMessageDialog(this, "Debe Ingresar Datos En Las Cajas de Texto");
            txtUser.requestFocus();
        }else{
            //caso contrario valide el ingreso del user y dni
            us=udao.ValidarUsuario(dni, user);
            //sin embargo restringimos con otra sentencia if - else
            if (us.getUser() !=null && us.getDni() !=null){
                //donde si los datos son validos nos dirija a nuestro menu principal
                menuprincipal p = new menuprincipal();
                p.setVisible(true);
                dispose();
            }else{
                //caso contrario nos envie un mensaje de error indicando que debemos ingresar datos 
                //validos
                JOptionPane.showMessageDialog(this, "Debe ingresar usuarios validos");
                txtUser.requestFocus();
            }
        }
        
    }
    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btsalirActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        registrar r =new registrar();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregistrarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btingresar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
