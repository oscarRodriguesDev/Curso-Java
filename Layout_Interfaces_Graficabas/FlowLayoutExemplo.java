package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class FlowLayoutExemplo {

	public static void main(String[] args) {

		Frame frame = new Frame("FlowLayout teste");
		frame.setVisible(true);
		frame.setSize(600, 600);
		/*
		 * como ja sabemos todos os componentes graficos sendo eles AWT ou swing sao
		 * configurados com o layout BorderLayout por default, entao precisamos
		 * redefinir o Laytout do componente
		 */
		/*** frame.setLayout(new FlowLayout()); */
		/*
		 * o flow layout posiciona os componenetes um ao lado do outro na ordem em que
		 * sao adcionados,um flowlayout pode receber como parametro um inteiro que
		 * representa o inicio do posicionamento estes valores pode ser
		 * CENTER,LEFT,RIGHT,
		 */
		/* adcionando ao centro */

		Panel panel = new Panel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		/*
		 * apenas para voce enteneder o funcionamento vamos criar 5 botoes e vamos
		 * adcionalos a este frame
		 */

		Button b1 = new Button("botao 1");
		Button b2 = new Button("botao 2");
		Button b3 = new Button("botao 3");
		Button b4 = new Button("botao 4");
		Button b5 = new Button("botao 5");

		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		frame.add(panel, BorderLayout.NORTH);
		/* muda o layout */

		Button b6 = new Button("botao 6");
		Button b7 = new Button("botao 7");
		Button b8 = new Button("botao 8");
		Button b9 = new Button("botao 9");
		Button b10 = new Button("botao 10");
		/* adcionando a direita */
		Panel panel1 = new Panel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER));

		panel1.add(b6);
		panel1.add(b7);
		panel1.add(b8);
		panel1.add(b9);
		panel1.add(b10);
		frame.add(panel1, BorderLayout.CENTER);

		/* adcionando a direita */

		Panel panel2 = new Panel();
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));

		Button b11 = new Button("botao 11");
		Button b12 = new Button("botao 12");
		Button b13 = new Button("botao 13");
		Button b14 = new Button("botao 14");
		Button b15 = new Button("botao 15");

		panel2.add(b11);
		panel2.add(b12);
		panel2.add(b13);
		panel2.add(b14);
		panel2.add(b15);

		frame.add(panel2, BorderLayout.SOUTH);

		/* rode a classe para testes */
	}

}
