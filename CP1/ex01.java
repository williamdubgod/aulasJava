//exibir a area do retângulo.

package entrada_processamento_saida;

import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite a base do retangulo: ");
		base = ler.nextDouble();
				
		System.out.printf("Digite a altura do retangulo: ");
		altura = ler.nextDouble();
		
		area = base * altura;
		
		System.out.printf("A area do retangulo e: %.1f", area);

	}

}
