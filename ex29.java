// Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Digite um numero: ");
		valor = ler.nextInt();
		
		if (valor % 2 == 0) {
			System.out.print(valor + 5);
		}
		else {
			System.out.print(valor + 8);
		}

	}

}
