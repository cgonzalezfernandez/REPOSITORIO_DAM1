package poo_DAM;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_5numeros_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
		ArrayList<Integer> num_pantalla = new ArrayList<Integer>();
			 int n;
			 int num;
			 int suma =0;
//			 
			
				
				 for (int i = 0; i <5; i++) {
//					 System.out.print("Introduce un n�mero: ");
//					 
//					 String entradaTeclado = "";
//					 Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
					 try {
//					 n = entradaEscaner.nextInt(); //Invocamos un m�todo sobre un objeto Scanner
					 suma += i;
					 num_pantalla.add(i);
					 
					 }catch (Exception e) {
							System.out.println("Ese n�mero es incorrecto");
							System.exit(1);
						}
					 } //fin de for que pide n�meros
				 System.out.print("La suma de las cinco cifras es: " +suma);
				 System.out.print("\n");
					 //Se pinta el array invertido
					 
					 int long_array = num_pantalla.size();
					 int cont_temporal=0;
					 for (int index = long_array; index >0; index--) {
						 
						 
						 System.out.print("Cada componente invertido es: " +num_pantalla.get(long_array-1-cont_temporal));
						 System.out.print("\n");
						 cont_temporal++;
						 
					 
				 } 
					 
				 
			
			 
			 
			 

			 
	}

}
