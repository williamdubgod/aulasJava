// Exibir a tabuada do número cinco no intervalo de um a dez. Use FOR

package entrada_processamento_saida;

import java.util.Scanner;

public class ex37f {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Tabuada do 5 com FOR");
		
		int num, i, r;
		num = 5;
		
		for (i = 1; i < 11 ; i++) {
            r = num * i;
            System.out.printf("\n%d X %d = %d", num, i, r);
		}
	}
}
