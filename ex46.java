package checkpoint;

import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, a, b, i, j, m, d, c, e;
		
		System.out.printf("Digite um número positivo e memor que 100: ");
		n = ler.nextInt();

		
		while (n < 0 || n > 50) {
			System.out.printf("O número deve ser positivo e menor que 50");
			System.out.printf("Digite novamente: ");
			n = ler.nextInt();
		}
		
		a = 1;
		b = 2;
		i = 1;
		j = 1;
		m = 0;
		
		while(j <= n) {
			b = a + 1;
		    a = b;
		    d = (c*c*c);
		    e = b / d;
		    System.out.printf("\n%d/%d", a, b);
		    i = i + 2;
		    c = c + i;
		    m = m + e;
		    j = j + i;
		}
		System.out.printf("O resultado da soma foi %d", m);
		

	}

}
