package poo_DAM;

public class pares {
	public static void main(String[]arg) {
		int array[]=new int[21];
		int par=0;
			for(int i=0;i<=40;i++) {
				if(i%2==0){
						par=i;
						array[i]+=par;
						System.out.print(array);	
				}	
			}
	}
}
