package entrada_processamento_saida;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Informe o valor do primeiro lado: ");
		v1 = ler.nextInt();
		
		System.out.printf("Informe o valor do segundo lado: ");
		v2 = ler.nextInt();
		
		System.out.printf("Informe o valor do terceiro lado: ");
		v3 = ler.nextInt();
		
		if(((v1+v2)>v3)&&((v1+v3)>v2)&&((v2+v3)>v1)) {
			System.out.printf("Esses valores formam um triangulo.\n");
			if(((v1*v1)+(v2*v2)==(v3*v3))||((v1*v1)+(v3*v3)==(v2*v2))||((v2*v2)+(v3*v3)==(v1*v1))) {
				System.out.printf("Esse triangulo e retangulo.\n");
			}
			else {
				System.out.printf("Esse triangulo nao e retangulo.\n");
			}
		}
		else {
			System.out.printf("Esses valores nao formam um triangulo.\n");
		}

	}

}
