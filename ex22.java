// #Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa deverá calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente (P2) para ser aprovado, sabendo que a média de aprovação é igual a cinco.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2;
		
		System.out.printf("Digite o valor da prova p1: ");
		p1 = ler.nextDouble();
		
		p2 = 7.5 - p1 / 2;
		
		System.out.printf("Você precisa tirar %.1f na p2 para conseguir a média.", p2);

	}

}

