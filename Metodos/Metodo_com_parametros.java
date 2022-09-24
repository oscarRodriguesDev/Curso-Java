package br.com.aed.Metodos;

import javax.swing.JOptionPane;

/*Esta Classe destina-se a explicar o que sao os metodos*/
public class Metodo_com_parametros {
	/*
	 * metodos sao a��es que sao atribuidas a objetos que podem ser chamados pelas
	 * variaveis dasi instancias das classes
	 */
	/*
	 * o metodo abaixo imprime o parametro fornecido ao metodo
	 */
	public void Imprimi(int idade) {
		/*
		 * a a��o realizada imprime a informa��o juntamete com o parametro passado
		 */
		System.out.println("oscar tem " + idade + " anos");
	}

	/* metodo abaixo soma apresenta o resultado da soma indicada pelo parametro */
	public void somar(int x, int y) {
		System.out.println(x + y);
	}

	/* este metodo pergunta o nome e depois imprime-o na tela */
	public void YourNameIs(String nome) {
		/*
		 * obs: ShowImputDialog tambem � um metodo com retorno que estudaremos mais a
		 * frente
		 */
		String teste = JOptionPane.showInputDialog("Qual � o nome da sua esposa?");
		/*
		 * a linha abaixo tambem � um metodo sua fun��o � imprimir um valor especificado
		 * no promp
		 */
		System.out.println(nome + " � casado com: " + teste);
	}

	public static void main(String[] args) {

		/* Testando... */

		/* Precisa-se instanciar um objheto */
		Metodo_com_parametros ms = new Metodo_com_parametros();
		/* atravez da variavel podemos chamar as a��es(metodos) */
		ms.Imprimi(24);
		ms.somar(5, 3);
		ms.YourNameIs("Oscar");
		/* rode a classe e veja o resultado */

	}
	/* Finish Class */
}
