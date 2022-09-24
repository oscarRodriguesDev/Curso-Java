package br.com.aed.Estudo_objetos;

/*esta clsse serve para ilustrar o uso dos metodos get e set*/
public class Funcionario {
	/*
	 * os metodos set e get servem para alterar valores quando o atributo esta
	 * usando o modificador private ou protected, como os atributos nao estao
	 * visiveis em outras classes podemos tornalos visiveis atraves do metodo get e
	 * altera-los atraves do metodo set
	 */

	private String nome;// exemplo em string
	private boolean ativo;// exemplo em boolean

	/* estrutura do metodo get */
	public String getNome() {
		// retorna o nome
		return nome;
	}

	/*
	 * esstrutura do metodo set recebe um parametro para altera-lo
	 */
	public void setNome(String N) {
		// importante igualar O parametro ao valor que est� sendo alterado
		this.nome = N;
	}

	/* para recuperarmos um booleano usamos o prefixo is antes da variavel */
	public boolean isAtivo() {
		return ativo;
	}

	/* no set para booleano nada se altera */
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
