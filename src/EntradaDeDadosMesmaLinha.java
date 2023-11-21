import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosMesmaLinha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int numero;
		double f;
		
		x = sc.next();
		numero = sc.nextInt();
		f = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(numero);
		System.out.println(f);
		
		

	}

}
