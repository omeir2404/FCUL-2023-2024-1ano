public class ex01{
	public static void main(String[] args){
		double	peso = 300, altura = 1.81;
		double IMC = peso / (altura *altura);
		System.out.println("o meu IMC é: "+ peso / (altura * altura));
	
		if (IMC < 15)
			System.out.println("O teu peso é muito baixo");	
		else if (IMC >= 15 && IMC < 18.5)
			System.out.println("O teu peso é aixo do normal ");
		else if (IMC >= 18.5 && IMC < 25)	
			System.out.println("O teu peso esta normal");
		else if (IMC >= 25 && IMC < 30)
			System.out.println("Acima do peso normal");
		else if (IMC >= 30 && IMC < 40)
			System.out.println("OBESO");
		else
			System.out.println("MUITO OBESO");
	}
}
