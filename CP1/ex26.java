// #  Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

package entrada_processamento_saida;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estadoCivil, tempo;
		
		System.out.printf("Digite seu nome: ");
		nome = ler.next();
		
		System.out.printf("Digite seu sexo: ");
		sexo = ler.next();
		
		System.out.printf("Digite seu estado civil: ");
		estadoCivil = ler.next();
		
		if ((sexo.equals("F") || sexo.equals("f") || sexo.equals("Feminino") || sexo.equals("feminino") && estadoCivil.equals("Casada") || estadoCivil.equals("casada")))  {
			System.out.printf("Há quanto tempo voce é casada? ");
			tempo = ler.next();
			System.out.printf("Obrigado pelos dados!");
		}

	}

}
