package entrada_processamento_saida;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double altura, peso, imc;
		String sexo;
		
		System.out.printf("Informe a altura em (m): ");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o peso em (kg): ");
		peso = ler.nextDouble();
		
		System.out.printf("Informe o sexo: ");
		sexo = ler.next();
		
		imc = peso / (altura * altura);
		
		if(sexo.equals("feminino") || sexo.equals("Feminino") || sexo.equals("f") || sexo.equals("F")) {
			if(imc < 19) {
				System.out.printf("Abaixo do peso.");
			}
			else if(imc < 24){
				System.out.printf("Peso ideal! ");
			}
			else {
				System.out.printf("Acima do peso.");
			}
		}
		else {
			System.out.printf("Sexo invalido, digite masculino (m) ou feminino (f)");
		}
					
		if(sexo.equals("masculino") || sexo.equals("Masculino") || sexo.equals("m") || sexo.equals("M")) {
			if(imc < 20) {
				System.out.printf("Abaixo do peso.");
			}
			else if (imc < 25) {
				System.out.printf("Peso ideal!");
			}
			else {
				System.out.printf("Acima do peso.");
			}
		}
		
	}

}
