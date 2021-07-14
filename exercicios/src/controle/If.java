package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = input.nextDouble();

		if (media >= 7.0 && media <= 10) {
			System.out.println("Aluno aprovado!");
			System.out.println("Parabéns!");
		}

		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}

		boolean criterioReprovacao = media < 4.5 && media >= 0;
		if (criterioReprovacao) {
			System.out.println("Reprovado");
		}

		input.close();
	}
}
