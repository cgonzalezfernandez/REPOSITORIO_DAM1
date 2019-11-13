package poo_DAM;

public class Pares {
	public static void main (String[]args) {
		int array[]= new int [20];
		
		for (int i = 0; i <=40; i++) {
			if (i%2==0) {
				System.out.println(i + " es par" );
				for (int j = 0; j < array.length; j++) {
					array[j]=i;
					
				}
			}
			
			
		}
	}

}
