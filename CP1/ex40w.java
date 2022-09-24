// Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla. Use Do While.


package entrada_processamento_saida;

import java.util.Scanner;

public class ex40w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int t, i, j;
		String pergunta;
		
		i = 1;
		j = 1;
		
		while (i <= 20) {
			while (j <= 10) {
				t = i *j;
				System.out.printf("\n%d X %d = %d", i, j, t);
				j += 1;
			}
			j = 1;
			i += 1;
			System.out.printf("\nDigite qualquer tecla para continuar...");
			pergunta = ler.next();
		}
		

	}

}
