package oo.heranca.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Palio palio = new Palio();
		
		palio.acelerar();
		System.out.println(palio.toString());

		palio.acelerar();
		System.out.println(palio.toString());

		palio.acelerar();
		System.out.println(palio.toString());

		System.out.println();
		
		Ferrari ferrari = new Ferrari();

		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		System.out.println(ferrari);
	}

}
