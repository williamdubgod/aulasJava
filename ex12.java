package entrada_processamento_saida;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1, v2, v3;
		
		System.out.printf("Informe o valor do primeiro lado: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Informe o valor do segundo lado: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Informe o valor do terceiro lado: ");
		v3 = ler.nextDouble();
		
		if((v1 + v2) > v3 && (v1 + v3) > v2 && (v2 + v3) > v1) {
			System.out.printf("Esses valores formam um triangulo.\n");
			if(v1 == v2 && v2 == v3) {
				System.out.printf("Esse triangulo e equilatero.\n");
			}
			if((v1 == v2 && v1 != v3) || (v3 == v2 && v3 != v1) || (v1 == v3 && v1 != v2)) {
				System.out.printf("Esse triangulo e isosceles.\n");
			}
			if(v1 != v2 && v2 != v3 && v1 != v3) {
				System.out.printf("Esse triangulo e escaleno.\n");
			} 
		}
		else {
			System.out.printf("Esses valores nao formam um triangulo.\n");
		}
	}

}
