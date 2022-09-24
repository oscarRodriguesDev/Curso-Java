package br.com.aed.Exceoptions;

public class Exception1 {
	/*
	 * Excessoes sao basicammente erros: abaixo exemplo de algumas excessoes
	 */
	/*
	 * para que vc teste as aplica��es marque o bloco que nao vai testar como
	 * comentario isso � nesse�ario pois quando o programa encontra uma execessao
	 * ele para a execu��o do mesmo
	 */

	public static void main(String[] args) {

		/* lanca uma excessao do tipo ArithmeticException) */
		int x = 5 / 0;

		System.out.println(x);

	}

}
