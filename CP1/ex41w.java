//  Exibir a soma dos números inteiros positivos do intervalo de um a cem. Use While.


package entrada_processamento_saida;

import java.util.Scanner;

public class ex41w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, soma;
		
		i = 1;
		soma = 0;	
		
		while (i < 101) {
			soma += i;
			i += 1;
			continue;
		}
		
		System.out.printf("A soma dos inteiros de 1 à 100 é: %d", soma);

	}

}
