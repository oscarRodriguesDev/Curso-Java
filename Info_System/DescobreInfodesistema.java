package br.com.aed.Info_System;

public class DescobreInfodesistema {

	/*
	 * o metodo system.getPropert retorna uma String que indica onde o ele(o metodo
	 * ) esta sendo executado
	 */
	static String LOCALIZAUSUARIO = System.getProperty("user.dir");
	/*
	 * aqui ultiizando conceitos de manipula��o de strings localizamos a String com
	 * o letra que identifica a unidade principal do sistema
	 */
	final static String UNIDADE = LOCALIZAUSUARIO.substring(0, 3);

	public static void main(String[] args) {

		/* imprime a localiza��o de onde est� sendo execuytado o metodo */
		System.out.println(LOCALIZAUSUARIO);
		/* imprime a unidade principal do sistema */
		System.out.println(UNIDADE);

	}

}
