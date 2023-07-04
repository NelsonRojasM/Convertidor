package ConversorMonedasVer1;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
	
		//Object [] temperatura ={"De Celsius a Fahrenheit","De Fahrenheit a Celsius","De Kelvin a Celsius","De Celsius a Kelvin"}; 
		//Object opcionTemperatura = JOptionPane.showInputDialog(null,"Selecciona una Opción de Conversión", "Menú",JOptionPane.QUESTION_MESSAGE,null,temperatura, temperatura[0]);
		//String respTemperatura = (String)opcionTemperatura;
	
		Object[] temperatura = {"De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Kelvin a Celsius", "De Celsius a Kelvin"};
		Object opcionTemperatura = JOptionPane.showInputDialog(null, "Selecciona una Opción de Conversión", "Menú", JOptionPane.QUESTION_MESSAGE, null, temperatura, temperatura[0]);

		if (opcionTemperatura == null) {
		    JOptionPane.showMessageDialog(null, "Programa Finalizado");
		    System.exit(0); // Salir del programa si se presiona "Cancel" o se cierra el cuadro de diálogo
		} else {
		    String respTemperatura = (String) opcionTemperatura;
		    // Resto del código si se selecciona una opción válida
		    // ...
		    
		 // Validación de entrada de datos Temperatura y corrección de excepciones al presionar Cancel - Cerrar 
			
			Double grado = null;
			do {
			    try {
			    	
			    	String input = JOptionPane.showInputDialog("Ingrese Grados a Convertir.: ");
			        if (input == null) {
			            JOptionPane.showMessageDialog(null, "Programa Finalizado");
			            System.exit(0); // Salir del programa si se presiona "Cancel" o se cierra el cuadro de diálogo
			        }
			    					    	
			        grado = Double.parseDouble(input);
			        JOptionPane.showMessageDialog(null, "Valor a Convertir es.: " + grado);
			        break; // Salir del bucle si el valor es válido
			    } catch (NumberFormatException e){
			        JOptionPane.showMessageDialog(null, "Valor no válido. Inténtelo de nuevo.");
			      }
			} while (grado == null);
			
			
			
			switch (respTemperatura) {
					case "De Celsius a Fahrenheit":
						JOptionPane.showMessageDialog(null, "Escogiste " + opcionTemperatura);
						CelsiusFaren(grado);
						break;
					case "De Fahrenheit a Celsius":
						JOptionPane.showMessageDialog(null, "Escogiste " + opcionTemperatura);
						FarenCelsius(grado);
						break;
					case "De Kelvin a Celsius":
						JOptionPane.showMessageDialog(null, "Escogiste " + opcionTemperatura);
						KelvinCelsius(grado);
						break;
					case "De Celsius a Kelvin":
						JOptionPane.showMessageDialog(null, "Escogiste " + opcionTemperatura);
						CelsiusKelvin(grado);
						break;
			}
		} // Fin del sino - ELSE

		
	} // Fin del Main
	
	//Funciones para la Temperatura
		 public static void CelsiusFaren(Double grados)
		    {
		        Double Fahrenheit = (grados * 1.8)+32; 	        
		        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
		        JOptionPane.showMessageDialog(null, "Sus ºC a ºFahrenheit es.: " + String.format("%.1f", Fahrenheit)+" ºF");
		    }
		 
		 public static void FarenCelsius(Double grados)
		    {
		        Double Celsius = (grados - 32)/1.8 ;	        
		        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
		        JOptionPane.showMessageDialog(null, "Sus ºF a ºCelsius es.: " + String.format("%.1f", Celsius)+" ºC");
		    }
		 
		 public static void KelvinCelsius(Double grados)
		    {
		        Double Celsius = (grados - 273.15);	        
		        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
		        JOptionPane.showMessageDialog(null, "Sus ºK a ºCelsius es.: " + String.format("%.1f", Celsius)+" ºC");
		    }
		 
		 public static void CelsiusKelvin(Double grados)
		    {
		        Double Kelvin = (grados + 273.15);	        
		        //Si no son válidos entonces mostramos el mensaje de error de la funcion error.
		        JOptionPane.showMessageDialog(null, "Sus ºC a ºKelvin es.: " + String.format("%.1f", Kelvin)+" ºK");
		    }


} // Fin del public class Temperatura
