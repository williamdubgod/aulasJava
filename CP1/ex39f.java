//Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), deverá ser maior que o primeiro (A), caso contrário, digitar novamente somente o segundo. Após a validação dos dados, exibir a tabuada do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A. Use for.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex39f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, r, a, b;
		
		System.out.printf("Digite um numero para obter a tabuada: ");
		num = ler.nextInt();
		
		System.out.printf("Digite o intervalo inicial da tabuada: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o intervalo final da tabuada: ");
		b = ler.nextInt();
		
		while (num <= 0) {
			System.out.printf("Nao pode numero negativo!");
			System.out.printf("Digite outro numero para obter a tabuada: ");
			num = ler.nextInt();
		}
		while (b < a) {
			System.out.println("O intervalo final deve ser maior que o inicial.");
			System.out.printf("Digite novamente o intervalo final: ");
			b = ler.nextInt();
		}
		
		for (i = b; i < a - 1; i--) {
			r = num * i;
			System.out.printf("\n%d X %d = %d", num, i, r);
		}

	}

}
