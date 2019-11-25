package poo_DAM;

public class pares {
	public static void main(String[]arg) {
		int j=0;
		int array[]=new int[20];
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" es par");
					array[j]=i;				
					j++;
				
			} 	
		}
		System.out.println("Se acabó el programa");
	}

}

