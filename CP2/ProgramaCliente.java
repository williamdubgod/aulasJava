package poo;

import java.util.Scanner;

public class ProgramaCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[5];
		
		for (int i = 0; i < 5; i++) {
			Cliente x = new Cliente();
			
			System.out.print("Digite o id: ");
			x.id = ler.nextInt();
			
			System.out.print("Digite o nome: ");
			x.nome = ler.next();
			
			System.out.print("Digite a idade: ");
			x.idade = ler.nextInt();
			
			System.out.print("Digite o email: ");
			x.email = ler.next();
			
			listaClientes[i] = x;
		}
		
		System.out.println("Os clientes maiores de 18 anos sao: \n");
		
		for (int i = 0; i < 5; i++) {
			if (listaClientes[i].idade > 18) {
				System.out.println("Id: " + listaClientes[i].id);
				System.out.println("Nome: " + listaClientes[i].nome);
				System.out.println("Idade: " + listaClientes[i].idade);
				System.out.println("email: " + listaClientes[i].email);
			}
		}

	}

}
