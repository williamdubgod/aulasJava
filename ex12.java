package entrada_processamento_saida;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado1, lado2, lado3;
		
		System.out.printf("Informe o valor do primeiro lado: ");
		lado1 = ler.nextDouble();
		
		System.out.printf("Informe o valor do segundo lado: ");
		lado2 = ler.nextDouble();
		
		System.out.printf("Informe o valor do terceiro lado: ");
		lado3 = ler.nextDouble();
		
		if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
			System.out.printf("Esses valores formam um triângulo.\n");
		}
		if (lado1 == lado2 && lado1 == lado3) {
			System.out.printf("Esse triângulo é equilátero.");
		}
		if (lado1 == lado2 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2) {
			System.out.printf("Esse triângulo é isósceles.");
		}
		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.printf("Esse triângulo é escaleno.");
		}
		else {
			System.out.printf("Desculpe, esses valores não formam um triângulo.");
		}
	}

}
