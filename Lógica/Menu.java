import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class Menu {
	public static void main (String [] args) {
		int opc = 1;
		while (opc != 0) {
			System.out.println ("Gerador de Padroes \n\n Digite a opcao desejada:");
			System.out.println ("\n 1 - Par(**) e Impar(*)\n 2 - Multiplos de 4 (PI)\n 3 - Triangulo 1\n 4 - Triangulo 2\n 5 - Fibonacci\n 0 - Sair");
			Scanner scanner = new Scanner (System.in);
			String valorTela = scanner.nextLine ();
			opc = Integer.parseInt (valorTela);
			
			if (opc == 1) {
				for (int contador = 1; contador <=100; contador ++) {
					int resto = contador % 2;
					if (resto == 1) {
						System.out.println ("*");
					}
					else {
						System.out.println ("**");
					}
				}
			}
			else if (opc == 2) {
				for (int contador = 1; contador <=100; contador ++) {
					int resto = contador % 4;
					if (resto == 0) {
						System.out.println ("PI");
					}
					else {
						System.out.println (contador);
					}
				}
			}
			else if (opc == 3) {
				String linha = "*";
				for (int contador = 1; contador <=10; contador ++) {
					System.out.println (linha);
					linha += "*";
				}
			}
			else if (opc == 4) {
				String linha = "*";
				for (int contador = 1; contador <=10; contador ++) {
					System.out.println (linha);
					int resto = contador % 4;
					if (resto == 0) {
						linha = "*";
					}
					else {
						linha += "*";
					}
				}
			}
			else if (opc == 5) {
				int primeiro = 0;
				int segundo = 1;
				System.out.println (primeiro);
				System.out.println (segundo);
				for (int contador = 1; contador <=30; contador ++) {
					int terceiro = primeiro + segundo;
					System.out.println (terceiro);
					primeiro = segundo;
					segundo = terceiro;
				}
			}
		}
	}	
}			
	