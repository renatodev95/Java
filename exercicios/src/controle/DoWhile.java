package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String valor = "";

		do {
			System.out.print("Você diz: ");
			valor = input.next();
		} while (!valor.equalsIgnoreCase("sair"));

		input.close();
	}
}
