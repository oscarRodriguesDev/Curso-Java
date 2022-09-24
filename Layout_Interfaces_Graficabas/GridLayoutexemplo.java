package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class GridLayoutexemplo {

	public static void main(String[] args) {
		/*
		 * o gerencidor de layout GridLayout dispoe os dados no componente de forma
		 * tabelar
		 */
		Frame frame = new Frame("GridLayout");
		frame.setVisible(true);
		frame.setSize(200, 200);
		/* Grid Layout sem espa�amento, duas linhas e duas colunas */
		Panel panel = new Panel();
		panel.setLayout(new GridLayout(2, 2));
		/* Grid Layout com espa�amento */
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(2, 2, 20, 20));
		/* botoes adcionados sem espa�amento */
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		panel.add(B1);
		panel.add(B2);
		panel.add(B3);
		panel.add(B4);
		/* botoes adcionados com espa�amento */
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		panel1.add(B5);
		panel1.add(B6);
		panel1.add(B7);
		panel1.add(B8);
		/* posi�oes do panel dentro */
		frame.add(panel, BorderLayout.CENTER);
		frame.add(panel1, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);

	}

}
