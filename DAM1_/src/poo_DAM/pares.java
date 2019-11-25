package poo_DAM;

public class pares {
	public static void main(String[]arg) {
		int array[]=new int[20];
		int indexI = 0;
		for(int i=0;i<=40;i++) {
			if(i%2==0) {
				System.out.println(i+" es par");
				indexI = i;
					array[indexI]=i;
			} 
		}
		System.out.println("se acabo");
	}
}
