import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		//Fórmula da área: area = π . raio2
		//Considere o valor de π = 3.14159
		
		Scanner sc = new Scanner(System.in);
		int raio;
		double pi = 3.14159;
		
		raio = sc.nextInt();
		
		
		System.out.printf("Área do círculo: %.4f", (double)(pi * (Math.pow(raio, 2))));
		sc.close();

	}

}
