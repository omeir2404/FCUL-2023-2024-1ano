public class FossilLinux
{
    public static void main(String[] args)
    {
        int resultado = f(3, 1, 0,4);
    System.out.printf("O resultado e: %d\n", resultado);
    }
    static int f(int a, int b, int c, int x){
        return (a * x * x + b * x + c);
    }
}
