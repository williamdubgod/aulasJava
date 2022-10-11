package cp2;

import java.util.Scanner;

public class programaAluno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluno[] listaAlunos = new Aluno[3];
		
		int id;
		String rm;
		String nome;
		char possuiCurso;
		
		for (int i = 0; i < 3; i++) {
			Aluno p = new Aluno();
			
			System.out.printf("Digite o id do aluno: ");
			id = ler.nextInt();
			p.setId(id);
			
			System.out.printf("Digite o rm do aluno: ");
			rm = ler.next();
			p.setRm(rm);
			
			System.out.printf("Digite o nome do aluno: ");
            nome = ler.next();
            p.setNome(nome);
			
            System.out.printf("Esta matriculado em um curso? (s/n)");
            possuiCurso = ler.next().charAt(0);
            
            if (possuiCurso == 's') {
            	System.out.printf("Digite o id do curso: ");
            	id = ler.nextInt();
            	
            	System.out.printf("Digite o nome do curso: ");
            	nome = ler.next();
            	
            	Curso d = new Curso(id, nome);
            	d.setId(id);
            	d.setNome(nome);
            	
            	p = new Aluno(id, rm, nome, d);
            }
            else {
            	p = new Aluno(id, rm, nome, null);
            }
			
            listaAlunos[i] = p;
		}
		for (int i = 0; i < 3; i++) {
			 System.out.printf("\nAluno: %s!", listaAlunos[i].getNome());
			 
			 if (listaAlunos[i].getCurso() != null) {
				 System.out.printf("\nCurso: %s", listaAlunos[i].getCurso());
			 }
		}
	}

}
