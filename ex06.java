package entrada_processamento_saida;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dolar, real;
		
		System.out.printf("Informe a quantidade de dolares: ");
		dolar = ler.nextDouble();
		
		real = dolar * 5.1;
		
		System.out.printf("%.2f dolares são %.2f reais.", dolar, real);

	}

}
