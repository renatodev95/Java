package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Produto p1 = new Produto("iPad", 3235.89, 0.13);

		// A partir do produto, calcular o preco real (com desconto)
		BinaryOperator<Double> precoComDesconto = (preco, desconto) -> preco * (1 - desconto);
		// Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento)
		UnaryOperator<Double> impostoMunicipal = p -> p >= 2500 ? p + (8.5 * (p / 100)) : p;
		// Frete: >= 3000 (100) / < 3000 (50)
		UnaryOperator<Double> frete = p -> p >= 3000 ? p + 100 : p + 50;
		// Arredondar: Deixar duas casas decimais
		UnaryOperator<Double> arredondar = p -> Double.parseDouble(String.format("%.2f", p));
		// Formatar: ex. R$1234,56
		Function<Double, String> formatar = p -> ("R$" + p).replace(".", ",");

		String valor = precoComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar)
				.apply(p1.preco, p1.desconto);

		System.out.println(valor);
	}
}
