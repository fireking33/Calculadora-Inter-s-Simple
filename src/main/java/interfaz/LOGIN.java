
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase que representa la ventana de inicio de sesión (LOGIN) de la aplicación.
 * Esta clase extiende JFrame y contiene componentes gráficos para la
 * introducir los datos usuario y contraseña, así como botones para iniciar sesión,
 * registrarse y salir.
 */
public class LOGIN extends javax.swing.JFrame {
 /**
     * Constructor de la clase LOGIN. Inicializa los componentes de la ventana,
     * establece el tamaño (setSize), la posición (setLocationRelativeTo) y la operación de cierre (setDefaultCloseOperation).
     */
   public LOGIN() {
    initComponents();
    setSize(516, 449);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    Salir.addActionListener(new ButtonClickListener());
}

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingresarusuario = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Iniciar = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        ingresarcontraseña = new javax.swing.JPasswordField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INTERES SIMPLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 320, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTRASEÑA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 150, 70));

        ingresarusuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ingresarusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingresarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 270, 30));

        Salir.setBackground(new java.awt.Color(255, 255, 0));
        Salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salir.setText("SALIR");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USUARIO :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 150, 50));

        Iniciar.setBackground(new java.awt.Color(255, 255, 0));
        Iniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 30));

        Registrar.setBackground(new java.awt.Color(255, 255, 0));
        Registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registrar.setText("REGISTRARSE");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 140, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/simbolo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 130));

        ingresarcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ingresarcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 270, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        fondo.setText("jLabel5");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Maneja el evento de acción para el botón "Iniciar".
     * Verifica las credenciales del usuario ingresado y,
     * si son válidas, abre la ventana del menú.
     * 
     * @param evt el evento de acción
     */

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
    //leer los valores de Usuario y Contraseña
        String usuario = ingresarusuario.getText().toUpperCase().trim();
        String contraseña = new String(ingresarcontraseña.getPassword());
 
    //verificar si Usuario o Contraseña son incorrectos
        if (usuario.isEmpty()|| contraseña.isEmpty()){
            JOptionPane.showMessageDialog(this,"rellene todos los campos");
        }else{
            if (verificarCredenciales(usuario,contraseña)){
                //JOptionPane.showMessageDialog(this,"BIENVENIDO");
                MENU menu = new MENU();
                menu.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
        } 
            
    }//GEN-LAST:event_IniciarActionPerformed

    /**
 * Verifica si las credenciales de usuario y contraseña proporcionadas son válidas
 * comparándolas con los datos almacenados en el archivo "usuarios.txt".
 *
 * @param usuario     El nombre de usuario que se desea verificar.
 * @param contraseña  La contraseña correspondiente al nombre de usuario.
 * @return           {@code true} si las credenciales son válidas; de lo contrario, {@code false}.
 * @throws IOException si ocurre un error al leer el archivo de usuarios.
 */
private boolean verificarCredenciales(String usuario, String contraseña) {
    try {
        FileReader leer = new FileReader("usuarios.txt");
        try (BufferedReader bufferleer = new BufferedReader(leer)) {
            String linea;
            while ((linea = bufferleer.readLine()) != null) {
                String[] partes = linea.split(":"); //  formato "usuario : contraseña"
                if (partes.length == 2) {
                    String usuariotxt = partes[0].trim();
                    String contraseñatxt = partes[1].trim();
                    
                    // Verificar si coinciden el usuario y la contraseña
                    if (usuario.equals(usuariotxt) && contraseña.equals(contraseñatxt)) {
                        bufferleer.close();
                        return true; // Credenciales válidas
                    }
                }
            }
        }
        }catch (IOException e) { // Si no se puede leer el archivo
        JOptionPane.showMessageDialog(this, "Error al leer el archivo de usuarios."); //muestra mensaje de error
      
        }
       return false;  // Credenciales inválidas
    }    
    /**
 * Maneja el evento de acción generado cuando se interactúa con el campo de texto
 * para ingresar el nombre de usuario.
 *
 * @param evt El evento de acción que se genera al interactuar con el campo de texto.
 */
    private void ingresarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarusuarioActionPerformed
       
    }//GEN-LAST:event_ingresarusuarioActionPerformed
/**
     * Maneja el evento de acción para el botón "Registrarse".
     * Abre la ventana de registro y cierra la ventana de inicio de sesión.
     * 
     * @param evt el evento de acción
     */
    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
     REGISTRAR registrar = new REGISTRAR();
     this.dispose();
        
    }//GEN-LAST:event_RegistrarActionPerformed
/**
     * Clase interna para manejar los eventos de acción de los botones.
     */
private  class ButtonClickListener implements ActionListener {
      
        @Override
        public void actionPerformed(ActionEvent e) {
            // Obtener el texto del campo de texto
           
           
              dispose(); //cierra la ventana actual
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel fondo;
    private javax.swing.JPasswordField ingresarcontraseña;
    private javax.swing.JTextField ingresarusuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
