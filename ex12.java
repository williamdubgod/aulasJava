package entrada_processamento_saida;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2;
		
		System.out.printf("Digite o primeiro numero: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		v2 = ler.nextDouble();
		
		if (v1 > v2) {
			System.out.printf("%.1f é maior que %.1f", v1, v2);
		}
		else if (v1 == v2) {
			System.out.printf("Os numeros sao identicos");
		}
		else {
			System.out.printf("%.1f é maior que %.1f", v2, v1);
		}

	}

}
