package br.com.aed.Objetos_Com_Parmetros;

/*esta clsse destina-se a estudar os objetos com parametros*/
public class Carro {
	/* atributos do objeto */
	/* modelo */
	String modelo;
	/* a velocidade maxima que pode atingir */
	int VelocidadeMaxima;
	/* segundo */
	double segundoZeroACem;
	/* o motor do carro */
	Motor motor;// vide classe motor

	/*
	 * construtor de carro passando os parametros, quando passamos os parametros a
	 * um objeto os mesmos passam a fazer parte do objeto
	 */
	public Carro(String modelo, int VelocidadeMaxima, double segundoZeroACem, Motor motor) {
		/*
		 * precisamos dizer que os parametros passados sao iguais aos atributos da
		 * classe, dessa forma podemos alterar os valores nsa instancias futuras do
		 * objeto
		 */
		this.modelo = modelo;
		this.segundoZeroACem = segundoZeroACem;
		this.VelocidadeMaxima = VelocidadeMaxima;
		this.motor = motor;

	}

	/* se voce nao construir este construtor ele nao ser� criado pelo compilador */
	public Carro() {
		// TODO Auto-generated constructor stub
	}

}
