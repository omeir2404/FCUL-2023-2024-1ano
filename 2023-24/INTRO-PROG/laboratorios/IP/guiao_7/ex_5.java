public class ex_5 {
    public static String representacaoBinario(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args)
    {
        System.out.println(representacaoBinario(69));
    }
}
