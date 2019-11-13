package poo_DAM;
import java.util.Scanner;
public class NumeroPares {

	public static void main(String[] args) {
		Scanner entidad=new Scanner(System.in);
		int Numero=0;
		int NumLimit=0;
		int par=0;
		System.out.println("Introduzca un numero para saber cuantos pares hay");
		NumLimit=entidad.nextInt();
		
			for (int i = 1; i <=NumLimit; i++) {
				Numero=i;
				if(Numero%2==0) {
				par++;
				
			}
		}System.out.println("Hay "+par+" pares");
			}
			
	}

