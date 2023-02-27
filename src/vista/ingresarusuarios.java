
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDao;
import modulos.ingresar;

/**
 *
 * @author aleja
 */
public class ingresarusuarios extends javax.swing.JFrame {
    /*llamamos a nuestros modelo para que funcione nuestras sentencias
    la cual declararemos las clases donde esta nuestras variables*/
    ClienteDao dao=new ClienteDao();
    Cliente cl=new Cliente();
    /*Instanciamos nuestra clase default table model*/
    DefaultTableModel modelo=new DefaultTableModel();
    int id;
    /**
     * Creates new form ingresarusuarios
     */
    public ingresarusuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        /*en listamos el metodo listar declarado*/
        listar();
    }
    
    /*En listamos los datos de la entidad cliente con el metodo listar*/
    void listar(){
        List<Cliente> lista=dao.listar();
        modelo=(DefaultTableModel)TABLA.getModel();
        Object[] ob=new Object[7];
        for (int i = 0; i < lista.size(); i++){
            ob[0]=lista.get(i) .getId();
            ob[1]=lista.get(i) .getNombre();
            ob[2]=lista.get(i) .getApellido();
            ob[3]=lista.get(i) .getEdad();
            ob[4]=lista.get(i) .getCelular();
            ob[5]=lista.get(i) .getCedula();
            ob[6]=lista.get(i) .getDireccion();
            modelo.addRow(ob);
        }
        /*llamamos a nuestra tabla*/
        TABLA.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btsalir = new javax.swing.JButton();
        btregresar8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btsalir.setText("Salir");
        btsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnagregar)
                .addGap(44, 44, 44)
                .addComponent(btnmodificar)
                .addGap(58, 58, 58)
                .addComponent(btneliminar)
                .addGap(48, 48, 48)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btsalir)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btnNuevo)
                    .addComponent(btsalir))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 600, 60));

        btregresar8.setText("Regresar");
        btregresar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregresar8ActionPerformed(evt);
            }
        });
        getContentPane().add(btregresar8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Módulo de Ingreso de Usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel3.setText("ID:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Apellidos:");

        jLabel6.setText("Edad:");

        jLabel7.setText("Dirección:");

        jLabel8.setText("Cedula:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel9.setText("Celular:");

        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula)))
                        .addGap(119, 119, 119))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 600, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Base de Datos"));

        TABLA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Edad", "Celular", "Cedula", "Dirección"
            }
        ));
        TABLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TABLA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 600, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalirActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btsalirActionPerformed

    private void btregresar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregresar8ActionPerformed
        // TODO add your handling code here:
        ingresar ingre = new ingresar();
        ingre.setVisible(true);
        ingre.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btregresar8ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // llamamos a los metodos planteados
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // llamamos a nuestros metodos planteados
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // llamamos a nuestros metodos planteados
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // llamamos a nuestros metodos 
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TABLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLAMouseClicked
        // declaramos a nuestra tabla con valor int
        int fila = TABLA.getSelectedRow();
        //definimos una restriccion if - else 
        if(fila == -1){
            //donde si no seleccionamos una fila este no nos permitira modificarla
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            //en caso de haber seleccionado una fila muestre los datos 
           /*int id= Integer.parseInt(TABLA.getValueAt(fila, 0) .toString());*/
          String id= TABLA.getValueAt(fila, 0) .toString();
          String nombre= TABLA.getValueAt(fila, 1) .toString();
          String apellido= TABLA.getValueAt(fila, 2) .toString();
          String edad= TABLA.getValueAt(fila, 3) .toString();
          String celular= TABLA.getValueAt(fila, 4) .toString();
          String cedula= TABLA.getValueAt(fila, 5) .toString();
          String direccion= TABLA.getValueAt(fila, 6) .toString();
          txtId.setText(id);
          txtNombre.setText(nombre);
          txtApellido.setText(apellido);
          txtEdad.setText(edad);
          txtCelular.setText(celular);
          txtCedula.setText(cedula);
          txtDireccion.setText(direccion);
        }
    }//GEN-LAST:event_TABLAMouseClicked

    //declaramos nuestro metodo agregar
    void agregar(){
        //donde llamaremos a nuestras variables 
        String id=txtId.getText();
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String edad=txtEdad.getText();
        String celular=txtCelular.getText();
        String cedula=txtCedula.getText();
        String direccion=txtDireccion.getText();
        Object[] ob=new Object[7];
        ob[0]=id;
        ob[1]=nombre;
        ob[2]=apellido;
        ob[3]=edad;
        ob[4]=celular;
        ob[5]=cedula;
        ob[6]=direccion;
        dao.add(ob);
    }
    
    //declaramos el metodo actualizar
    void actualizar(){
        //sentenciamos que nuestra tabla sea de valor int
        int fila = TABLA.getSelectedRow();
        //colocamos una restriccion
        if(fila==-1){
            //donde debe seleccionar una fila para que sea modificada
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
        // en caso de hacerlo presentar los valores
        String id=txtId.getText();
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String edad=txtEdad.getText();
        String celular=txtCelular.getText();
        String cedula=txtCedula.getText();
        String direccion=txtDireccion.getText();
        Object[] obj=new Object[7];
        obj[0]=id;
        obj[1]=nombre;
        obj[2]=apellido;
        obj[3]=edad;
        obj[4]=celular;
        obj[5]=cedula;
        obj[6]=direccion;
        dao.actualizar(obj);   
        }
    }
    
    //sentenciamos nuestro metodo eliminar
    void eliminar(){
        //sentenciamos nuestro modelo tabla
        int fila = TABLA.getSelectedRow();
        //sentenciamos nuestro id como valor entero 
        int ids= Integer.parseInt(TABLA.getValueAt(fila, 0) .toString());
        //declaramos una restriccion if - else 
        if(fila==-1){
            //donde debemos seleccionar una fila para poder eliminar el registro
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        }else{
            //en caso de ser asi elimine la fila sin conplicaciones
            dao.eliminar(ids);
        }
    }
    
    //sentenciamos nuestro metodo nuevo donde nos permitira registrar nuevos valores
    void nuevo(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtCelular.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtId.requestFocus();
    }
    
    //nuestro metodo limpiarTabla nos permitira limpiar los campos despues de ingresar, actualizar o eliminar datos.
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABLA;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btregresar8;
    private javax.swing.JButton btsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
