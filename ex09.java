//Entrar com altura e peso de uma pessoa e exibir se ela está com peso abaixo, acima ou ideal.

package entrada_processamento_saida;

import java.util.Scanner;
public class ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, imc;
		
		System.out.printf("Informe a sua altura em (m): ");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o seu peso em (kg): ");
		peso = ler.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.printf("Abaixo do peso!");
		}
		else if (imc < 25) {
			System.out.printf("Peso ideal!");
		}
		else {
			System.out.printf("Acima do peso!");
		}

	}

}
