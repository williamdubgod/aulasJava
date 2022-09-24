//Fazer um programa para receber um número e validar se esse número é positivo. Após isso, exibir a tabuada de 1 a 10 desse número. Use WHILE.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex33w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, i, r;
		
		System.out.println("Tabuada com WHILE");
		
		System.out.printf("Digite um numero para obter a tabuada: ");
		num = ler.nextInt();
		
		while(num <= 0) {
			System.out.println("Não pode numero negativo!");
			System.out.printf("Digite um outro numero para obter a tabuada: ");
			num = ler.nextInt();
		}
		
		
		i = 1;
		
		while (i < 11) {
			r = num * i;
			System.out.printf("\n%d X %d = %d", num, i, r);
	        i++;

		}
	}
}
