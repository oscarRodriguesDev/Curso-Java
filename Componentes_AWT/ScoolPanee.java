package br.com.aed.Componentes_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScoolPanee {
	/*
	 * esta classe Exemplifica o uso de um Scrollpane que nada mais � um Panel com
	 * barras de rolagem
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setVisible(true);
		frame.setSize(100, 100);
		/* criamos um panel */
		Panel panel = new Panel();
		/* adcionamos alguns botoes a ele */
		panel.add(new Button("AAA"));
		panel.add(new Button("bbb"));
		panel.add(new Button("ccc"));
		/* instaciamos o ScrollPane */
		ScrollPane scroll = new ScrollPane();

		/* ele recebe o panel */
		scroll.add(panel);
		/* agora so adcionar o Scrollpane ao Frame */
		frame.add(scroll);

	}

}
