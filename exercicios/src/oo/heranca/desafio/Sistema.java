package oo.heranca.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Palio c1 = new Palio();
		
		c1.acelerar();
		System.out.println(c1.toString());

		c1.acelerar();
		System.out.println(c1.toString());

		c1.acelerar();
		System.out.println(c1.toString());

		System.out.println();
		
		Ferrari c2 = new Ferrari(400);

		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}

}
