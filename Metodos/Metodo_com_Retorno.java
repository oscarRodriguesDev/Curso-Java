package br.com.aed.Metodos;

/*Proposito desta classe � demonstrar a ultiliza��o dos metodos com retornto*/
public class Metodo_com_Retorno {
	static Carro Atual;
	Carro retornado = new Carro("corsa");

	/*
	 * como o propio nome diz sao metodos que retorna alguma coisa,os metodos podem
	 * retornar tipos primitivos ou objetos
	 */
	/* metodos retornando String */

	public String str() {
		/* obrigatoriamente temos que colocar um retorn */
		return "retorno";
	}

	/* retorna um inteiro */
	public int teste() {

		return 5;
	}

	/* retrna um booleano */
	public boolean vouf() {

		return true;
	}

	/* retorna um long */
	public long numero() {

		return 100_000_000;
	}

	/*
	 * para o metodo abaixo vamos precisa criar outra classe crie ai a classe
	 * Carro.java vamos
	 */

	public Carro novoCarro() {
		return retornado;

	}

	public static void main(String[] args) {
		/* podemos igualar os metodos a tipos que o mesmo retornam */
		/* Instancia da classe */
		Metodo_com_Retorno mcr = new Metodo_com_Retorno();
		/* pela variavel podemos chamar os metodos com retorno */
		// retornando a String
		String retorno = mcr.str();
		System.out.println(retorno);
		// retornando o inteiro
		int inteiro = mcr.teste();
		System.out.println(inteiro);
		// retornando o booleano
		boolean trueourfalse = mcr.vouf();
		System.out.println(trueourfalse);
		// retornando o long
		long number = mcr.numero();
		System.out.println(number);
		/* rode a classe para ver o resultado */

		// retornando um objeto
		Atual = mcr.novoCarro();
		/*
		 * podemos inclusive recuperar atributos e chamar possiveis metodos exixtentes
		 * do objeto
		 */
		System.out.println(Atual.nome);

	}
}
