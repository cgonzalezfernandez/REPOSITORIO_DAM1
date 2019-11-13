package poo_DAM;
import java. util. Scanner;
public class ejemplo {

		public static void main(String[]args) {
				
			System.out.println("Introduce un número");
			Scanner entrada= new Scanner(System.in);
			int num;
			num=entrada.nextInt();
			for (int i = num; i <=40; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			
		
	}
	System.out.println("Estos son los números pares desde el que has introducido hasta el 40");
		}


	}
