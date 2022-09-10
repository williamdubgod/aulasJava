// Exibir os trinta primeiros valores da série de Fibonacci. Use FOR

package entrada_processamento_saida;

import java.util.Scanner;

public class ex42f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, f, i;
		
		a = 0;
		b = 1;
		f = a + b;
		
		System.out.printf("Os 30 primeiros números da sequência de Fibonacci são:");

		for (i = 1; i <= 30; i++) {
			System.out.printf("\n %d", f);
			b = a;
			a = f;
			f = a + b;
		}

	}

}
