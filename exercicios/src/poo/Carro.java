package oo.composicao;

public class Carro {

	final Motor motor;

	Carro() {
		this.motor = new Motor(this);
	}

	void acelerar() {
		if (motor.fatorInjecao < 2.5)
			motor.fatorInjecao += 0.4;
	}

	void frear() {
		if (motor.fatorInjecao > 0.5)
			motor.fatorInjecao -= 0.4;
	}

	void ligar() {
		if (!motor.ligado) {
			motor.ligado = true;
		} else {
			System.out.println("O motor já está ligado.");
		}
	}

	void desligar() {
		if (motor.ligado) {
			motor.ligado = false;
		} else {
			System.out.println("O motor já está desligado.");
		}
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
