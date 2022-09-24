package br.com.aed.Componentes_AWT;

import java.awt.*;

public class TodasAsFontes {
	/*
	 * esta classe retorna todas as fontes ultilizadas pela linguagem java atraves
	 * do getToolkit
	 */
	public static void main(String args[]) {
		Frame frame = new Frame("Meu Frame");
		frame.setSize(300, 300);
		@SuppressWarnings("deprecation")
		String fontes[] = frame.getToolkit().getFontList();
		int nroFont = fontes.length;
		frame.setLayout(new GridLayout(nroFont, 1));
		for (int i = 0; i < nroFont; i++) {
			Label label = new Label(fontes[i], Label.CENTER);
			label.setForeground(Color.blue);
			label.setBackground(Color.cyan);
			Font fonte = new Font(fontes[i], Font.PLAIN, 12);
			label.setFont(fonte);
			ScrollPane scroll = new ScrollPane();
			Panel panel = new Panel();
			panel.add(label);
			scroll.add(panel);
			frame.add(scroll);

		}
		frame.setVisible(true);

	}
}