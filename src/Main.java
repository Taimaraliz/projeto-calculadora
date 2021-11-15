

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);

		System.out.println("Calculadora Rex ");
		int i = 0;

		while (i == 0) {
			System.out.println("Escolha a opção: ");
			System.out.println("1 Adição ");
			System.out.println("2 Subtração ");
			System.out.println("3 Multiplicação ");
			System.out.println("4 Divisão ");

			Scanner sc = new Scanner(System.in);
			int opcao = sc.nextInt();

			Calculadora calculadora = new Calculadora();// instanciando o objeto
			
			
			switch (opcao) {

			case 1:
				System.out.println("Digite o primeiro valor: ");
				double var1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				double var2 = sc.nextDouble();

				double soma = calculadora.soma(var1, var2);
				//String resultado = String.format("%.2f%n", soma);
				System.out.printf("Resultado da adição: %.2f%n" , soma);
				break; 
			case 2:
				System.out.println("Digite o primeiro valor: ");
				var1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				var2 = sc.nextDouble();

				double subtracao = calculadora.subtracao(var1, var2);
				//resultado = String.format("%.2f%n", subtracao);
				System.out.printf("Resultado da adição: %.2f%n" , subtracao);
				break;
			case 3:
				System.out.println("Digite o primeiro valor: ");
				var1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				var2 = sc.nextDouble();

				double multiplicacao = calculadora.multiplicacao(var1, var2);
				//resultado = String.format("%.2f%n", multiplicacao);
				System.out.printf("Resultado da adição: %.2f%n " , multiplicacao);
				break;
			case 4:
				System.out.println("Digite o primeiro valor: ");
				var1 = sc.nextDouble();
				System.out.println("Digite o segundo valor: ");
				var2 = sc.nextDouble();

				double divisao = calculadora.divisao(var1, var2);
				//resultado = String.format("%.2f%n", divisao);
				System.out.printf("Resultado da adição: %.2f%n " , divisao);
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
			int j = 0;
			while (j == 0) {

				System.out.println("Deseja fazer mais alguma operação? (s/n)");
				String ler = sc.next();

				if (ler.equalsIgnoreCase("n")) {
					System.out.println("-------Fim-------");
					j = 1;
					i = 1;
				} 
				else if(ler.equalsIgnoreCase("s")) {
					j = 1;
				}
				else if (!(ler.equalsIgnoreCase("s"))) {
					System.out.println("Opção inválida");
				}
			}

		}
	}

}
