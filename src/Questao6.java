import java.util.Locale;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
		//	a) a área do triângulo retângulo que tem A por base e C por altura.
		//	b) a área do círculo de raio C. (pi = 3.14159)
		//	c) a área do trapézio que tem A e B por bases e C por altura.
		//	d) a área do quadrado que tem lado B.
		//	e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi = 3.14159;
		
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("Área do Triângulo = %.3f%n", (A * C / 2));
		System.out.printf("Área do Círculo = %.3f%n", (pi * Math.pow(C, 2)));
		System.out.printf("Área do Trapézio = %.3f%n", ((A + B) * C / 2));
		System.out.printf("Área do Quadrado = %.3f%n", (Math.pow(B, 2)));
		System.out.printf("Área do Retângulo = %.3f%n", (A * B));
		
		sc.close();
	}

}
