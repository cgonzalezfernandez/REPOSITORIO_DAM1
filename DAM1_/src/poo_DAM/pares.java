package poo_DAM;

import java.util.Arrays;

public class pares {
	public static void main(String[] args) {
		int par[]= new int[21];
		int pospar = 0;
		for (int i = 0; i <41; i++) {
			
			if((i%2)==0) {
				par[pospar]=i;
				pospar++;
		}
	}System.out.println(Arrays.toString(par));
}
}