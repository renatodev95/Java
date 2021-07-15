package classe.desafio;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	// Aqui está a passagem de objeto como parâmetro
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	void imprimirDadosPessoa() {
		System.out.printf("Nome: %s / Peso: %.3f\n", this.nome, this.peso);
	}

	String apresentar() {
		return "Nome: " + nome + " / Peso: " + peso + "Kg.";
	}
}
