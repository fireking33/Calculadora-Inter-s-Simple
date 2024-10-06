
package interfaz;

import claseCalcu.Calculadora;
import javax.swing.JFrame;

/**
 * Clase que representa una ventana de resultado que muestra si el cliente está de acuerdo con
 * el interés simple calculado. Extiende la clase JFrame para crear una interfaz gráfica.
 */
public class RESULTADO extends javax.swing.JFrame  {
  // Atributos para almacenar los datos
    private String prestamista;
    private String cliente;
    private double montoInicial;
    private double tasaInteres;
    private String tipoInteres;
    private int tiempo;
    private String tipoTiempo;
    private double interesSimple;

   // constructor sin parametros que inicializa la ventana
  public RESULTADO() {
    
    }
   /**
     * Constructor que inicializa la ventana con los datos proporcionados.
     *
     * @param prestamista     Nombre del prestamista.
     * @param cliente         Nombre del cliente.
     * @param montoInicial    Monto inicial del préstamo.
     * @param tasaInteres     Tasa de interés.
     * @param tipoInteres     Tipo de interés (simple o compuesto).
     * @param tiempo          Tiempo del préstamo.
     * @param tipoTiempo      Unidad de tiempo (días, meses, años).
     * @param interesSimple   Valor del interés simple calculado.
     */
    public RESULTADO(String prestamista, String cliente, double montoInicial, double tasaInteres, String tipoInteres, int tiempo, String tipoTiempo, double interesSimple) {
        this.prestamista = prestamista;
        this.cliente = cliente;
        this.montoInicial = montoInicial;
        this.tasaInteres = tasaInteres;
        this.tipoInteres = tipoInteres;
        this.tiempo = tiempo;
        this.tipoTiempo = tipoTiempo;
        this.interesSimple = interesSimple;
        initComponents();
         setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        salidaresultado.setText(String.valueOf(interesSimple));
     } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        salidaresultado = new javax.swing.JLabel();
        No = new javax.swing.JButton();
        Si = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿ Esta de acuerdo ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 60));

        salidaresultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salidaresultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(salidaresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 70, 40));

        No.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        No.setText("NO");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        getContentPane().add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 60, -1));

        Si.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Si.setText("SI");
        Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiActionPerformed(evt);
            }
        });
        getContentPane().add(Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 60, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EL INTERES SIMPLE CALCULADO ES :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoturquesa.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Evento que se activa al presionar el botón "NO".
     * Cierra la ventana actual.
     * 
     * @param evt Evento que contiene información sobre la acción.
     */
    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        this.dispose(); //Cierra la ventana
    }//GEN-LAST:event_NoActionPerformed
/**
     * Evento que se activa al presionar el botón "SI".
     * Llama al método guardarTxt de la clase Calculadora para guardar los datos
     * y luego cierra la ventana.
     * 
     * @param evt Evento que contiene información sobre la acción.
     */
    private void SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiActionPerformed
        
// Llama al método guardarTxt de la clase Calculadora
        Calculadora.guardarTxt(prestamista, cliente, montoInicial, tasaInteres, tipoInteres, tiempo, tipoTiempo, interesSimple);
        this.dispose(); //Cierra la ventana
    }//GEN-LAST:event_SiActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton No;
    private javax.swing.JButton Si;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel salidaresultado;
    // End of variables declaration//GEN-END:variables
}

