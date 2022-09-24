// Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextInt();
		
		if (v1 > v2 && v2 > v3) {
			System.out.printf("%d, %d, %d", v1, v2, v3);
		}
		else if (v1 > v2 && v1 > v3 && v3 > v2) {
			System.out.printf("%d, %d, %d", v1, v3, v2);
		}
		else if (v2 > v1 && v1 > v3) {
			System.out.printf("%d, %d, %d", v2, v1, v3);
		}
		else if (v2 > v1 && v2 > v3 && v3 > v1) {
			System.out.printf("%d, %d, %d", v2, v3, v1);
		}
		else if (v3 > v1 && v3 > v2 && v2 > v1) {
			System.out.printf("%d, %d, %d", v3, v2, v1);
		}
		else if (v3 > v1 && v3 > v2 && v1 > v2) {
			System.out.printf("%d, %d, %d", v3, v1, v2);
		}
		else {
			System.out.printf("Os tres numeros devem ser diferentes.");
		}

	}

}
