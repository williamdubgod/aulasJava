//Fazer um programa para receber um número e validar se esse número é positivo. Após isso, exibir a tabuada de 1 a 10 desse número. Use DO WHILE.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex33dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		 	int num, r, i;
	       
	        do {
	            System.out.printf("Digite um número positivo: ");
	            num = ler.nextInt();
	        }
	        while(num <= 0);
	       
	        i = 1;
	       
	        do {
	            r = num * i;
	            System.out.printf("\n%d X %d = %d", num, i, r);
	            i++;            
	        }
	        
	        while (i <= 10);
	    }


	}

