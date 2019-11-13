package poo_DAM;

public class pares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int array[] = new int[40];
	for (int i = 0; i < 40; i++)
	{
		array[i] = (int)(Math.random() * 100) + 1;
	}
	
		for (int i=0; i < array.length; i++)
		{
			if (array[i] % 2 == 0)
			System.out.println("par: " + array[i]);
		}
	}
}
