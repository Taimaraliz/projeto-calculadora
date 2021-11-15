import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static int soma(int x, int y) throws ArithmeticException {
		return y + x;
	}

	public static int multiplicacao(int x, int y) throws ArithmeticException {
		return x * y;
	}

	public static int subtracao(int x, int y) throws ArithmeticException {
		return x - y;
	}

	public static int dividisao(int x, int y) throws ArithmeticException {
		return x / y;
	}

	public static int lerInt(Scanner sc) {
		return Integer.parseInt(sc.nextLine());
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		boolean continua = true;
		
		
		do { 
			try{
			System.out.println("Escolha a op��o:");
			System.out.println("1 Adi��o");
			System.out.println("2 Subtra��o");
			System.out.println("3 Multiplica��o");
			System.out.println("4 Divis�o");
			
			int escolha = lerInt(sc);
			
			
			if( escolha < 1 | escolha > 4) {
				System.out.println("Digite a op��o de 1 a 4");
				escolha = sc.nextInt();
				
			}
			else if (!(escolha == 1|
					escolha == 2 |
					escolha == 3 |
					escolha == 4)){
				
				throw new Exception("Entrada Invalida");
			}
					
			System.out.println("Digite os valores: ");
			
			int var1 = lerInt(sc);
			int var2 = lerInt(sc);

			switch (escolha) {
			
			case 1:
				System.out.printf("Resultado: " + soma(var1, var2));
				continua = false;
				break;
			case 2:
				System.out.printf("Resultado: " + subtracao(var1, var2));
				break;
			case 3:
				System.out.printf("Resultado: " + multiplicacao(var1, var2));
				break;
			case 4:
				System.out.printf("Resultado: " + dividisao(var1, var2));
				break;
			default:
				System.out.printf("Op��o inv�lida");
				
				continua = false;
			}
				
		}catch(InputMismatchException e) {
			
			System.err.println("Digite somente n�meros");
		
		}catch(ArithmeticException erro2) {
			
			System.err.println("numero diferente do esperado");
		
		} catch( NullPointerException e) {
			
			System.err.println("Endere�o n�o pode ser nulo");
			
		}catch( Exception e) {
			
			System.err.println("Entrada inv�lida. Digite apenas n�meros de 1 a 4");
			
			continua = true;
		
			}
			
		}while(continua);
		
		System.out.println("Deseja fazer mais alguma opera��o (s/n)?");
		String entrada = sc.nextLine();
		
		if (entrada.equalsIgnoreCase("s")) {
			
			//String continuar = sc.nextLine();
			
			continua = true;
			
			
		}else {
			System.out.println("-------Fim-------");
		}
	}
}

