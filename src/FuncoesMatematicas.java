
public class FuncoesMatematicas {

	public static void main(String[] args) {
		// math.sqrt(variable) para raiz quadrada;
		//math.pow(numero, potenciacao) potência;
		//math.abs(variable) valor absoluto;
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		
		//Raíz Quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//Potência
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a 2 = " + B);
		System.out.println("5 elevado a 2 = " + C);
		
		//Valor Absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absolut de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
