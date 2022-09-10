// Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. Entre as tabuadas, solicitar que o usuário pressione uma tecla. Use for.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex40f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int t, i, r;
		String pergunta;
		
		for (t = 1; t < 21; t++) {
			System.out.printf("Deseja ver a próxima tabuada?  ");
			pergunta = ler.next();
			if (pergunta.equals("nao") || pergunta.equals("Nao") || pergunta.equals("N") || pergunta.equals("n")) {
				System.out.printf("Obrigado!");
				break;
			}
			else {
				for(i = 1; i < 11; i++) {
					r = t * i;
					System.out.printf("\n%d X %d = %d", t, i, r);
				}
			}
		}

	}

}
