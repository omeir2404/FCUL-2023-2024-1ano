/**
 * Este programa contém vários erros sintáticos, lógicos e de execução.
 * Desafio: tente identificar e corrigir todos os erros presentes no programa.
 *
 * Compilar:	javac SegundoDesafio.java
 * Executar:	java SegundoDesafio 
 * 
 * @author Wellington Oliveira IP2223
 * @author Andreia Mordido IP2223
 */

public class SegundoDesafio {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        boolean eDiferente = false;

        double media = media(a, b);
        System.out.println("Media de " + a + " e " + b + ": " + media);
        System.out.println(" > valor correto: 12.5");

        boolean eMaior = maiorQue(b, a);
        System.out.println(b + " maior do que " + a + "? " + eMaior);
        System.out.println(" > valor correto: true");

        eDiferente = a != b;
        System.out.println(a + " diferente de " + b + "? " + eDiferente);
        System.out.println(" > valor correto: true");
    }

    public static double media(int valor1, int valor2) {
        double avg = (valor1 + valor2) / 2.0;
        return avg;
    }

    public static boolean maiorQue(int valor1, int valor2) {
        boolean greater = true;
        greater = valor1 > valor2;
        return greater;
    }
}
