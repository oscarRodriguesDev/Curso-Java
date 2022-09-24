package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class BorderLayoutExemplo {

	public BorderLayoutExemplo() {
		/*
		 * nesta classe vamo conhecer o BorderLayout, que como ja vimos � o layout
		 * default de todos os componentes graficos AET ou Swing em java
		 */
		/* inicializamos uma janela basica */
		Frame frame = new Frame("conhecendo os layouts");
		frame.setSize(600, 600);

		/*
		 * o BorderLayout divide a janela em 5, regioes: NORTH,SOUTH,LEFT,RIGHT e CENTER
		 * que sao constantes que determinam posi�oes dentro do componente que estamos
		 * adcionando elementos, nesta aula vamos inicializar 5 panels cada um de uma
		 * cor vamos colocar dentro de cada um um label indicando a regiao da tela em
		 * que o panel se encontra e comando ultilizado para definir sua localiza��o
		 * dentro da janela
		 */
		/* Primeiro panel na regiao NORTH */
		Panel panel = new Panel();
		panel.setBackground(Color.BLUE);
		panel.add(new Label("BorderLayout.NORTH"));
		/* segundo panel na regiao LEFT */
		Panel panel1 = new Panel();
		panel1.setBackground(Color.RED);
		panel1.add(new Label("BorderLayout.EAST"));
		/* terceiro panel na regiao CENTER */
		Panel panel2 = new Panel();
		panel2.setBackground(Color.GREEN);
		panel2.add(new Label("BorderLayout.CENTER"));
		/* quarto panel na regiao RIGHT */
		Panel panel3 = new Panel();
		panel3.setBackground(Color.YELLOW);
		panel3.add(new Label("BorderLayout.WEST"));
		/* quinto Panel na regiao SOUTH */
		Panel panel4 = new Panel();
		panel4.setBackground(Color.ORANGE);
		panel4.add(new Label("BorderLayout.SOUTH"));
		/*
		 * Agora basta adcionar os panels nos seus lugares correspondebntes e ver o
		 * resultado
		 */
		/* adciona o panel ao norte da janela */
		frame.add(panel, BorderLayout.NORTH);
		/* adciona o panel ao leste da janela */
		frame.add(panel1, BorderLayout.EAST);
		/* adciona o panel ao centro da janela */
		frame.add(panel2, BorderLayout.CENTER);
		/* adciona o panel ao oeste da janela */
		frame.add(panel3, BorderLayout.WEST);
		/* adciona o panel ao sul da janela */
		frame.add(panel4, BorderLayout.SOUTH);

		frame.setVisible(true);
		/* Rode a classe e veja o resultado */

	}

	public static void main(String[] args) {
		new BorderLayoutExemplo();
	}
}
