package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println("O tamanho é " + conjunto.size());

		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("O tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("O tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(1);
		System.out.println(true);

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		conjunto.addAll(nums); // união entre dois conjuntos
		// conjunto.retainAll(nums); // interseção (apenas o valor que estava presente
		// nos dois conjuntos)
		System.out.println(conjunto);

		conjunto.clear(); // limpando o conjunto inteiro
		System.out.println(conjunto);
	}
}

//				---SET---
//	Características:
//		* Pode ser HETEROGÊNEO (não é a forma ideal);
//		* Pode ser HOMOGÊNEO;
//		* Não aceita Objetos Duplicados;
//		* Pode ser ORDENADO;
//		* Não é indexado;
