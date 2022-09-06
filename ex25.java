// Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, ab;
		
		System.out.printf("Digite o valor de a: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor de b: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor de c: ");
		c = ler.nextDouble();
		
		ab = a + b;
		
		if (ab > c) {
			System.out.printf("%.1f é maior que %.1f, logo a + b é maior que c", ab, c);
		}
		else if (ab == c) {
			System.out.printf("%.1f é igual a %.1f, logo a + b é identico a c", ab, c);
		}
		else {
			System.out.printf("%.1f é menor %.1f, logo a + b é menor que c", ab, c);
		}

	}

}
