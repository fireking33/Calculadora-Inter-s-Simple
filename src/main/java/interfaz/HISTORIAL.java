
package interfaz;

import java.io.BufferedReader;
import javax.swing.JFrame;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase que representa la interfaz gráfica para visualizar el historial de un cliente.
 * Esta clase hereda de JFrame y proporciona una ventana donde el usuario puede ingresar
 * el nombre de un cliente y ver su historial asociado.
 */
public class HISTORIAL extends javax.swing.JFrame {
/** Ruta del archivo donde se almacena el historial del cliente. */
  String ruta ;
  /**
     * Crea una nueva instancia de la clase HISTORIAL y configura la interfaz gráfica.
     */
  public HISTORIAL() {
    initComponents();
    setSize(516, 449);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        verHistorial = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        ingresarcliente = new javax.swing.JTextField();
        Okey = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verHistorial.setColumns(20);
        verHistorial.setRows(5);
        jScrollPane1.setViewportView(verHistorial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 450, 260));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE  :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 20));

        ingresarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarclienteActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 210, -1));

        Okey.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Okey.setText("OK");
        Okey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeyActionPerformed(evt);
            }
        });
        getContentPane().add(Okey, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  /**
     * Maneja el evento de acción cuando se presiona Enter en el campo de texto 
     * para ingresar el nombre del cliente.
     * Llama al método {@link #mostrarHistorial()} para mostrar el historial del cliente.
     *
     * @param evt El evento de acción que contiene información sobre la acción.
     */
    private void ingresarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarclienteActionPerformed
        // Llamamos al método para mostrar el historial cuando se presione Enter en el JTextField
        mostrarHistorial();
    }//GEN-LAST:event_ingresarclienteActionPerformed
/**
     * Maneja el evento de acción cuando se presiona el botón "OK".
     * Cierra la ventana actual y abre el menú principal.
     *
     * @param evt El evento de acción que contiene información sobre la acción.
     */
    private void OkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeyActionPerformed
        MENU menu = new MENU();
        this.dispose(); //Cierra la ventana
    }//GEN-LAST:event_OkeyActionPerformed
 /**
     * Muestra el historial del cliente en el área de texto correspondiente.
     * Obtiene el nombre del cliente del campo de texto, llama al método 
     * {@link #obtenerHistorial(String)} para obtener el historial y lo 
     * muestra en el área de texto.
     */
  private void mostrarHistorial() {
    String cliente = ingresarcliente.getText().toUpperCase().trim();
    String historial = obtenerHistorial(cliente); // Obtener el historial del cliente
    verHistorial.setText(historial); // Establece el texto del JTextArea al historial obtenido
}
  
  /**
 * Obtiene el historial de un cliente a partir de un archivo de texto.
 * 
 * Este método lee un archivo específico que contiene el historial del cliente
 * y devuelve el contenido del archivo como un String. Utiliza un StringBuilder
 * para acumular el historial de manera eficiente.
 *
 * @param cliente El nombre del cliente cuyo historial se desea obtener. Este 
 *                nombre se utiliza para construir la ruta del archivo.
 * @return Un String que representa el historial del cliente. 
 *         Si ocurre un error al leer el archivo, lanza una IOException.
 * @throws IOException Si ocurre un error al intentar leer el archivo.
 */
 private String obtenerHistorial(String cliente) {
     
        StringBuilder historial = new StringBuilder(); // Usamos StringBuilder para construir el historial
        String archivo = "C:/Users/maqui/OneDrive/Documentos/NetBeansProjects/Calculadora/DATOS DEL CLIENTE " + cliente + ".txt" ;
        try {
            FileReader leer = new FileReader(archivo);
            BufferedReader leerbuffer = new BufferedReader(leer);
            String linea;
            while ((linea = leerbuffer.readLine()) != null) { // Leemos cada línea del archivo
            historial.append(linea).append("\n"); // Agregamos la línea al historial
            
        }
           
    } catch (IOException e) {
        e.printStackTrace(); // Imprimimos el error
        return "Error al leer el historial"; // Mensaje en caso de error
    }

    return historial.toString(); // Devolvemos el historial como un String
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Okey;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingresarcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea verHistorial;
    // End of variables declaration//GEN-END:variables
}
