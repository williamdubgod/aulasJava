package poo;

import java.util.Scanner;

public class programaContaBancaria {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[3];
		
		int id;
		String nome;
		String email;
		int idade;
		char possuiConta;
		String agencia;
		String numero;
		double saldo;
		
		for (int i = 0; i < 3; i++) {
			
			Cliente p;
			
			System.out.printf("Digite o id da pessoa: ");
            id = ler.nextInt();
            
            System.out.printf("Digite o nome da pessoa: ");
            nome = ler.next();
            
            System.out.printf("Digite a idade da pessoa: ");
            idade = ler.nextInt();
            
            System.out.printf("Digite o email da pessoa: ");
            email = ler.next();
            
            System.out.printf("Possui conta? (s/n)");
            possuiConta = ler.next().charAt(0);
            
            if (possuiConta == 's') {
            	System.out.printf("Digite a agencia: ");
            	agencia = ler.next();
            	
            	System.out.printf("Digite o numero: ");
            	numero = ler.next();
            	
            	System.out.printf("Digite o saldo: ");
            	saldo = ler.nextDouble();
            	
            	
            	ContaBancaria d  = new ContaBancaria(agencia, numero, saldo);
            	
            	p = new Cliente(id, nome, idade, email, d);
            }
            
            else {
            	p = new Cliente(id, nome, idade, email, null);
            }
            
            listaClientes[i] = p;
		}
		
		for (int i = 0; i < 3; i++) {
            System.out.printf("\nCliente cadastrado com sucesso %s!", listaClientes[i].exibirNomeIdade());
            
            if (listaClientes[i].conta != null) {
            	System.out.printf("\nCliente: %s", listaClientes[i].exibirDadosConta());
            }
	}
  }
}
