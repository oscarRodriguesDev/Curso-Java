package br.com.aed.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColecoesLista {
	/** Esta classe se destina exemplificar a cria��o e mani�la��o de uma List */
	public static void main(String[] args) {
		/* Assim criamos uma List */
		List<String> list = new ArrayList<String>();
		/* atravez do metodo add adcionamos novos elementos */
		list.add("futebol");
		list.add("basquete");
		list.add("volei");
		list.add("basebol");
		list.add("nata��o");
		list.add("futebol");
		/* forma de apresentar uma lista no formato String */
		System.out.println(list);
		/*
		 * percorrendo os valores de uma list e passando os elementos em caixa
		 * alta(letra maiuscula)
		 */
		for (int i = 0; i < list.size(); i++) {
			String A = list.get(i);
			/*
			 * estou adcionando a posi��o i corrente a mesma palavra porem com letra
			 * maiuscula
			 */
			list.set(i, A.toUpperCase());

		}
		/* apresenta os elementos */
		System.out.println(list);
		/*
		 * podemos verificar qual o indice do elemento informado no parametro do metodo
		 * abaixo
		 */
		System.out.println("indice " + list.indexOf("VOLEI"));
		/*
		 * o metodo abaixo seleciona elementos dentro de um intervalo de posi��es
		 */
		System.out.println(list.subList(1, 5));
		/* podemos remover os elementos dentro do intervalo informado */
		list.subList(2, 6).clear();
		/* apresentamos novamente a nossa List */
		System.out.println(list);
		/** podemos adcionar todo um array dentro de uma List */
		/* criamos um array */
		String[] frutas = { "ma�a", "pera", "uva", "morango", "abacaxi" };
		/*
		 * instanciamos uma List atravez do metodto Static asList da classe Arrays e
		 * informamos o Array de frutas
		 */
		List<String> listadefrutas = Arrays.asList(frutas);
		/* apresentamos o List de frutas */
		System.out.println(listadefrutas);

	}
}
