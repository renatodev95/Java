package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Sem ordenação por ordem de inserção
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		for (int n : nums) {
			System.out.println(n);
		}

		// -----------------------------------------------

		// Conjunto ordenado por ordem de inserção
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

	}
}

// Na criação do segundo conjunto definimos que os tipos a serem inseridos nele
// podem ser apenas Strings
// Na primeira instanciação não há ordenamento dos objetos no conjunto por ordem
// de inserção,
// mas na segunda utilizamos o SortedSet e TreeSet para determinar que deve
// haver ordem de inserção
// na organização dos objetos do conjunto.