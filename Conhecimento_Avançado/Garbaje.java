package br.com.aed.Conhecimento_Avan�ado;

import java.util.ArrayList;
import java.util.List;

public class Garbaje {
	/**
	 * objetivo da classe � demonstrar o uso dos metodos de manipula��o do
	 * GarbageColector
	 */
	/* este metodo sobrecarega a memoria */
	public static long CarregarMemoria() {
		/* um list que vai receber varios numeoros */
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 900_000; i++) {
			/* a lista recebe cada um dos numeros gerados pelo for */
			list.add(i);

		}
		/* vai retornar a quantidade livre de memoria */
		return Runtime.getRuntime().freeMemory();
	}

	public static void main(String[] args) {
		/* forma de recuperar um objetoRuntime, atravez do Runtime.getRuntime() */
		Runtime rt = Runtime.getRuntime();

		int mb = 1_048_576;
		/*
		 * retorna quantidade de memoria disponivel para a jvm ultilizar, em bytes
		 */
		double memoriaMaxima = rt.maxMemory();
		/* valor em megabytes */
		double total = memoriaMaxima / mb;
		System.out.println("memoria total disponivel " + total + " mega bites");
		/*
		 * calcular total de memoria durante a execu��o do metodo de carregamento de
		 * memoria
		 */
		double inicio = total - (CarregarMemoria() / mb);
		System.out.println("memoria durante o carregamento da memoria " + inicio + " mega bites");
		/*
		 * o metodo abaixo forca a finaliza��o de todos os objetos que nao estao sendo
		 * ultilizados
		 */
		rt.runFinalization();
		/* forca a limpeza da memoria */
		rt.gc();
		/* agora apresentar a quantidade de memoria livre depois da limpeza */
		double fim = total - (rt.freeMemory() / mb);
		System.out.println("memoria livre apos limpeza " + fim + " mega bites");
		System.out.println("inicio: " + inicio + " fim: " + fim);

	}

}
