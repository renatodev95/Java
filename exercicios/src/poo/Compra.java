package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	void addItem(Item item) {
		itens.add(item);
		item.compra = this;
	}

	double getTotalPrice() {
		double total = 0;
		for (Item i : itens) {
			total += i.preco * i.quantidade;
		}
		return Math.round(total);
	}
}
