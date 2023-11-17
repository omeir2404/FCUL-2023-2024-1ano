import java.util.Random;
import java.util.Scanner;

/**
 * A classe {@code UtilsIP} inclui varios procedimentos e funcoes uteis em IP.
 *
 * @author antonialopes IP1920
 */

public class UtilsIP {

    /**
     * Calcula a media de um vetor de inteiros.
     *
     * @param v O vetor com os valores
     * @return A media dos valores no vetor
     * @requires {@code v != null}
     */
    public static double mean(int[] v) {
        double soma = 0;
        for (int i = 0; i < v.length; i++)
            soma += v[i];
        return soma / v.length;
    }

    /**
     * Baralha o vetor dado
     *
     * @param v O vetor a baralhar
     * @requires {@code v != null}
     */
    public static void shuffle(int[] v) {
        Random rd = new Random();
        for (int i = 0; i < v.length; i++) {
            int r = i + rd.nextInt(v.length - i); // entre i e v.length-1
            int temp = v[i];
            v[i] = v[r];
            v[r] = temp;
        }
    }

    /**
     * Imprime os elementos de um vetor de inteiros separados por espacos De
     * interesse apenas pedagogico. Para imprimir vetor qq devem usar
     * System.out.println(Arrays.toString(v))
     *
     * @param v O vetor a imprimir
     * @requires {@code v != null}
     */
    public static void print(int[] v) {
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " ");
        System.out.println();
    }

    /**
     * Le um valor inteiro no intervalo [min,max]. Se numero lido nao verifica a
     * condicao repete a leitura, acompanhado de mensagem de erro. A leitura de
     * coisas que nao sao numeros inteiros causa um erro durante a execucao.
     *
     * @param min      o limite inferior do intervalo
     * @param max      o limite superior do intervalo
     * @param scanner  leitor para concretizar a leitura
     * @param errorMsg mensagem a apresentar em caso de erro
     * @return o numero lido
     * @requires {@code scanner != null && min < max && errorMsg != null }
     * @ensures {@code min <= \return <= max}
     */

    public static int readInInterval(int min, int max, Scanner scanner, String errorMsg) {
        boolean error;
        int value;
        do {
            value = scanner.nextInt();
            error = (value > max || value < min);
            if (error)
                System.out.println(errorMsg);
        } while (error);
        return value;
    }

    /**
     * 
     * @param v
     * @param x
     * @requires {@code v != null}
     * counts how many elements in v are larger than x
     * @return
     */
    public static int howManyLargerThanThis(int[] v, int x) {
        int count = 0;
        for (int i = 0; i < v.length; i++)
            if (v[i] > x)
                count++;
        return count;
    }
}
