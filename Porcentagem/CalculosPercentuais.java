package br.com.aed.Porcentagem;

import java.util.ArrayList;

/*Esta classe faz calculos relacionados a porcentagem*/
public class CalculosPercentuais {

	static ArrayList<Character> ValorEmCaracter;
	static int Resultado;

	/**
	 * metodo calcula a porcentagem de qualquer valor dado, retorna apenas valores
	 * inteiros
	 */
	public static int CalculaPorcentagem(double valor, double percentual) {
		/*
		 * VAi receber cada um dos caracteres da String advinda do doubleResult
		 */
		ValorEmCaracter = new ArrayList<>();
		/* aqui a conta propiamente dita eceita valores double */
		double doubleResult = percentual / 100 * valor;
		/* converte o resultado em String */
		String StringResult = String.valueOf(doubleResult);
		/*
		 * ultilizamos o for para percorrer cada um dos caracteres do StringResult cada
		 * caracter encontrado vai sendo adcionado ao array de caracteres
		 */
		for (int i = 0; i < StringResult.length(); i++) {
			char c = StringResult.charAt(i);
			ValorEmCaracter.add(c);
			/*
			 * geralmente porcentagem retorna valores com decimais queremos apenas valores
			 * inteiros por isso, toda vez que o programa encontra o ponto('.') ele da um
			 * break no for
			 */
			if (c == '.') {
				/*
				 * remove o ultimo caracter adcionado que � por consequencia o ponto('.')
				 */
				ValorEmCaracter.remove(i);
				/*
				 * forma uma string com a substring comecando por zero e indo // * at� o indice
				 * encontrado no for
				 */
				String Result = StringResult.substring(0, i);
				/* convertemos o Result em um inteiro */
				Resultado = Integer.parseInt(Result);

				break;
			}
		}
		/* retornamos o valor */
		return Resultado;
	}

	/**
	 * Metodo retorna percentual quando se tem o valor toatal e o valor obtido onde
	 * valor e valor obtido de uma porcentagem, e VT = valor integral antes da
	 * porcentagem
	 */

	public static int CalculaPercentual(double valorTotal, double valor) {

		/*
		 * VAi receber cada um dos caracteres da String advinda do doubleResult
		 */
		ValorEmCaracter = new ArrayList<>();
		/* aqui a conta propiamente dita eceita valores double */
		double doubleResult = 100 / valorTotal * valor;
		String StringResult = String.valueOf(doubleResult);
		/*
		 * ultilizamos o for para percorrer cada um dos caracteres do StringResult cada
		 * caracter encontrado vai sendo adcionado ao array de caracteres
		 */
		for (int i = 0; i < StringResult.length(); i++) {
			char c = StringResult.charAt(i);
			ValorEmCaracter.add(c);
			/*
			 * geralmente porcentagem retorna valores com decimais queremos apenas valores
			 * inteiros por isso, toda vez que o programa encontra o ponto('.') ele da um
			 * break no for
			 */
			if (c == '.') {
				/*
				 * remove o ultimo caracter adcionado que � por consequencia o ponto('.')
				 */
				ValorEmCaracter.remove(i);
				/*
				 * forma uma string com a substring comecando por zero e indo // * at� o indice
				 * encontrado no for
				 */
				String Result = StringResult.substring(0, i);
				/* convertemos o Result em um inteiro */
				Resultado = Integer.parseInt(Result);

				break;
			}
		}
		/* retornamos o valor */
		return Resultado;

	}

	/**
	 * metodo abaixo retorna o valor total integral antes das opera��es de
	 * porcentagem, onde se tem o valor percentual usado em uma conversao, e o valor
	 * resultante do calculo dessa porcentagem
	 */

	public static int calculaValorTotal(double percentual, double valor) {
		/*
		 * VAi receber cada um dos caracteres da String advinda do doubleResult
		 */
		ValorEmCaracter = new ArrayList<>();
		/* aqui a conta propiamente dita eceita valores double */
		double doubleResult = percentual * 100 / valor;
		String StringResult = String.valueOf(doubleResult);
		/*
		 * ultilizamos o for para percorrer cada um dos caracteres do StringResult cada
		 * caracter encontrado vai sendo adcionado ao array de caracteres
		 */
		for (int i = 0; i < StringResult.length(); i++) {
			char c = StringResult.charAt(i);
			ValorEmCaracter.add(c);
			/*
			 * geralmente porcentagem retorna valores com decimais queremos apenas valores
			 * inteiros por isso, toda vez que o programa encontra o ponto('.') ele da um
			 * break no for
			 */
			if (c == '.') {
				/*
				 * remove o ultimo caracter adcionado que � por consequencia o ponto('.')
				 */
				ValorEmCaracter.remove(i);
				/*
				 * forma uma string com a substring comecando por zero e indo // * at� o indice
				 * encontrado no for
				 */
				String Result = StringResult.substring(0, i);
				/* convertemos o Result em um inteiro */
				Resultado = Integer.parseInt(Result);

				break;
			}
		}
		/* retornamos o valor */
		return Resultado;

	}

	public static void main(String[] args) {
		/* modifique os valores e veja os resultados */
		/**
		 * o primeiro metodo retorna o resultado de uma opera��o simples de porcentagem,
		 * dado o valor de 500, 30% desse valor vai ser igual ao Result
		 */
		int Result = CalculosPercentuais.CalculaPorcentagem(600, 200);
		System.out.println("total = " + Result);
		/**
		 * o segundo metodo retorna qual percentual representa um valor dentro de outro
		 * tambem dado. dado o valor integral 500, quantos por cento 150 representa
		 * desse valor? a resposta ser� o percentual
		 */
		int percentual = CalculosPercentuais.CalculaPercentual(60, 2);
		System.out.println("percentual mega sena= " + percentual);

		/**
		 * o terceiro metodo retorna o valor integral quando se tem o resultado de uma
		 * opera��o de porcentagem, e tambem tem o percentual que foi usado para a
		 * opera��o. dado o o resultado de uma opera��o de porcentagem simples em 150, e
		 * o percentual usado nesta opera��o de 30%, qual foi o valor integral sobre o
		 * qul foi realizada a opera��o
		 */
		int Valorintegral = CalculosPercentuais.calculaValorTotal(150, 30);
		System.out.println("valor total = " + Valorintegral);

	}
}
