package poo;

import java.util.Scanner;

public class ProgramaAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluno[] listaAlunos = new Aluno[3];
		
		for (int i = 0; i < 3; i++) {
			Aluno x = new Aluno();
			
			System.out.print("Digite o ra: ");
			x.ra = ler.next();
			
			System.out.print("Digite o nome: ");
			x.nome = ler.next();
			
			String[] listaMaterias = new String[3];
			
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite as siglas das materias: ");
				listaMaterias[j] = ler.next();
			}
			
			x.materias = listaMaterias;
			
			System.out.print("Digite o periodo: ");
			x.periodo = ler.next();
			
			listaAlunos[i] = x;
		}
		
		System.out.println("Os alunos que estudam no periodo noturno sao: \n");
		
		for (int i = 0; i < 3; i++) {
			if (listaAlunos[i].periodo.equals("noturno")) {
				System.out.println("RA: " + listaAlunos[i].ra);
				System.out.println("Nome: " + listaAlunos[i].nome);
				System.out.println("Materias: " + listaAlunos[i].materias);
				System.out.println("Periodo: " + listaAlunos[i].periodo);
			}
		}
	}

}
