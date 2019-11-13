package poo_DAM;

import java.util.Arrays;

public class Numerospares_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[20];
		for (int i = 1; i <= 40; i++) {
			if(i%2==0) {
				for (int j = 0; j < array.length; j++) {
					array[j]=i;
				}
			}
		}System.out.println(Arrays.toString(array));
	}

}
