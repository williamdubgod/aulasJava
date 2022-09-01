//verificar se a media das notas das provas foram maior ou igual a 5. Em caso positivo exibir aprovado. Em caso negativo exibir reprovado.

package entrada_processamento_saida;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.printf("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.printf("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 5) {
			System.out.printf("Sua media foi: %.1f, voce esta aprovado!", media);
		}
		else {
			System.out.printf("Sua media foi: %.1f, voce esta reprovado!", media);
		}

	}

}
