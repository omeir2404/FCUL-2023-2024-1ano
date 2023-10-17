public class ex04{
	public static void main(String[] args)
    {
        int n = 8;
        int val = 1;
        int count = 1;

        while (count <= n)
        {
            val *= count;
            count++;
        }
        System.out.println(val);

        int aux = 1;
        while (aux <= n)
        {
            if (n % aux == 0)
                System.out.println("um divisor de n é " + aux);
            aux++;
        }
        aux = 1;
        int countn = 0;
        while (aux <= n)
        {
            if (n % aux == 0)
                countn++;
            aux++;
        }
        System.out.println("o numero de divisores de n é " + countn);
        aux = 1;
        int totval = 0;
        while (aux <= n)
        {
            if (n % aux == 0)
                totval += aux;
            aux++;
        }
        System.out.println("a soma das divisores de n é " + totval);


    }
}
