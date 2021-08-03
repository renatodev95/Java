package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Quantas notas: ");
		int qtdNotas = input.nextInt();

		double[] notas = new double[qtdNotas];

		// Salvando os dados do array
		for (int i = 0; i < qtdNotas; i++) {
			System.out.printf("Informe a nota %d: ", i + 1);
			notas[i] = input.nextDouble();
		}

		// Percorrendo o array e calculando a média final
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}

		double media = total / notas.length;
		System.out.printf("A média é: %.1f!", media);

		input.close();
	}
}