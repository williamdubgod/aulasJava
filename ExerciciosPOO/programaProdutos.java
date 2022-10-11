package poo;

import java.util.Scanner;

public class programaProdutos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[3];
		
		int id;
		String nome;
		double preco;
		double quantidade;
		char possuiCategoria;
		
		for (int i = 0; i < 3; i++) {
			Produto p = new Produto();
			
			System.out.printf("Digite o id do produto: ");
            id = ler.nextInt();
            p.setId(id);
            
            System.out.printf("Digite o nome do produto: ");
            nome = ler.next();
            p.setNome(nome);
            
            System.out.printf("Digite o preco do produto: ");
            preco = ler.nextDouble();
            p.setPreco(preco);
            
            System.out.printf("Digite a quantidade do produto: ");
            quantidade = ler.nextDouble();
            p.setQuantidade(quantidade);
            
            System.out.printf("O produto possui categoria? (s/n)");
            possuiCategoria = ler.next().charAt(0);
            
            if (possuiCategoria == 's') {
            	
            	System.out.printf("Digite o id da categoria: ");
                id = ler.nextInt();
                p.setId(id);
                
                System.out.printf("Digite o nome da categoria: ");
                nome = ler.next();
                p.setNome(nome);
                
                Categoria d = new Categoria(id, nome);
                d.setId(id);
                d.setNome(nome);
                
                p = new Produto(id, nome, preco, quantidade, d);
            }
            
            else {
            	p = new Produto(id, nome, preco, quantidade, null);
            }
            
            listaProdutos[i] = p;
		}
		for (int i = 0; i < 3; i++) {
			System.out.printf("\nProduto cadastrado com sucesso %s", listaProdutos[i].exibirNomePreco());
			
			if (listaProdutos[i].getCategoria() != null) {
            	System.out.printf("\nQuantidade: %s", listaProdutos[i].exibirNomeQuantidade());
            }
		}
	}

}
