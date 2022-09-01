// Entrar via teclado com três valores distintos. Exibir o maior deles.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3, maior;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();

		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextDouble();
		
		maior = v1;
		
		if (v2 > maior) {
			maior = v2;
		}
		if (v3 > maior) {
			maior = v3;
		}
			
		System.out.printf("O maior valor é o %.1f", maior);
		
	}

}
