package cpf;

public class Usuario {

	public static void main(String[] args) {

		Cpf p1 = new Cpf("Renato", "049.672.941-89");

		System.out.println(p1.gerarDigito("049672941"));
	}
}
