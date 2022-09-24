package entrada_processamento_saida;

import java.util.Scanner;

public class ex43dw {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		int a, b, c, r, i;
		
		a = -1;
		b = 1;
		c = 1;
		r = a + b + c;
		i = 0;
		
		System.out.printf("Os 20 primeiros números da sequência de Bergamaschi são:");
		
		do {
			System.out.printf("\n%d", r);
			c = b;
			b = a;
			a = r;
			r = a + b + c;
			i++;
		}
		while(i <= 19);

	}

}
