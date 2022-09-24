package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class IntroLayouts {
	/* classe trata sobre layouts dos componentes awt */
	public static void main(String[] args) {
		/*
		 * os componentes podem ser dispostos dentro de um container seguindo algumas
		 * orienta��es as quais chamamos Layouts nesta aula vamos dar uma pequena
		 * introdu��o sobre o tema para mais esclarecimentos estude o pacote LayoutAWT e
		 * SWING
		 */
		Frame frame = new Frame("Layout AWT");
		frame.setVisible(true);
		frame.setSize(500, 500);
		Panel panel = new Panel();
		/*
		 * aqui vamos definir o layout do panel vamos usar um FlowLayout o FlowLayout
		 * adciona os componente na ordem em que sao dcionados um logo apos o outro
		 * vamos adcionar 5 botoes usando este layout
		 */
		// pode ser assim:
		FlowLayout flw = new FlowLayout(FlowLayout.LEFT);
		panel.setLayout(flw);// ou poderia instancialo diretamente dentro do
								// metodo setLayout

		/* botoes que vamos adcionar ao panel */
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
		frame.add(panel);
		/*
		 * Existe um outro tipo de layout: o BorderLayout, todo componente awt ou swing
		 * ja vem por default configurado com esse layout, sabendo disso podemos
		 * instanciar um novo Panel em outra regiao da janela
		 */

		Panel pane = new Panel();
		pane.setBackground(Color.GREEN);
		/* aqui vamos alterar o local onde o nosso pane1 ser� apresentado na janela */
		frame.add(pane, BorderLayout.SOUTH);

		/*
		 * repare que nao instanciamos um BorderLayout, isso � possivel porque o border
		 * Layout j� e o layout default de qualquer componente awt ou swing que
		 * estudaremos posteriormnente
		 */
		pane.add(new Label("meu primeiro layout awt"));

	}

}
