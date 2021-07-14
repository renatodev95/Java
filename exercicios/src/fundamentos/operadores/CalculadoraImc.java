package fundamentos.operadores;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double altura = input.nextDouble();
		double peso = input.nextDouble();
		double imc = peso / Math.pow(altura, 2);

		System.out.printf("O imc é: %.1f", imc);

		input.close();
	}
}
