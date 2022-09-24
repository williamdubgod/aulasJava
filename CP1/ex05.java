//#transformar graus celsius em fahrenheit.

package entrada_processamento_saida;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius, fahrenheit;
		
		System.out.printf("Informe a temperatura em graus celsius: ");
		celsius = ler.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
		
		System.out.printf("%.2f graus celsius são %.2f fahrenheit", celsius, fahrenheit);
		
	}

}
