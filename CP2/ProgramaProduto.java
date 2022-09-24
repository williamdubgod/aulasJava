package poo;

import java.util.Scanner;

public class ProgramaProduto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[10];
		
		for (int i = 0; i < 10; i++) {
			Produto x = new Produto();
			
			System.out.print("Digite o id: ");
			x.id = ler.nextInt();
			
			System.out.print("Digite o nome do produto: ");
			x.descricao = ler.next();
			
			System.out.print("Digite o valor do produto: ");
			x.valor = ler.nextDouble();
			
			System.out.print("Digite a quantidade: ");
			x.quantidade = ler.nextDouble();
			
			listaProdutos[i] = x;
		}
		
		System.out.println("Os produtos menores de 100 reais sao: \n");
		
		for (int i = 0; i < 10; i++) {
			if (listaProdutos[i].valor < 100) {
				System.out.println("Id: " + listaProdutos[i].id);
				System.out.println("Descricao: " + listaProdutos[i].descricao);
				System.out.println("Valor: " + listaProdutos[i].valor);
				System.out.println("Quantidade: " + listaProdutos[i].quantidade);
			}
		}
			
	}

}
