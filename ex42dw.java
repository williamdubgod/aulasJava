// Exibir os trinta primeiros valores da série de Fibonacci. Use Do While.


package entrada_processamento_saida;

import java.util.Scanner;

public class ex42dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, f, i;
		
		a = 0;
		b = 1;
		f = a + b;
		i = 0;
		
		System.out.printf("Os 30 primeiros números da sequência de Fibonacci são:");
		
		do {
			System.out.printf("\n%d", f);
			b = a;
			a = f;
			f = a + b;
			i++;
		}
		while (i <= 29);
		
	}

}
