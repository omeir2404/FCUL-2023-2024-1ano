import java.util.Scanner;

/**
 * A classe {@code DiceGame} permite um utilizador jogar um jogo de dados muito
 * simples. Trata-se de um jogo "a feijoes".
 *
 * O utilizador diz quantos feijoes tem para jogar. A partir dai, enquanto tiver
 * algum feijao pode fazer uma aposta e, de seguida, sao rodados 2 dados. Se a
 * soma der 7, ganha o dobro do que apostou; senao perde os feijoes que apostou.
 * Para sair do jogo o utilizador so tem de apostar 0, levando nesse caso todos
 * os feijoes que tem.
 *
 *
 * Compilar: javac DiceGame.java
 * Executar: java DiceGame
 *
 * @author antonialopes IP1819
 * @author filipecasal IP1920
 * @author Omeir fc61810
 */
public class DiceGame {

	public static void main(String[] args) {

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Scanner reader = new Scanner(System.in);
		String playerName = readName(reader);
		int totalMoney = readValue(reader, playerName, 20);
		int profit = 0;
		while(true)
		{
			int bet = readBet(reader, playerName, totalMoney);
			if (bet == 0)
			{
				reader.close();
				showFinalResult(playerName, totalMoney);
			}
			int result = playRound(dice1, dice2, totalMoney, bet);
			totalMoney += result;
			profit += result;
			System.out.println("fizeste " + profit + " feijoes. E agora tens " + (totalMoney) + " feijoes.");
		}
	}

	private static void showFinalResult(String playerName, int profit) {
		System.out.println("Adeus " + playerName + ", fizeste " + profit + " feijoes.");
		System.exit(0);
	}

	static int playRound(Dice dice1, Dice dice2, int totalMoney, int bet) {
		dice1.roll();
		dice2.roll();
		int value1 = dice1.getValue();
		int value2 = dice2.getValue();
		int sum = value1 + value2;
		if (sum == 7)
			return( bet * 2);
		else
			return (-bet);
	}

	static int readBet(Scanner reader, String playerName, int totalMoney) {
		boolean error = true;
		while (error)
		{
			System.out.print("Quanto queres apostar " + playerName + "? > ");
			int bet = reader.nextInt();
			if (bet <= totalMoney && bet >= 0)
				return bet;
			else
				System.out.println("Erro: tens de apostar entre 1 e " + totalMoney + " feijoes.");

		}
		return -1;
	}

	static String readName(Scanner reader) {
		System.out.print("Qual e o teu nome? > ");
		String name = reader.nextLine();
		return name;
	}

	/**
	 * Le o valor inicial com que o jogador entra no jogo (um inteiro positivo menor
	 * que o limite dado).
	 *
	 * @param reader     reader para concretizar a leitura
	 * @param playerName o nome do jogador
	 * @param maxBet     o limite maximo do numero a ler
	 * @return o numero lido
	 * @requires {@code reader != null && maxBet >=2}
	 * @ensures {@code \return >= 1 && \return <= maxBet}
	 */
	static int readValue(Scanner reader, String playerName, int maxBet) {
		System.out.print(playerName + ", quantos feijoes tens para jogar (limite: " + maxBet + ") > ");
		int totalMoney = readIntInInterval(1, maxBet, reader,
				"Erro: tem de ir a jogo com pelo menos 1 feijao e o limite sao " + maxBet + "feijoes.");
		return totalMoney;
	}

	/**
	 * Le um valor inteiro no intervalo entre min e max. Se numero lido nao verifica
	 * a condicao repete a leitura, acompanhado de mensagem de erro. A leitura de
	 * coisas que nao sao numeros inteiros causa um erro durante a execucao.
	 *
	 * @param min      o limite minimo do numero a ler
	 * @param max      o limite maximo do numero a ler
	 * @param reader   reader para concretizar a leitura
	 * @param errorMsg mensagem a apresentar em caso de erro
	 * @return o numero lido
	 * @requires {@code reader != null && min < max && errorMsg != null }
	 * @ensures {@code \return >= min && \return <= max}
	 */
	static int readIntInInterval(int min, int max, Scanner channel, String errorMsg) {
		boolean error;
		int num;
		do {
			num = channel.nextInt();
			error = (num > max || num < min);
			if (error)
				System.out.println(errorMsg);
		} while (error);
		return num;
	}

}
