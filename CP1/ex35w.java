//Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor. Use While.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex35w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2;
		
		System.out.printf("Digite um número: ");
        v1 = ler.nextDouble();
        
        System.out.printf("Digite um número maior que o primeiro: ");
        v2 = ler.nextDouble();
        
        while(v1 > v2) {
        	System.out.println("O valor deve ser maior que o primeiro!");
        	System.out.printf("Digite outro valor: ");
            v2 = ler.nextDouble();
        }

	}

}
