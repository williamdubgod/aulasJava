//  Exibir a soma dos números inteiros positivos do intervalo de um a cem. Use do While.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex41dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, soma;
		
		i = 1;
		soma = 0;	
		
		do {
			soma += i;
			i += 1;
			continue;
		}
		
		while (i < 101);
		
		System.out.printf("A soma dos inteiros de 1 à 100 é: %d", soma);

	}

}
