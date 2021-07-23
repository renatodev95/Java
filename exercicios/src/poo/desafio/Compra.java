package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();

	void addItem(Produto p, int qtd) {
		this.itens.add(new Item(p, qtd));
	}

	void addItem(String nome, double preco, int qtd) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtd));
	}

	double obterValorTotal() {
		double total = 0;

		for (Item i : this.itens) {
			total += i.quantidade * i.produto.preco;
		}

		return total;
	}
}
