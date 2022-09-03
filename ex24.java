package entrada_processamento_saida;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String menu;
		double base, altura, lado, area, raio;
		
		System.out.printf("Qual dessas formas você deseja calcular a área? Triangulo, quadrado, retangulo ou circulo? Para sair difite 'fim': ");
		menu = ler.next();
		
		if (menu.equals("triangulo") || menu.equals("Triangulo")) {
			System.out.printf("Digite a base do triangulo: ");
			base = ler.nextDouble();
			System.out.printf("Digite a altura do triangulo: ");
			altura = ler.nextDouble();		
			area = (base * altura) / 2;
			System.out.printf("A area do seu triangulo e: %.1f ", area);
		}
		else if (menu.equals("quadrado") || menu.equals("Quadrado")) {
			System.out.printf("Digite o lado do quadrado: ");
			lado = ler.nextDouble();
			area = lado * lado;
			System.out.printf("A area do seu quadrado e: %.1f", area);
		}
		else if (menu.equals("retangulo") || menu.equals("Retangulo")) {
			System.out.printf("Digite a base do retangulo: ");
			base = ler.nextDouble();
			System.out.printf("Digite a altura do retangulo: ");
			altura = ler.nextDouble();		
			area = base * altura;
			System.out.printf("A area do seu retangulo e: %.1f ", area);
		}
		else if (menu.equals("circulo") || menu.equals("Circulo")) {
			System.out.printf("Digite o raio do circulo: ");
			raio = ler.nextDouble();
			area = 3.14 * (raio * raio);
			System.out.printf("A area do seu circulo e: %.1f ", area);
		}
		else if (menu.equals("fim") || menu.equals("Fim") || menu.equals("Sair") || menu.equals("sair")) {
			System.out.printf("Obrigado!");
		}
		else {
			System.out.printf("Opção inválida, escolha adição, subtração, multiplicação, divisão ou 'fim' se quiser sair.");
		}

	}

}
