package poo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class programaContaBancaria {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
	       
        ArrayList<Cliente> listaClientes = new ArrayList<>();
             
        int opcao;
        int id;
        Cliente cli;
        int indexCliente;
        int id_cliente;
        double valor;
        int indexClienteOrigem;
        int indexClienteDestino;
        int id_cliente_origem;
        int id_cliente_destino;
        Cliente cli_origem;
        Cliente cli_destino;
       
        do {        
           System.out.printf("===> Macgyver Internet Banking <===\n\n");
           System.out.printf("Escolha uma opção:\n");          
           System.out.printf("1 - Criar cliente e conta \n" +
                             "2 - Depósito \n" +
                             "3 - Saque \n" +
                             "4 - Transferência \n" +
                             "5 - Consulta de saldo \n" +
                             "6 - Sair\n\n");
 
           System.out.printf("Digite a opção desejada: ");
           opcao = ler.nextInt();
           
           if (opcao == 1) {
               Cliente cliente = new Cliente();
               
               if(listaClientes.size() > 0) {
                   id_cliente = listaClientes.get(listaClientes.size()-1).getId() + 1;
               }
               else {
                   id_cliente = 1;
               }
               cliente.setId(id_cliente);
               
               System.out.print("Digite o seu nome: ");
               cliente.setNome(ler.next());
               
               System.out.print("Digite a seu idade: ");
               cliente.setIdade(ler.nextInt());
               
               ContaBancaria conta = new ContaBancaria();
               
               System.out.print("Digite a agencia: ");
               conta.setAgencia(ler.next());
               
               System.out.print("Digite o numero: ");
               conta.setNumero(ler.next());
                           
               cliente.setConta(conta);
               
               listaClientes.add(cliente);
               
               System.out.printf("Cliente e conta cadastrados com sucesso!");
               System.in.read();
           }
           else if(opcao == 2) {
               for(Cliente c: listaClientes) {
                   System.out.println("ID: " + c.getId() + " - Nome: " + c.getNome() + " - Saldo: " + c.getConta().ConsultarSaldo());
               }
               
               System.out.print("Digite o ID do cliente que você deseja realizar um depósito: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Digite o valor do depósito: ");
                   valor = ler.nextDouble();
                   
                   cli.getConta().Depositar(valor);
                   
                   System.out.printf("Depósito realizado com sucesso!");
               }
               else {
                   System.out.printf("Cliente não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 3) {
               for(Cliente c: listaClientes) {
                   System.out.println("ID: " + c.getId() + " - Nome: " + c.getNome() + " - Saldo: " + c.getConta().ConsultarSaldo());
               }
               
               System.out.print("Digite o ID do cliente que você deseja realizar um saque: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Digite o valor do saque: ");
                   valor = ler.nextDouble();
                   
                   cli.getConta().Sacar(valor);
                   
                   System.out.printf("Saque realizado com sucesso!");
               }
               else {
                   System.out.printf("Cliente não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 4) {
               for(Cliente c: listaClientes) {
                   System.out.println("ID: " + c.getId() + " - Nome: " + c.getNome() + " - Saldo: " + c.getConta().ConsultarSaldo());
               }
               
               System.out.print("Digite o ID do cliente de origem da transferência: ");
               id_cliente_origem = ler.nextInt();
               
               indexClienteOrigem = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id_cliente_origem) {
                       indexClienteOrigem = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               System.out.print("Digite o ID do cliente de destino da transferência: ");
               id_cliente_destino = ler.nextInt();
               
               indexClienteDestino = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id_cliente_destino) {
                       indexClienteDestino = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if ( (indexClienteOrigem != -1) && (indexClienteDestino != -1) ) {
                   cli_origem = listaClientes.get(indexClienteOrigem);
                   cli_destino = listaClientes.get(indexClienteDestino);
                   
                   System.out.print("Digite o valor da transferência: ");
                   valor = ler.nextDouble();
                   
                   cli_origem.getConta().Transferir(valor, cli_destino);
                   
                   System.out.printf("Transferência realizada com sucesso!");
               }
               else {
                   System.out.printf("Cliente origem ou cliente destino não encontrado!");
               }
               System.in.read();
           }
           else if(opcao == 5) {
               for(Cliente c: listaClientes) {
                   System.out.println("ID: " + c.getId() + " - Nome: " + c.getNome() + " - Saldo: " + c.getConta().ConsultarSaldo());
               }
               
               System.out.print("Digite o ID do cliente que você deseja obter o saldo: ");
               id = ler.nextInt();
               
               indexCliente = -1;
               for(Cliente c: listaClientes) {
                   if (c.getId() == id) {
                       indexCliente = listaClientes.indexOf(c);
                       break;
                   }
               }
               
               if (indexCliente != -1) {
                   cli = listaClientes.get(indexCliente);
                   
                   System.out.print("Saldo: R$ " + cli.getConta().ConsultarSaldo());
               }
               else {
                   System.out.printf("Cliente não encontrado!");
               }
               System.in.read();
           }
           
        }while( (opcao >= 1) && (opcao <= 5) );
    }


	}

