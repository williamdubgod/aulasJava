// A partir dos valores da aceleração (a em m/s2), da velocidade inicial (v0 em m/s) e do tempo de percurso (t em s). Calcular e exibir a velocidade final de automóvel em km/h. 

package entrada_processamento_saida;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double vInicial, aceleracao, tempo, velocidade;
		
		System.out.printf("Informe a velocidade inicial em (m/s²): ");
		vInicial = ler.nextDouble();
		
		System.out.printf("Informe a aceleracao em (m/s²): ");
		aceleracao = ler.nextDouble();
		
		System.out.printf("Informe tempo em segundos: ");
		tempo = ler.nextDouble();
		
		velocidade = vInicial + (aceleracao * tempo);
		
		System.out.printf("Velocidade final %.2f: ", velocidade);
		
		if(velocidade > 120) {
			System.out.printf("Veiculo muito rapido!");
		}
		else if (velocidade > 80 && velocidade <= 120) {
			System.out.printf("Veiculo rapido.");
		}
		else if (velocidade > 60 && velocidade <= 80) {
			System.out.printf("Velocidade de cruzeiro.");
		}
		else if (velocidade > 40 && velocidade <= 60) {
			System.out.printf("Velocidade permitida.");
		}
		else {
			System.out.printf("Veiculo lento.");
		}
		
	}

}
