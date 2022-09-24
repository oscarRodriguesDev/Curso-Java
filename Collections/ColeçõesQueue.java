package br.com.aed.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class ColeçõesQueue
{

	/**
	 * Classe se destina a estudar cole��es do tipo Queue, que recebem e processam
	 * dados em fila de acordo com oque chamamos FIFO, First in First out, primeiro
	 * a entrar entao primeiro a sair
	 */
	public static void main(String[] args) {
		/*
		 * Instanciamos uma Queue da forma como demonstrado abaixo , podemos instaciar
		 * uma Queue de qualquer objeto que quisermos
		 */
		Queue<String> fila = new LinkedList<String>();
		/* podemos entao ir adcionando os dados a nossa fila */
		fila.add("oscar");
		fila.add("thiago");
		fila.add("paloma");
		/*
		 * quando o ultimo elemento for adcionado a fila devemos informar que o mesmo
		 * �pe o ultimo elemento,fazemos isso atravess do metodo offer(), que adciona o
		 * elemento e informa que ele � o ultimo
		 */
		fila.offer("Aika");
		/*
		 * feito isso podemos recuperar o proximo elemento da fila no caso o primeiro
		 * elemento adcionado, atravez do metodo peek()
		 */
		System.out.println(fila.peek());
		/*
		 * o metodo poll(), remove mo proximo elemento da fila e ainda se for nesse�ario
		 * podemos recuperar o valor do mesmo, no foramto String
		 */
		String name = fila.poll();
		System.out.println(name);
		/* podemos tambem imprimir a nossa fila de dados */
		System.out.println(fila);
		/* outros metodos disponiveis em linkedlist */
		LinkedList<String> fila2 = (LinkedList<String>) fila;
		/* adcionando elementos ao inicio da fila */
		fila2.addFirst("Sara");
		/* adcionando elementos ao fim da fila */
		fila2.addLast("Nicoli");
		/* imprimindo a fila no prompt */
		System.out.println(fila);
		/* metodo peekFirst(), diz qual o primeiro elemento da fila */
		String A = fila2.peekFirst();
		/* diz qual o ultimo elemento da fila */
		String B = fila2.peekLast();
		/* vamos imprimir o primeiro e o ultimo elemento da fila */
		System.out.println(A + "  " + B);
		/*
		 * remove o primeiro elemento da fila e retorna uma String com o item removido
		 */
		String C = fila2.pollFirst();
		/* imprimindo o item removido */
		System.out.println(fila2 + "saiu " + C);
		/*
		 * remove o ultimo elemento da fila e tambem retorna uma String com o item
		 * removido
		 */

		fila2.pollLast();
		/* substitui o primeiro elemento pelo elemento discriminado */
		fila2.push("ggggg");
		/* e podemos ver como nossa fila esta */
		System.out.println(fila2);
		/** Finish class */
	}

}
