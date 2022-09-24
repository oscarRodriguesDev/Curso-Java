package br.com.aed.Exceoptions;

public class Exceptions {
	/*
	 * Excessoes sao basicammente erros: abaixo exemplo de algumas excessoes
	 */
	/*
	 * para que vc teste as aplica��es marque o bloco que nao vai testar como
	 * comentario isso � nesse�ario pois quando o programa encontra uma execessao
	 * ele para a execu��o do mesmo
	 */

	static int[] arrayNull;

	/**
	 * marque como comentario(//) o metodo System.out.print() que nao ir� testar, se
	 * vc nao fizer isso a execu��o do programa ser� parada quando o erro acontecer,
	 * se nao marcar nao poder� visualizar os erros
	 */
	public static void main(String[] args) {
		/* lan�a uma NullPointerException */
		System.out.println(arrayNull.length);
	}

}
