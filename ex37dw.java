// Exibir a tabuada do número cinco no intervalo de um a dez. Use Do While


package entrada_processamento_saida;

import java.util.Scanner;

public class ex37dw {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Tabuada do 5 com Do While");
		
		int num, i, r;
		num = 5;
		i = 1;
		
		do {
			r = num * i;
			System.out.printf("\n%d X %d = %d", num, i, r);
			i += 1;
		}
		while(i < 11);
	}

}
