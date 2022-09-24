package br.com.aed.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {
	/**
	 * classe destinada a trabaljhar com cole��es tipo map que trabalha com conjunto
	 * de chaves e valores correspondentes
	 */
	public static void main(String[] args) {
		/*
		 * vamos entao instanciar a nossa Map, os valore spodem ser de qualquer tipo de
		 * objeto
		 */
		Map<String, String> Pais = new HashMap<>();
		/*
		 * atravez do metodo put(tipo chave,tipo valor), podemos adcionar, nossa chave
		 * seguida de seu respectivo valor
		 */
		Pais.put("BR", "Brasil");
		Pais.put("USA", "Estados Unidos");
		Pais.put("RU", "Russia");
		Pais.put("IN", "India");
		Pais.put("CN", "China");
		/* podemos entao imprimir nossa nossa Map */
		System.out.println(Pais);
		/*
		 * o metodo containsKey(tipo chave ) retorna um booleano infomando se a chave se
		 * encontra ou nao na Map
		 */
		boolean A = Pais.containsKey("USA");
		/*
		 * o metodo containsVAlue(tipo chave ) retorna um booleano infomando se o valor
		 * se encontra ou nao na Map
		 */
		boolean B = Pais.containsValue("Brasil");
		/* podemos imprimir os valores */
		System.out.println(A);
		System.out.println(B);
		/*
		 * podemos recuperar o pais apenas informando sua chave, atravez do metodo
		 * get(tipo chave)
		 */
		String E = Pais.get("USA");
		System.out.println(E);
		/*
		 * podemos recuperar cada uma das chaves da nossa Map atravez do metod KeySet,
		 * que nao aceita dados duplicados
		 */
		Set<String> Key = Pais.keySet();
		/* entao podemos percorrer a Set */
		for (String K : Key) {
			/* e apresentar os valores */

			// System.out.println(K);

			/*
			 * podemos evolui e apresentar a chave seguida de seu valor correspondente
			 */
			System.out.println(K + " " + Pais.get(K));
		}

	}

}
