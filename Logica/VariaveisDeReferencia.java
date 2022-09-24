package br.com.aed.Logica;

public class VariaveisDeReferencia {
	/** classe destina-se a exemplificar as variaveis de referencia */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* o valor e armazenado na memoria */
		int x = 5;
		/* o valor e substituido na memoria */
		x = 6;
		/* o valor esta gravado na memoria */
		String str = "curso";
		/*
		 * o valor e substituido mas o antigo valor aiunda est� na memoria, nesse
		 * momento � que o garbage collector entra em a��o
		 */
		str = "curso java";
		/*
		 * anulando valores da String o valor ainda est� na memoria e pode ser limpo
		 * pelo garbage/collector
		 */

		str = null;

	}

}
