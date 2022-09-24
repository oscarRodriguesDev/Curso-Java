package br.com.aed.Logica;

public class FluxoSwitch {
	/**
	 * classe destina-se a demonstrar o controle de fluxo switch o fluxo switch
	 * significa seletor dentro desse seletor informamos a base de contrle do switch
	 * que vai definir o seu ligado e desligado
	 */
	public static void main(String[] args) {
		/* Vamos construir nosso prieiro fluxo switch */
		char sexo = 'f';

		/* assim se controi u switch */
		switch (sexo) {
		/* aqui dentro vamos definir alguns possiveis casos */
		case 'f':
			System.out.println("mulher");
			/* se voce nao executar o break o fluxo vai continuar */
			break;
		case 'm':
			System.out.println("homem");
			break;
		default:
			System.out.println("indefinido");
			break;

		}
		/*
		 * abaixo um diferencial note que nao usamos a palavra break em todos os caso
		 * apenas em um bloco de casos, entao se a condi��o estivesse dentro ele
		 * exibiria a op��o e ai sim para a execu��o
		 */

		String tecnologia = "oracle";

		switch (tecnologia) {
		case "java":
		case "c++":
		case "cobol":
			System.out.println("linguagem de programa��o");
			break;
		case "oracle":
		case "postgreee":
		case "sql server":
			System.out.println("banco de dados");
			break;
		default:
			System.out.println("outra tecnoogia");

		}
	}

}
