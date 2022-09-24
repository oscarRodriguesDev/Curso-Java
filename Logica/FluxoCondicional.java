package br.com.aed.Logica;

public class FluxoCondicional {
	/**
	 * nesta classe vamos conhecer os fluxos condicionais, e vamos come�ar pelo
	 * fluxo if else, para definir melhor o fluxo if else significa se(if) condi��o
	 * for preenchida fa�a[bloco de instru��o ] senao(else) fa�a outro[bloco de
	 * instru��o]
	 */

	public static void main(String[] args) {
		boolean bloqueado;

		/* vamos analizar uma condi��o */
		int idade = 18;
		if (idade >= 18) {
			/* se trata de um adulto de maior */
			System.out.println("pessoa � maior de idade");
			bloqueado = false;
		} else {
			System.out.println("pessoa � menor de idade");
			bloqueado = true;

		}
		/*
		 * podemos ultilizar varios ifs sem necessidade do else que usado uma vez por
		 * bloco seguidos
		 */

		int ano = 1980;

		if (ano > 1984) {
			System.out.println(" pessoa nova");
		}
		if (ano <= 1984 && ano > 1970) {
			System.out.println("pessoa com idade media");
		}
		if (ano < 1970) {
			System.out.println(" pessoa partindo pra terceira idade");
		}

		/*
		 * tambem podemos usar o else if que impoe uma consdi��o depois do else nesse
		 * exemplo vamos liberar ou nao o acesso a conteudo de acordo com a idade do
		 * usuario, op��o de rede, e op�oes de cnteudos disponiveis
		 */
		/* o boleano que avalia a idade esta no inico da classe */

		/* diz se ha ou nao rede */
		boolean rede = true;
		/* informa se ha ou na cnteudo */
		boolean conteudo = false;

		/*
		 * apenas para titulo de curiosidade vamos definir os valores de boolean atravez
		 * da idade do usuario
		 */

		if (bloqueado == true || rede == false) {
			System.out.println("conteudo nao liberado");
		}
		if (bloqueado == false && rede == true && conteudo == true) {
			System.out.println("conteudo  liberado");
		} else if (conteudo == false) {
			System.out.println("nao ha conteudo");
		}

	}
}
