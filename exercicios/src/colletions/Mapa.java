package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		// Adicionando elementos ao MAP
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		// Métodos comuns (size e map)
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		// Acessando chaves e valores do MAP
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		// Verificando se o MAP contem uma chave ou um valor
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Roberto"));

		System.out.println(usuarios.get(4)); // Obtendo os elementos de um MAP
		System.out.println(usuarios.remove(1)); // removendo elementos através da chave

		// Exibindo as chaves com FOREACH
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		// Exibindo os valores com FOREACH
		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		// Exibindo chave e valor com FOREACH
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}
}
