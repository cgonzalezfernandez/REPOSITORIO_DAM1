package poo_DAM;

public class Numeros_random_Pablo {

	public static void main(String[] args) {
	int num= 40;
	int sumapar = 0;
	
	for (int i=1;i<=40;i++) {
		num = i;
	if (num%2==0) 
		sumapar++;
		
	}
	System.out.println("Los pares son" +sumapar);    
}
	}
	