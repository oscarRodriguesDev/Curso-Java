package br.com.aed.Objetos_Com_Parmetros;

public class CarroTeste {

	public static void main(String[] args) {

		/*
		 * com o construtor do carrosem parametros precisams definir cada um de seus
		 * atributos e o motor que o acompanha
		 */
		Carro Ferrari = new Carro();
		/* Precisamos instanciar um motor */
		Motor V12 = new Motor("V12");
		/* vamos definir o barulho do motor */
		V12.barulhomotor("Vrummmmmmm....");
		/* vamos definir a potencia do motor */
		V12.potencia = 600;
		/* vamos definir os atributos do carro, op modelo */
		Ferrari.modelo = "Ferrari";
		/* tempo gasto par air de 0 a 100 km */
		Ferrari.segundoZeroACem = 3.0;
		/* definir o motor que o acompanha */
		Ferrari.motor = V12;
		/* definir a velocidade maxima que ele pode atingir */
		Ferrari.VelocidadeMaxima = 500;
		/*
		 * nesta instancia de carro um fiat palio e vamos passar como parametro os
		 * mesmos atributos passados a ferrari, a economia de linhas de codigo e muito
		 * grande
		 */
		Carro Fiat = new Carro("fiat Palio", 300, 2.0, V12);
		/* Vamos instaciar um motor */
		Motor V15 = new Motor("V15");
		/* e vamos instanciar um carro que vai ultilizar este motor */
		Carro Dodge = new Carro("Dodge", 200, 3.0, V15);
		/* podemos apresentarr o s resultados */
		System.out.println(Dodge.motor.tipo);
		System.out.println(Fiat.modelo);
		System.out.println(Dodge.segundoZeroACem);

	}

}
