package poo_DAM;

public class pares {
	public static void main(String[]arg) {
		int array[]=new int[6],j=0;
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" es par");
					array[j]=i;
					j++;
			} 
		}
		System.out.println("Se acabo el programa");
	}
}
