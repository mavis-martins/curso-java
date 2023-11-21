import java.util.Locale;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigoPecas1, numeroPecas1, codigoPecas2, numeroPecas2;
		double valorUnitario1, valorUnitario2;
		
		codigoPecas1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codigoPecas2 = sc.nextInt();
		numeroPecas2  = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		System.out.println("CÓDIGO PEÇAS 1: " + codigoPecas1);
		System.out.println("Valor a pagar: " + (double)(numeroPecas1 * valorUnitario1) + "\n");
		System.out.println("CÓDIGO PEÇAS 2:" + codigoPecas2);
		System.out.println("Valor a pagar: " + (double)(numeroPecas2 * valorUnitario2) + "\n");
		System.out.println("VALOR TOTAL: " + (double)((numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2)));
		
		sc.close();
	}

}
