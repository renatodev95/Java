package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String palavra = "";

		while (!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			palavra = input.next();
		}

		System.out.println("FIM!");

		input.close();
	}
}
