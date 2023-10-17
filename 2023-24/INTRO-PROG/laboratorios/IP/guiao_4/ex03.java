public class ex03{

    static int power_of_10(int num)
    {
        int count = 1, power = 1; 
        while (count <= num)
            power *= 10;
        return (power);
    }
	public static void main(String[] args)
    {

		int n = 5;
        int i = -1;
        while (++i <= n)
            System.out.print(" o " + i + "multiplo de 3 é: " + 3*i);
        i = 0;    
        System.out.println();
        for(int l = i; l <= n; l++)
        {
            System.out.print(((2*i) + 1) + " ");
            i += 1;
        }
        System.out.println();
        for (i = 1; i <= n; i++)
        {
            System.out.println("a " + i + "potencial de 10 é:" + Math.pow(10, i));
        }

    }

}
