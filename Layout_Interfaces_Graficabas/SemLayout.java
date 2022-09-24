package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.*;

public class SemLayout {
	/*
	 * nesta classe vamos entender como adcionar elementos � tela sem um layout pr�
	 * definido
	 */

	public SemLayout() {

		Frame f = new Frame();
		/*
		 * Para adcionar componentes dentro do Frame sem um layout pr� definido devemos
		 * defini-lo como null
		 */

		f.setLayout(null);
		/* vamos adcionar trez botoes nessa tela */
		Button A = new Button("um");
		Button B = new Button("dois");
		Button C = new Button("trez");
		/*
		 * atraves do metodo set bounds podemos definir respectivamente posi��es X e Y
		 * do elemento, largura e altura do elemento Elemento.setBounds(posi��o x,
		 * posi��o y,largura x, altura y);
		 */
		A.setBounds(3, 23, 60, 30);
		B.setBounds(63, 53, 60, 30);
		C.setBounds(123, 83, 60, 30);
		f.add(A);
		f.add(B);
		f.add(C);
		f.setSize(250, 300);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new SemLayout();
	}

}
