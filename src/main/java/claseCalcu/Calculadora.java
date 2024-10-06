
package claseCalcu;

import interfaz.LOGIN; 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Clase principal que contiene métodos para calcular el interés simple y guardar datos
 * de un cliente en un archivo de texto. También inicializa la ventana de inicio de sesión.
 */
public class Calculadora {
    /**
     * Método principal que inicia la aplicación.
     * Crea e inicia la ventana del login.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LOGIN(); // Crea e inicia la ventana del login
        });
        
    }
    
    /**
     * Método para calcular el interés simple.
     * Ajusta la tasa de interés y el tiempo según las selecciones del usuario.
     *
     * @param montoInicial Monto inicial sobre el que se calcula el interés.
     * @param tasaInteres Tasa de interés a aplicar.
     * @param tiempo Tiempo durante el cual se aplica el interés.
     * @param tipoInteres Tipo de interés (mensual o anual).
     * @param tipoTiempo Unidad de tiempo (días, meses o años).
     * @return El interés simple calculado.
     */
    public static double calcularInteresSimple(double montoInicial, double tasaInteres, int tiempo, String tipoInteres, String tipoTiempo) {
        // Ajustar la tasa de interés y el tiempo según las selecciones del usuario
        if (tipoInteres.equals("mensual") && tipoTiempo.equals("años")) {
            tiempo = tiempo * 12; // convertir años a meses
        } else if (tipoInteres.equals("anual") && tipoTiempo.equals("meses")) {
            tiempo = tiempo / 12; // convertir meses a años
        }
        
        // Calcular el interés simple
        return montoInicial * tasaInteres * tiempo;
    }
    
    /**
     * Método para guardar los datos del cliente en un archivo de texto.
     *
     * @param prestamista Nombre del prestamista.
     * @param cliente Nombre del cliente.
     * @param montoInicial Monto inicial del préstamo.
     * @param tasaInteres Tasa de interés.
     * @param tipoInteres Tipo de interés (mensual o anual).
     * @param tiempo Tiempo del préstamo.
     * @param tipoTiempo Unidad de tiempo (días, meses o años).
     * @param interesSimple Valor del interés simple calculado.
     * @throws IOException Si ocurre un error al intentar escribir en el archivo.
     */
    public static void guardarTxt(String prestamista, String cliente, double montoInicial, double tasaInteres, String tipoInteres, int tiempo, String tipoTiempo, double interesSimple) {
       String archivo = "DATOS DEL CLIENTE " + cliente + ".txt"  ;
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter (escribir); 
            buffer.write("Prestamista: " + prestamista);
            buffer.newLine();
            buffer.write("Cliente: " + cliente);
            buffer.newLine();
            buffer.write("Monto Inicial: " + montoInicial);
            buffer.newLine();
            buffer.write("Tasa de Interés: " + tasaInteres+" " + tipoInteres);
            buffer.newLine();
            buffer.write("Tiempo: " + tiempo + " " + tipoTiempo);
            buffer.newLine();
            buffer.write("Interés Simple Calculado: " + interesSimple);
            buffer.newLine();
            buffer.write("----------------------------");
            buffer.newLine();
            // Asegurarse de que se guarden los datos en el archivo
        buffer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
    
    


