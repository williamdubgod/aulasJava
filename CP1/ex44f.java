// Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cem. Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. A seqüência: 2, 5, 10, 17, 26, .... Use for

package checkpoint;

import java.util.Scanner;

public class ex44f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, c, a, i, r;
		
		System.out.printf("Digite um número positivo e memor que 100: ");
		n = ler.nextInt();
		
		while (n < 0 || n > 100) {
			System.out.printf("O número deve ser positivo e menor que 100");
			System.out.printf("Digite novamente: ");
			n = ler.nextInt();
		}
		
		a = 1;
		c = 1;
		
		for(i = 1; i < n + 1; i++) {
			r = a + c;
			System.out.printf("\n%d", r);
			a = r;
			c = c + 2;
		}

	}

}
