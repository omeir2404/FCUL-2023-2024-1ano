import java.util.Scanner;
/**
 * The {@code Triangles} class defines a set of procedures that
 * print several types of triangles.
 *
 * The program can be tested using a positive integer
 * given as an argument when running the class.
 *
 *
 * Compile:     javac Triangles.java
 * Run:         java Triangles 6
 *
 * @author antonialopes IP1819
 * @author filipecasal IP1920
 */
public class Triangles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputValue = -1;
		while (inputValue <= 0) {
			System.out.print("Enter a positive integer: ");
			inputValue = input.nextInt();
			if (inputValue <= 0) {
				System.out.println("The number must be positive!");
			}
		}

		// tests the printing procedures
		printIsoscelesTriangle(inputValue, '*');
		System.out.print("\n");

		printIsoscelesTriangle(inputValue, 'X');
		System.out.print("\n");
	}

	/**
	 * Print an isosceles triangle with a given height and symbol
	 *
	 * @param height height of the triangle to be printed
	 * @param symbol symbol to be used when printing
	 * @requires {@code height > 0}
	 */
	public static void printIsoscelesTriangle(int height, char symbol) {
		for (int l = 1; l <= height; l++) {
			System.out.printf("%s", generateSequence(height - l, ' '));
			System.out.printf("%s", generateSequence(2 * l - 1, symbol));
			System.out.print("\n");
		}
	}

	/**
	 * Print a line with {@code n} copies of {@code symbol}
	 *
	 * @param n      size of the sequence
	 * @param symbol character to be printed
	 * @requires {@code n > 0}
	 */
    public static String generateSequence(int n, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

}
