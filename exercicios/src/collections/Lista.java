package collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");

		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3).toString()); // acessando o elemento pelo ÍNDICE

		System.out.println(">>> Removido: " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));

		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}

	}
}

// ---LIST---
// Caacterísticas:
// * Pode ser HETEROGÊNEA (não recomendado);
// * Pode ser HOMOGÊNEA (recomendado);
// * Aceita Objetos Duplicados;
// * É ORDENADA;
// * É INDEXADA;