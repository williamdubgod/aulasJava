//digitar o valor de 5 produtos. Exibir o valor e o troco.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, total, dinheiro, troco;
		
		System.out.printf("Digite o valor do primeiro produto: ");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto: ");
		p2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto: ");
		p3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto: ");
		p4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto: ");
		p5 = ler.nextDouble();
		
		total = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("Valor total foi de R$%.2f\n", total);
		
		System.out.printf("Digite a quantidade de dinheiro: ");
		dinheiro = ler.nextDouble();
		
		troco = dinheiro - total;
		
		System.out.printf("Seu troco foi de: R$%.2f", troco);
		

	}

}
