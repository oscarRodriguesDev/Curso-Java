package br.com.aed.Metodos;

import javax.swing.JOptionPane;

/*Esta Classe destina-se a explicar o que sao os metodos*/
public class MetodoSimples {
	/*
	 * metodos sao a��es que sao atribuidas a objetos que podem ser chamados pelas
	 * variaveis das instancias das classes
	 */
	/*
	 * os metodos abaixo sao simples, sao metodos publico(podem ser usados
	 * diretamente em outras classes,void(nao retornam nada)
	 */
	public void Imprimi() {
		/*
		 * a a��o realizada � simplesmente imprimir um valor passado dentro do metodo
		 */
		System.out.println("impress�o");
	}

	/* metodo abaixo soma apresenta o resultado da soma indicada */
	public void somar() {
		System.out.println(2 + 2);
	}

	/* este metodo pergunta o nome e depois imprime-o na tela */
	public void YourNameIs() {
		/*
		 * obs: ShowImputDialog tambem � um metodo com retorno que estudaremos mais a
		 * frente
		 */
		String teste = JOptionPane.showInputDialog("Qual � seu nome?");
		/*
		 * a linha abaixo tambem � um metodo sua fun��o � imprimir um valor especificado
		 * no promp
		 */
		System.out.println(teste);
	}

	public static void main(String[] args) {

		/* Testando... */

		/* Precisa-se instanciar um objeto */
		MetodoSimples ms = new MetodoSimples();
		/* atravez da variavel podemos chamar as a��es(metodos) */
		ms.Imprimi();
		ms.somar();
		ms.YourNameIs();
		/* rode a classe e veja o resultado */

	}
	/* Finish Class */
}
