package br.com.aed.Objetos_Com_Parmetros;

/*um objeto pode conter outro, nosso carro vai possuir um outro objeto o motor*/
public class Motor {
	/* atributos do motor */
	String tipo;
	double potencia;

	/* na cria�ao do motor vamos especificar seu tipo */
	public Motor(String tipo) {
		this.tipo = tipo;
		System.out.println("carro possui motor tipo " + tipo);

	}

	public void barulhomotor(String Barulho) {
		System.out.println(Barulho);

	}

}
