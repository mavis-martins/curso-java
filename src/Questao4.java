import java.util.Locale;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		// decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numeroFuncionario, horasTrabalhadas, valorHora;
		
		numeroFuncionario = sc.nextDouble();
		horasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		System.out.printf("Funcionário: %s%n", numeroFuncionario);
		System.out.printf("Salário = %.2f", (horasTrabalhadas * valorHora));
		
		
		sc.close();

	}

}
