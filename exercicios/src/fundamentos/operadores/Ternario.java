package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		double media = 8.6;
		String resultadoParcial = media >= 5 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;

		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";

		System.out.println("O aluno está " + resultadoFinal);
		System.out.printf("Tem desconto? %s", resultado);
	}
}
