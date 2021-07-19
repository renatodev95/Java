package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma excessão
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> obter o próximo elemento da fila (sem remover)
		// Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma excessão
		System.out.println(fila.element());

		// Poll e Remove -> obter o próximo elemento da fila e remove!
		// Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.poll()); // retorna null quando a fila está vazia
		System.out.println(fila.remove()); // lança uma excessão quando a fila está vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();

	}
}