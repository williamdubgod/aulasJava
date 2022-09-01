package entrada_processamento_saida;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, media;
		
		System.out.printf("Digite o valor da prova p1: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor da prova p2: ");
		p2 = ler.nextDouble();
		
		media = (p1 + p2) / 3;
		
		if(media >= 5) {
			System.out.printf("Parabens, sua media foi %.1f, voce esta aprovado!", media);
		}
		else {
			System.out.printf("Sua media foi %.1f, voce esta reprovado!.", media);
		}

	}

}
