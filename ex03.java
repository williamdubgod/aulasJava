package entrada_processamento_saida;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite a base do triângulo: ");
		base = ler.nextDouble();
				
		System.out.printf("Digite a altura do triângulo: ");
		altura = ler.nextDouble();
		
		area = (base * altura / 2);
		
		System.out.printf("A area do triangulo e: %.1f", area);
		
	}

}
