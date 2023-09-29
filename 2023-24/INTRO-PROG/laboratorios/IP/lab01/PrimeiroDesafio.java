/**
 * Este programa contém vários erros sintáticos, lógicos e de execução.
 * Desafio: tente identificar e corrigir todos os erros presentes no programa.
 *
 * Compilar:	javac PrimeiroDesafio.java
 * Executar:	java PrimeiroDesafio 
 * 
 * @author Wellington Oliveira IP2223
 * @author Andreia Mordido IP2223
 */

public class PrimeiroDesafio {
    
    public static void main(String[] args) {
        double raio = 2;
        double perimetro = 12.56637;

        double pi = calcularPi(raio, perimetro);
        System.out.println("Valor (aproximado) de pi: " + pi);
        System.out.println(" > valor correto: 3.1415925");

        double areaCirculo = areaCirculo(raio, pi);
        System.out.println("Area do circulo: " + areaCirculo);
        System.out.println(" > valor correto: 12.56637");

        double metadeArea = areaCirculo / 2;
        System.out.println("Metade da area do circulo: " + metadeArea);
        System.out.println(" > valor correto: 6.283185");

        System.out.println("A soma das duas metades: " + (metadeArea + metadeArea));
        System.out.println(" > valor correto: 12.56637");
    }

    public static double calcularPi (double raio, double perimetro) {
        double pi = perimetro / (2 * raio);
        return pi;
    }

    public static double areaCirculo (double raio, double pi) {
        double area;
        area = raio * raio * pi;
        return area;
    }
}
