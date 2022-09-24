package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayout_ex {
	/**
	 * nesta ckllasse vamos estudar o layout BoxLayout, o BoxLayout adciona
	 * componentes em sequencia ordenada no mesmo eixo x ou y de acordo com a
	 * especifica��o feita pelo programador na hora da cria��o do codigo
	 */
	public static void main(String[] args) {

		JFrame f = new JFrame("BoxLayout");
		/* panel para botoes no eixo y */
		JPanel panely = new JPanel();
		/* Definindo o BoxLayout no eixo y */
		BoxLayout box = new BoxLayout(panely, BoxLayout.Y_AXIS);
		panely.setLayout(box);

		/* panel para botoes no eixo x */
		JPanel panelx = new JPanel();
		/* Definindo o BoxLayout no eixo y */
		BoxLayout box1 = new BoxLayout(panelx, BoxLayout.X_AXIS);
		panelx.setLayout(box1);

		/* botoes do eixo y */
		int contador = 1;
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));
		panely.add(new JButton("Eixo y" + contador++));

		/* botoes no eixo x */
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));
		panelx.add(new JButton("Eixo x" + contador++));

		f.add(panely, BorderLayout.EAST);
		f.add(panelx, BorderLayout.CENTER);

		f.setVisible(true);
		f.pack();

	}

}
