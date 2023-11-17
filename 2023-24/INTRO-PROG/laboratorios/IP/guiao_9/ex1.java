import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args)
	{
		int size = 10;
		Scanner scan = new Scanner(System.in);
		int[] v = new int[size];
		System.out.print("Introduz um numero entre 1-10: ");
		v[0] = scan.nextInt();
		System.out.print("Introduz ate 9 numeros entre 1-20(fora de intervalo para parar de introduzir): ");
		int i = 1;			
		v[i] = scan.nextInt();
		while(v[i] < 20 && v[i] > 0 && i < 9)
		{
			i++;
			System.out.print(i + " :");
			v[i] = scan.nextInt();
		}
		if (v[i] > 20 && v[i] < 0)
			v[i] = 0;
		System.out.println("media: " + UtilsIP.mean(v));
		System.out.println("numeros maior do que 10: " + UtilsIP.howManyLargerThanThis(v, 10));
		int[] v1 = new int[]{1,2,5,6};
		// int v2[] = {1,2,5,6};
		System.out.println("comparacao de arrays: " + Arrays.equals(v1,new int[]{1,3,5,6}));
		scan.close();
	}
}
