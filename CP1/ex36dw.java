// Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas válidas. Use Do While

package entrada_processamento_saida;

import java.util.Scanner;

public class ex36dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String sexo;
		
		System.out.printf("Digite seu sexo (m) ou (f): ");
        sexo = ler.next();
        
        do {
        	System.out.println("Por favor digite 'm' ou 'f'");
        	System.out.printf("Digite seu sexo: ");
            sexo = ler.next();
        }
        while((!sexo.equals("m")) && (!sexo.equals("f")));
	}

}
