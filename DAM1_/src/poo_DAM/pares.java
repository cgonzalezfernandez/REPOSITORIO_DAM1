package poo_DAM;

public class pares {
	public static void main(String[]arg) {
		int array[]=new int[20];
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" es par");
				
				for(int j=0;j<array.length;j++) {
					array[j]=i;	
				}
			} 
		}
		System.out.println("se acabo el programa");
	}
	
}
