package cpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cpf {

	String nome;
	String cpf;

	Cpf(String nome, String cpf) {
		this.nome = nome;
		this.cpf = limpaCpf(cpf);
	}

	String limpaCpf(String cpfEnviado) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(cpfEnviado);
		String limpo = "";
		while (m.find()) {
			limpo += m.group();
		}
		return limpo;
	}

	boolean verificarSequencia() {
		String sequence = "";
		String subCpf = this.cpf.substring(0, 9);
		for (int i = 0; i < 11; i++) {
			sequence += subCpf.charAt(0);
		}
		return this.cpf.equals(sequence);
	}

	String verificaDigito() {
		String newCpf = this.cpf.substring(0, 9);

		return newCpf;
	}

	String gerarDigito(String cpfSemDigito) {
		int total = 0;
		int reverso = cpfSemDigito.length() + 1;

		// Resolver a lógica desse FOR aqui
		for (char n : cpfSemDigito.toCharArray()) {
			System.out.println("Total: " + total + "  " + n + " * " + reverso);
			total += Math.multiplyExact((int) n, reverso);
			reverso--;
		}

		int digito = 11 - (total % 11);
		System.out.println("Digito -> " + digito);
		return digito >= 10 ? "0" : Integer.toString(cpfSemDigito.length() + 1);
	}

	boolean valida() {
		if (this.cpf.equals("")) {
			return false;
		}
		if (verificarSequencia()) {
			return false;
		}
		if (this.cpf.length() != 11) {
			return false;
		}
		return true;
	}

}
