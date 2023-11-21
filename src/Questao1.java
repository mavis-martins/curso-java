import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		System.out.println("SOMA = " + (numero1 + numero2));
		
		sc.close();
	}

}
