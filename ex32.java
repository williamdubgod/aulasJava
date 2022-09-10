//Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double valor, total;
		String pagamento, vezes;
		
		System.out.printf("Digite o valor do produto: ");
		valor = ler.nextInt();
		
		System.out.printf("Digite a forma de pagamento, cartão ou dinheiro, parcelamos em até 2x sem juros!: ");
		pagamento = ler.next();
		
		if (pagamento.equals("dinheiro") || pagamento.equals("Dinheiro")) {
			total = valor - (valor * 0.1);
			System.out.printf("O total foi de: %.1f",total);
		}
		else if (pagamento.equals("cartao") || pagamento.equals("Cartao")) {
			System.out.printf("Em quantas vezes?  ");
			vezes = ler.next();
			if(vezes.equals("2x") || vezes.equals("duas") || vezes.equals("2") || vezes.equals("duas vezes")) {
				System.out.printf("O total foi de: %.1f",valor);
			}
			else if (vezes.equals("nenhuma")|| vezes.equals("Nenhuma") || vezes.equals("zero") || vezes.equals("0")) {
				total = valor - (valor * 0.15);
				System.out.printf("O total foi de: %.1f",total);
			}
			else {
				 total = valor + (valor * 0.1);
				 System.out.printf("O total foi de: %.1f",total);
			}
		}
		else {
			System.out.printf("Forma de pagamento não identificada, por favor digite dinheiro ou cartão.");
		}
		
	}

}
