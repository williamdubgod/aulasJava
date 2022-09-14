// Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, deverá ser positivo, mas menor que cinqüenta. Caso o valor não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. A sequencia: 1/2, 2/3, 3/4, 4/5... Use for.


package checkpoint;

import java.util.Scanner;

public class ex45f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, a, b, i;
		
		System.out.printf("Digite um número positivo e memor que 100: ");
		n = ler.nextInt();

		
		while (n < 0 || n > 50) {
			System.out.printf("O número deve ser positivo e menor que 50");
			System.out.printf("Digite novamente: ");
			n = ler.nextInt();
		}
		
		a = 1;
		b = 2;
		
		for(i = 1; i < n + 1; i++) {
			System.out.printf("\n%d/%d", a, b);
			a = a + 1;
			b = b + 1;
			
		}
	}

}
