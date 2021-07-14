package classe;

public class PrimeiroTrauma {

//	Abaixo temos um atributo de INSTÂNCIA, que só poderá ser acessado pelo main
//	depois que criarmos uma instância da classe PrimeiroTrauma. Ou podemos
//	determinar um atributo como static e ele poderá ser acessado diretamente,
//	sem necessidade de instanciar o objeto.
	int a = 3; // não pode mexer aqui!
	static int b = 4;

	public static void main(String[] args) {

		PrimeiroTrauma p = new PrimeiroTrauma();

		System.out.println(p.a);
		System.out.println(b);

	}
}
