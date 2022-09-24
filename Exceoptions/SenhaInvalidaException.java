package br.com.aed.Exceoptions;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends Exception {

	/*
	 * nesta classe vamos mostrar como criar uma exce��o, antes de mais nada a
	 * classe qeue criamos deve extender a classe exception
	 */
	public SenhaInvalidaException(String mensagem) {
		/*
		 * O construtor recebe como parametro uma mensagem que ser� apresentada quando
		 * ocorrer o erro que esta classe representa
		 */
		super(mensagem);

	}

}
