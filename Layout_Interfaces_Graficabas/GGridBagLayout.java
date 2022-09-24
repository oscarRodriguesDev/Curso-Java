package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class GGridBagLayout extends JFrame {
	public GGridBagLayout() {
		super("Exemplo1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = this.getContentPane();

		GridBagConstraints cons = new GridBagConstraints();
		GridBagLayout layout = new GridBagLayout();
		c.setLayout(layout);
		/**
		 * ipadx, ipady adciona a largura e a altura do componente o valor informado,
		 * obs: os atributos serao colocados em bloco de comentariospara testes retire
		 * as vbarras de comentario
		 */
		// cons.ipadx = 50;
		// cons.ipady = 200;

		/**
		 * analizando o insets(x,x,x,x), adciciona 10 pixeis para cada lado doc
		 * componente cima, baixo , direitra esquerda
		 */
		// cons.insets = new Insets(10, 10, 10, 10);

		/**
		 * altera o tamnhao das celulas, mantenho esta linha para continuar com testes
		 */
		cons.weightx = 1;
		cons.weighty = 1;

		/** adciona os componetes no local especificado pela constante */

		// cons.anchor = GridBagConstraints.SOUTHEAST;

		/** os componenetes se comportam como se estivessem em um Borderlayout */
		// cons.fill = GridBagConstraints.BOTH;

		// cons.weightx = 0.75;
		// c.add(new JButton("Esquerda"), cons);
		// cons.weightx = 0.25;

		// c.add(new JButton("Direita"), cons);

		/**
		 * o gridy e o gridx determina a posi��o do componente na tela
		 */

		// cons.gridy = 0;
		// cons.gridx = 0;

		// c.add(new JButton("Esquerda"), cons);
		// cons.gridx = 2;
		// c.add(new JButton("Direita"), cons);

		// cons.gridx = 0;
		// cons.gridy = 1;
		// c.add(new JButton("Esquerda"), cons);

		// cons.gridx = 1;
		// c.add(new JButton("Meio"), cons);

		// cons.gridx = 2;
		// c.add(new JButton("Direita"), cons);
		cons.fill = GridBagConstraints.BOTH;
		cons.gridy = 0;
		cons.gridx = 0;
		cons.gridwidth = 1;
		c.add(new JButton("Esquerda"), cons);
		cons.gridwidth = 2;
		cons.gridx = 2;
		c.add(new JButton("Direita"), cons);

		cons.gridx = 0;
		cons.gridy = 1;
		c.add(new JButton("Esquerda"), cons);

		cons.gridx = 1;
		c.add(new JButton("Meio"), cons);

		cons.gridx = 2;
		c.add(new JButton("Direita"), cons);

		this.setSize(600, 600);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GGridBagLayout();

	}
}
