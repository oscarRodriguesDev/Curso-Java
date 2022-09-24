package br.com.aed.Desafios;

import java.util.Random;
import java.util.Scanner;

public class Dados {
	/** Classe � a resposta do desafio dos dados */
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		/*
		 * preciso de um palpite, vamos jogar com dois dados o que da onze
		 * possibilidades* 2,3,4,5,6,7,8,9,10,11,12
		 */
		/* entao vamos pegar o palpite */
		Scanner s = new Scanner(System.in);
		String palpite = s.nextLine();
		/* vamos limitar as possibilidades de palpite do jogadores */
		int palpiteN = new Integer(palpite);
		if (palpiteN < 2 || palpiteN > 12) {
			System.out.println("aposta invalida, valor deve ser entre 2 e 12!");
			/* se a aposta for invalida o programa pede outra aposta */
			s.next();
		}

		/*
		 * agora precisamos de um local onde armazenaremos as possibilidades dos dados
		 */
		int[] dados = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		/* agora atraves do objeto RAndom vamos sortear os indices do array */
		Random R = new Random();
		/*
		 * podem,os entao atribuir o resultado do sorteio a uma variavel e assim
		 * comparar com o palpite
		 */
		int sorteado = R.nextInt(dados.length);

		/*
		 * agora sim a compara��o entre o palpite e o numero sorteado, o numero
		 * randomico corresponde apenas ao indice do array nao ao se elemento
		 * diretamente
		 */
		if (palpiteN == dados[sorteado]) {
			System.out.println("parabens voce acertou!!!");
		} else {
			System.out.println("Oh nao! o numero sorteado foi " + dados[sorteado] + "! Voce errou tente outra vez! ");

		}

	}

}
