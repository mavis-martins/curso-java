import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou " + x + "\n");
		
		int numero;
		numero = sc.nextInt();
		System.out.println("Você digitou o número " + numero + "\n");
		
		char caractere;
		caractere = sc.next().charAt(0);
		System.out.println("O primeiro caractere é: " + caractere + "\n");
		
		sc.useLocale(Locale.US);
		double f;
		f = sc.nextDouble();
		System.out.printf("O número com ponto flutuante é %.2f", f);
		sc.close();
	}
}
