package br.com.aed.Logica;

import javax.swing.JOptionPane;

public class JOptionPaneIntrodu��o
{

	/** classe demonstrando o uso da JOPtionPane */
	public static void main(String[] args) {

		/*
		 * outra classe que tambempode ser usada para recuperar dados do usuario �
		 * JOptionPane falaremos mais detalhadamente sobre ela quando formos estudar
		 * interfacews graficas com swing
		 */
		JOptionPane.showInputDialog("Escreva seu nome");
		/*
		 * oque voce ainda na sabia � que este metodo statico da classe JOptionPane
		 * retorna uma String
		 */
		String nome = JOptionPane.showInputDialog("Escreva seu nome");
		/*
		 * uma coisa importante e que podemos na interface criada usar o enter do
		 * teclado para acessao o botao de confirma��o
		 */
		System.out.println(nome);

		/* recolhendo um inteiro atraves de uma JOptionOPane */
		String idade = JOptionPane.showInputDialog("Qual sua idade? ");
		System.out.println(idade);
		/*
		 * correto mas eu quero saber em que ano a pessoa nasceu, posso fazerisso
		 * subtraindo do ano corrente a idade informada, mas esta opera��o nao pode ser
		 * realizada por Strings veja
		 */
		int ano = 2015;
		/* isso gera um erro no qual nossa classe nao vai nem mesmo compilar */

		// ano-idade;

		/* uma das ssolu��es possiveis � converter o valor String em inteiro */

		int idadeI = new Integer(idade);
		/* agora sim podemos fazer a opera��o e apresentar o resultado */

		int anoNascimento = ano - idadeI;

		/*
		 * agora apresentando uma nova interface grafica tambem da classe JOptionPane,
		 * vamos apresentar o resultado para o usuario
		 */
		String msg = "o cliente se chama: " + nome + " \n sua idade �: " + idade + "\n nascido entre:  "
				+ (anoNascimento - 1) + " e " + anoNascimento;
		JOptionPane.showMessageDialog(null, msg);

	}

}
