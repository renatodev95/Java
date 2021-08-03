package lambdas;

@FunctionalInterface
public interface Calculo {
	// Dentro de uma interface funcional pode haver apenas 1 MÉTODO ABSTRATO
	abstract double executar(double a, double b);
	
	// Pode ter método DEFAULT
	default String legal() {
		return "legal";
	}
	
	// Pode ter método ESTÁTICO
	static String muitoLegal() {
		return "Muito legal";
	}
}
