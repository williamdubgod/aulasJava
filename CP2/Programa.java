package poo;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Pessoa[] listaPessoas = new Pessoa[10];
		
		System.out.println("..:: Cadastro de Pessoas ::..");
		
		for(int i = 0; i < 2; i++) {
			Pessoa p = new Pessoa();
			
			System.out.print("Digite o id: ");
			p.id = ler.nextInt();
			
			System.out.print("Digite o nome: ");
			p.nome = ler.next();
			
			listaPessoas[i] = p;
			
		}
		
		System.out.println("As pessoas cadastradas foram: \n");
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Id: " + listaPessoas[i].id);
			System.out.println("Nome: " + listaPessoas[i].nome);
		}
		
	}

}
