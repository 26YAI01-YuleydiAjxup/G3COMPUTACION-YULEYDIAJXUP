/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3_joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author yuley
 */
public class EjerciciosGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombreCorrecto = "Yuleydi Ajxup";
        String nombreIngresado = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Inicio sesión",JOptionPane.QUESTION_MESSAGE);
        
        if (nombreIngresado != null && nombreIngresado.equals(nombreCorrecto)) {
            JOptionPane.showMessageDialog(null, "Bienvenida" + nombreIngresado, "Acceso Concedido", JOptionPane.INFORMATION_MESSAGE);
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?,", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION );
            
            if (respuesta == JOptionPane.YES_OPTION) {
            
                Object[] opciones = {"Sí, gracacias", "No, gracias", "Mas..."}; 
                
                JOptionPane.showOptionDialog(null,"¿Se ha solucionado el problema?", "Soluciones", JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Dato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
          }  
       }
}
