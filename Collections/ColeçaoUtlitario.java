package br.com.aed.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColeçaoUtlitario
{

	/** Classe se destina demonstrar metodos para trabalhar com cole�oes java */

	public static void main(String[] args) {
		/* vamos construir uma cole��o do tio List */
		List<String> list = new ArrayList<String>();
		/* vamos adcionar uma lista de frutas */
		list.add("ma��");
		list.add("manga");
		list.add("mamao");
		list.add("acai");
		list.add("morango");
		/* podemos apresentar nossa List */
		System.out.println("primeira lista " + list);
		/* metodo sort(collection type) coloca a lista em ordem alfabetica */
		Collections.sort(list);
		/* veja o resutado */
		System.out.println(" lista em orddem alfabetica " + list);
		/* metodo reverse(collection type), inverte a posi��o da lista */
		Collections.reverse(list);
		System.out.println("lista invertida " + list);
		/* metodo shuffle(collection type) embaralha os elementos da lista */
		Collections.shuffle(list);// embaralha os elementos da lista
		System.out.println("lista embaralhada " + list);
		/* metodo abaixo adciona os elementos informados a lista */
		Collections.addAll(list, "cupua�u", "laranja", "uva", "uva", "uva", "manga");
		Collections.sort(list);
		/* verifica a frequencia em que um elemento aparece na cole��o */
		System.out.println("frequencia do elemento 'uva' " + Collections.frequency(list, "uva"));
		/* metodo fill( )preenche toda a cole��o com o texto informado */
		/** para ver o resultado tire os cmandos abaixo do bloco de comentario */
		// Collections.fill(list, "000");// preenche toda minha cole��o com o
		// System.out.println(list);
		/* Cole��o nao modificavel */
		List<String> lista2 = Arrays.asList("uva", "morango");
		/* verifica se na lista principal esta contido a lista secundaria */
		boolean d = Collections.disjoint(list, lista2);
		System.out.println("lista2 eata dentro de lista? " + d);
		/* lista em ordem alfabetica */
		Collections.sort(list);
		/*
		 * o metodo binarySearch pesquisa na lista informada o indice de um determinado
		 * elemento
		 */
		int c = Collections.binarySearch(list, "uva");
		System.out.println("indice de uva dentro de lista " + c);
		/*
		 * metodo unmodifiableCollection(list); cria uma cole��o que nao pode ser
		 * modificada, tornando-se uma cole��o do tipo Final
		 */
		Collection<String> fin = Collections.unmodifiableCollection(list);

		System.out.println(fin);

	}

}
