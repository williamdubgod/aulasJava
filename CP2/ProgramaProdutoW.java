package poo;

import java.util.Scanner;

public class ProgramaProdutoW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i = 0;
		
		Produto[] listaProdutos = new Produto[10];
		
		while (i < 10) {
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
			
			i++;
		}
		
		System.out.println("Os produtos menores de 100 reais sao: \n");
		
		i = 0;
		
		while (i < 10) {
			if (listaProdutos[i].valor < 100) {
				System.out.println("Id: " + listaProdutos[i].id);
				System.out.println("Descricao: " + listaProdutos[i].descricao);
				System.out.println("Valor: " + listaProdutos[i].valor);
				System.out.println("Quantidade: " + listaProdutos[i].quantidade);
			}
			
			i++;
		}

	}

}
