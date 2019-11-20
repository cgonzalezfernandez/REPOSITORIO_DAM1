package poo_DAM;import java.util.Arrays;

public class nro_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nro = (int)(Math.random()*100);
		
		int [] numero = new int[nro];
		
		
		for (int i = 2; i <= nro ; i++) {
			
			if (i % 2== 0) {
				
				
				System.out.println(i);
			}
			
		}
	}

}
