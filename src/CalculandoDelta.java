import java.util.Locale;
import java.util.Scanner;

public class CalculandoDelta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("X1 = %.1f%n ", x1);
		System.out.printf("X2 = %.1f%n ", x2);
		sc.close();
	}

}
