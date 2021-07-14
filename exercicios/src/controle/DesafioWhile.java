package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int qtdNota = 0;

		while (nota != -1) {
			System.out.print("Informe uma nota: ");
			nota = input.nextDouble();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				qtdNota++;
			} else if (nota != -1) {
				System.out.println("Nota inválida");
			}
		}

		double media = total / qtdNota;

		System.out.printf("Média = %.1f", media);

		input.close();

	}
}
