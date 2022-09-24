package br.com.aed.Componentes_AWT;

import java.awt.Color;
import java.awt.Frame;//importa��o nesse�aria para usar o componente frame
import java.awt.Panel;

/*Esta classe exemplifica o componente Panel AWT*/
public class Panels {

	/* metodo main */
	public static void main(String[] args) {

		Frame f = new Frame("primeira janela");
		f.setSize(500, 500);
		f.setVisible(true);

		/*
		 * O panel � um container usado no frame onde �podemos adcionar outros
		 * componentes
		 */
		/* Instancia do Panel */
		Panel panel = new Panel();
		/*
		 * um Panel tem diversos metodos mas vamos ultilizar apenas um somente para
		 * exemplifica��o, vamos coloritr nosso panel de cor laranja para isso vamos
		 * usar o metodo setBackgroud
		 */
		panel.setBackground(Color.ORANGE);
		/*
		 * para que isso seja visto em nosso frame precisamos adcionar o novo componente
		 * a nosso Frame
		 */
		f.add(panel);
		/* execute e confira o resultado */

	}

}
