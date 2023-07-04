package ConversorMonedasVer1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        do {
           
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);

            if (opcion == JOptionPane.NO_OPTION || opcion == JOptionPane.CANCEL_OPTION) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            } else {
            	// Validación de entrada de datos y corrección de excepciones al presionar Cancel - Cerrar 
        		Object [] caso ={"Conversor de Monedas","Conversor de Temperatura"}; 
        		Object opcion2 = JOptionPane.showInputDialog(null,"Selecciona una Opción de Conversión", "Menú",JOptionPane.QUESTION_MESSAGE,null,caso, caso[0]);

        		if (opcion2 == null) {
        		    JOptionPane.showMessageDialog(null, "Programa Finalizado");
        		    System.exit(0); // Salir del programa si se presiona "Cancel" o se cierra el cuadro de diálogo
        		} else {
        		    String resp = (String) opcion2;
        		    switch (resp) {
            				case "Conversor de Monedas": CajadeCambio.main(args); break;
            				case "Conversor de Temperatura": Temperatura.main(args); ;break;
            		}// Finaliza switch
        		} // Finaliza el Sino - Else
            	
            } // Finaliza el sino del primer control
        } while (continuar);  // Finaliza el Do
    
    } // Finaliza public static void main
 
} // Finaliza el public class Main 

