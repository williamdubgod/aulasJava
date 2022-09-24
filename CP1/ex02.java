//exibir a area do quadrado.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado, area;
		
		System.out.printf("Digite um lado do quarado: ");
		lado = ler.nextDouble();
		
		area = lado * lado;
		
		System.out.printf("A area do quadrado e: %.1f", area);

	}

}
