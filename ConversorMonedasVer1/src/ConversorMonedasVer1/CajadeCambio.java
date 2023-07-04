package ConversorMonedasVer1;

import javax.swing.JOptionPane;

public class CajadeCambio {
	
	
	public static void main(String[] args) {
		//valores referenciados 2 julio de 2023
		double dolar = 4155.75;
		double euro  = 4534.53;
		double libra = 4155.75;
		double yen = 28.79;
		double won = 3.21;

    	// Validación de entrada de datos y corrección de excepciones al presionar Cancel - Cerrar    
			   	Double valor = null;
				do {
				    try {
				    	
				    	String input = JOptionPane.showInputDialog("Ingrese la Cantidad de Dinero que deseas Convertir:");
				        if (input == null) {
				            JOptionPane.showMessageDialog(null, "Programa Finalizado");
				            System.exit(0); // Salir del programa si se presiona "Cancel" o se cierra el cuadro de diálogo
				        }
				    					    	
				        valor = Double.parseDouble(input);
				        JOptionPane.showMessageDialog(null, "Valor a Convertir es.: " + valor);
				        break; // Salir del bucle si el valor es válido
				    } catch (NumberFormatException e){
				        JOptionPane.showMessageDialog(null, "Valor no válido. Inténtelo de nuevo.");
				      }
				} while (valor == null);

			
			    Object [] moneda ={"De Pesos a Dólar","De Pesos a Euro","De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos","De Euro a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}; 
				Object opcionMoneda = JOptionPane.showInputDialog(null,"Selecciona una Opción de Conversión", "Menú",JOptionPane.QUESTION_MESSAGE,null,moneda, moneda[0]);
				
				String respMoneda = (String)opcionMoneda;
				
				switch (respMoneda) {
						case "De Pesos a Dólar":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							MonedaDivisa(valor, dolar);
							break;
						case "De Pesos a Euro":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							MonedaDivisa(valor, euro);
							break;
						case "De Pesos a Libras":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							MonedaDivisa(valor, libra);
							break;
						case "De Pesos a Yen":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							MonedaDivisa(valor, yen);
							break;
						case "De Pesos a Won Coreano":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							MonedaDivisa(valor, won);
							break;
						case "De Dólar a Pesos":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							DivisaMoneda(valor, dolar);
							break;
						case "De Euro a Pesos":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							DivisaMoneda(valor, euro);
							break;
						case "De Libras a Pesos":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							DivisaMoneda(valor, libra);
							break;
						case "De Yen a Pesos":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							DivisaMoneda(valor, yen);
							break;
						case "De Won Coreano a Pesos":
							JOptionPane.showMessageDialog(null, "Escogiste " + respMoneda);
							DivisaMoneda(valor, won);
							break;
				} // fin del switch 
				
	} // Finaliza public static void main

	// Funciones para la conversión de las divisas
	public static void MonedaDivisa(Double monedaLocal, Double Divisa)
    {
        Double Resultado = monedaLocal/Divisa; 	        
        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
        JOptionPane.showMessageDialog(null, "Resultado de la Conversión es.: " + String.format("%.2f", Resultado));
    }
 
	 public static void DivisaMoneda(Double monedaLocal, Double Divisa)
	 {
	     Double Resultado = Divisa * monedaLocal; 	        
	     //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
	     JOptionPane.showMessageDialog(null, "Resultado de la Conversión es.: " + String.format("%.2f", Resultado));
	 }
} //Finaliza public class CajadeCambio
