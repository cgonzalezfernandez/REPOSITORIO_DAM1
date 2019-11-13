package poo_DAM;

import java.util.Scanner;

public class numeros_pares {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		int num=0;
		System.out.println("Introduce un número: ");
		num=entrada.nextInt();
		for(int i=num;i<=40;i++) {
			num=i;
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
