package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JOptionPane;

public class MyCardLayout {
	/*
	 * o card layout oferece uma op��o de navega��o entre diversos componentes que
	 * estao dentro do Frame
	 */
	public static void main(String[] args) {
		Frame f = new Frame();
		/* instancia do CardLayout */
		CardLayout card = new CardLayout();
		/* agora criaremos 3 panels e vamos definir um BAckgroud para cada um */
		Panel P1 = new Panel();
		P1.setBackground(Color.BLUE);

		Panel P2 = new Panel();
		P2.setBackground(Color.RED);

		Panel P3 = new Panel();
		P3.setBackground(Color.BLACK);
		/* nao podemos esquecer de definir o layout do frame */
		f.setLayout(card);
		/*
		 * agora vamos adcionar os panels � janela e nomear cada panel com um nome da
		 * sua escolha
		 */
		f.add(P1, "azul");
		f.add(P2, "red");
		f.add(P3, "Black");

		f.setSize(500, 300);
		f.setVisible(true);

		/*
		 * agora par apresentarmos os panels vamos criar um while para que sempre nosso
		 * programa fique requisitando uma mudanca de Panel
		 */
		while (true) {
			String M = JOptionPane.showInputDialog(null, "para mudar a cor digite um numero");
			int m = Integer.parseInt(M);

			switch (m) {
			case 1:
				/*
				 * o metodo show apresenta o panel que queremos apresentar na tela recebre como
				 * parametro o container, e o nome dado para o componente que queremos
				 * apresentar
				 */
				card.show(f, "azul");
				break;
			case 2:
				card.show(f, "red");
				break;
			case 3:
				card.show(f, "Black");
				break;
			case 4:
				/*
				 * o metodo previos(Frame f) apresenta uma previa do panel a ser escolhido
				 */
				card.previous(f);
				break;
			case 5:
				/*
				 * o metodo next(Frame f) apresenta o proximo panel na seequencia a ser
				 * apresentado
				 */
				card.next(f);
				break;
			default:

				System.out.println("Digite 1,2,3 :para mudar de cor");
				break;
			}
		}

	}
}
