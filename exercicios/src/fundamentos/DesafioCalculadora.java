package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe primeiro valor: ");
		double num1 = input.nextDouble();

		System.out.print("Informe o segundo valor: ");
		double num2 = input.nextDouble();

		System.out.print("Informe o operador (+, -, *, /, %): ");
		String operador = input.next();

		double resultado = "+".equals(operador) ? num1 + num2 : 0;
		resultado = "-".equals(operador) ? num1 - num2 : resultado;
		resultado = "*".equals(operador) ? num1 * num2 : resultado;
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;

		System.out.printf("%.1f %s %.1f = %.1f", num1, operador, num2, resultado);

		input.close();
	}
}
