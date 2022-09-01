package entrada_processamento_saida;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double comprimento, largura, area;
		
		System.out.printf("Digite o comprimento do terreno em (m): ");
		comprimento = ler.nextDouble();
		
		System.out.printf("Digite a largura do terreno em (m): ");
		largura = ler.nextDouble();
		
		area = comprimento * largura;
		
		System.out.printf("A área do terreno é de %.1fm. \n", area);
		
		if (area > 100) {
			System.out.printf("Seu terreno é grande.");
		} 

	}

}
