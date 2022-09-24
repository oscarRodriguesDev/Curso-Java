package br.com.aed.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {
	/**
	 * Nesta classe vamos exemplificar o uso das cole��es tipo Set que nao aceitam
	 * duplicatas
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		/*
		 * vamos criar um Array de Strings e vamos adcionar o nome de cores a ele
		 */
		String[] cores = { "amarelo", "verde", "azul", "branco", "amarelo", "verde", "azul" };

		/*
		 * em seguida vamos criar uma List e vamos adcionar este Array a ela, informando
		 * o nome do array como parametro da list
		 */
		List<String> list = Arrays.asList(cores);
		/* apenas para confirmar vamos apresentar nossa list no console */
		System.out.println("elementos adcionados a List " + list);
		/*
		 * finalmente podemos criar uma Set e informa nossa list como parametro, ao
		 * imprimirmos os valores,veremos que valores duplicados nao foram adcionados a
		 * Set
		 */
		Set<String> set = new HashSet(list);
		System.out.println(set);
	}

}
