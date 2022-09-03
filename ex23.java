package entrada_processamento_saida;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2;
		String menu;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Que operação você deseja fazer? Multiplicação, divisão, adição ou subtração? Caso deseje sair, digite 'fim': ");
		menu = ler.next();
	
		if (menu.equals("multiplicação")|| menu.equals("Multiplicação") || menu.equals("multiplicacaoo") || menu.equals("Multiplicacao")) {
			System.out.print(v1 * v2);
		}
		else if (menu.equals("adição") || menu.equals("Adição") || menu.equals("adicao") || menu.equals("Adicao") || menu.equals("soma") || menu.equals("Soma")) {
			System.out.print(v1 + v2);
		}
		else if (menu.equals("subtração") || menu.equals("Subtração") || menu.equals("subtracao") || menu.equals("Subtracao")) {
			System.out.print(v1 - v2);
		}
		else if (menu.equals("divisão") || menu.equals("Divisão") || menu.equals("divisao") || menu.equals("Divisao")) {
			System.out.print(v1 / v2);
		}
		else if (menu.equals("fim") || menu.equals("Fim") || menu.equals("sair") || menu.equals("Sair")) {
			System.out.printf("Obrigado!");
		}
		else {
			System.out.print("Opção inválida, escolha adição, subtração, multiplicação, divisão ou fim se quiser sair");
		}

	}

}
