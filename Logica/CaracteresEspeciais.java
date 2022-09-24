package br.com.aed.Logica;

public class CaracteresEspeciais {
	String[] rs;

	/***/

	/**
	 * Este tipo de caractere marca o bloco de comentario de varias linhas, este
	 * tipo especifico � usado para criar documenta��o java
	 */
	/**/
	/*
	 * este tipo de daractere � usado para comentario de varias linhas mas nao
	 * aparece na documenta��o de classes java
	 */
	//
	// este tipo de caractere � usado para comentarios de uma unica linha

	/** comentarios sao ignorados durante a compila��o */

	public static void main(String[] args) {
		System.out.println(// linha de comentario
		);
		/** outros caracteres especiais */
		/* quebra de linha */
		System.out.print(" oscar sara \n aika nicoli");// \n
		/* tabelar */
		System.out.println("\n \t oscar, sara,\t aika,nicoli");// \t

	}
}
