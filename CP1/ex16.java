// Entrar com o peso e a altura de uma determinada pessoa. Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².

package entrada_processamento_saida;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.printf("Informe a sua altura em (m): ");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o seu peso em (kg): ");
		peso = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc >= 20 && imc <= 25) {
			System.out.printf("Seu peso está ideal");
		}
		else {
			System.out.printf("Seu peso não está ideal.");
		}

	}

}
