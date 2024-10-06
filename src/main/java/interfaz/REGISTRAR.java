
package interfaz;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase que representa una ventana de registro para usuarios.
 * Permite a los usuarios ingresar un nombre de usuario y una contraseña,
 * y guardar estos datos en un archivo de texto si se cumplen las condiciones.
 */
public class REGISTRAR extends javax.swing.JFrame {
/**
     * Crea una nueva instancia de la clase REGISTRAR.
     * Inicializa los componentes de la interfaz gráfica y configura la ventana.
     */
   public REGISTRAR() {
    initComponents();
    setSize(516, 449);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        agregarusuario = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        agregarcontraseña = new javax.swing.JPasswordField();
        confirmarcontraseña = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Confirmar Contraseña :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 50));

        agregarusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        agregarusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agregarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(agregarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 210, 30));

        Cancelar.setBackground(new java.awt.Color(255, 255, 51));
        Cancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 343, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("    Usuario :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 50));

        aceptar.setBackground(new java.awt.Color(255, 255, 0));
        aceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 343, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("  Contraseña :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 170, 50));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simbolo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        agregarcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agregarcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcontraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 182, 210, 30));

        confirmarcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(confirmarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 242, 210, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 700, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /**
 * Método que se ejecuta cuando el usuario presiona el botón "Aceptar" en el formulario de registro.
 * Este método maneja la lectura de los campos de usuario y contraseña, valida su contenido,
 * y guarda la información en un archivo de texto si todo es correcto.
 *
 * @param evt Evento que contiene información sobre la acción del usuario.
 * @throws IOException Si ocurre un error al intentar guardar el usuario en el archivo.
 * @throws IllegalArgumentException Si algún campo está vacío o las contraseñas no coinciden.
 */
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
    //leer los valores de Usuario y Contraseña
        String usuario = agregarusuario.getText().toUpperCase().trim(); //Obtener el nombre de usuario
        String contraseña = new String (agregarcontraseña.getPassword()); //Obtener la contraseña
        String confcontraseña = new String (confirmarcontraseña.getPassword());//Obtener la confirmacion de la contraseña
    //verificar si Usuario o Contraseña estan vacios
        if (usuario.isEmpty()|| contraseña.isEmpty()|| confcontraseña.isEmpty()){
             // Mostrar un mensaje de advertencia si algún campo está vacío
            JOptionPane.showMessageDialog(this,"rellene todos los campos");
               return;
        }
    //verificar si las contraseñas coinciden si es asi guardar en un txt        
        if (!contraseña.equals(confcontraseña)){
                JOptionPane.showMessageDialog(this,"las contraseñas no coinciden");
        }else{
            // Si las contraseñas coinciden, intentar guardar los datos
            try{
                // Crear un FileWriter en modo de agregar (true)
                FileWriter escribir = new FileWriter("usuarios.txt", true);
                BufferedWriter buffer = new BufferedWriter(escribir);
                // Escribir el usuario y la contraseña en el archivo
                buffer.write(usuario + " : " + contraseña );
                buffer.newLine();
                buffer.close();
                JOptionPane.showMessageDialog(this,"usuario registrado con exito");
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(this, "error al guardar usuario");
            }
            // Cerrar la ventana de registro
            this.dispose();
            // Abrir la ventana de inicio de sesión
            LOGIN login = new LOGIN();
            login.setVisible(true);
        }      
                
    }//GEN-LAST:event_aceptarActionPerformed
/**
 * Acción que se ejecuta al presionar el campo de texto del nombre de usuario.
 * Este método se activa cuando el usuario presiona la tecla Enter.
 * @param evt Evento generado al interactuar con el campo de texto.
 */
    private void agregarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarusuarioActionPerformed
        
    }//GEN-LAST:event_agregarusuarioActionPerformed
 /**
     * Acción que se ejecuta al presionar el botón CANCELAR.
     * Cierra la ventana de registro y abre la ventana de inicio de sesión.
     *
     * @param evt Evento generado al presionar el botón.
     */
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
        LOGIN login = new LOGIN();
    }//GEN-LAST:event_CancelarActionPerformed
/**
 * Acción que se ejecuta al presionar el campo de texto de la contraseña,para poner la contraseña
 * Este método se activa cuando el usuario presiona la tecla Enter.

 * @param evt Evento generado al interactuar con el campo de texto.
 */
    private void agregarcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcontraseñaActionPerformed
        
    }//GEN-LAST:event_agregarcontraseñaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton aceptar;
    private javax.swing.JPasswordField agregarcontraseña;
    private javax.swing.JTextField agregarusuario;
    private javax.swing.JPasswordField confirmarcontraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
