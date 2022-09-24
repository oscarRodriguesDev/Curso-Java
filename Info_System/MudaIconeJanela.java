package br.com.aed.Info_System;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MudaIconeJanela extends JFrame {
	/**
	 * classe se destina a demonstrar como se muda o icone padrao da janela java por
	 * um icone personalizado
	 */
	public MudaIconeJanela() {
		super("janela");
		this.setSize(500, 500);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * apenas precisamos informar a magem que queremos usar como icone, isso permite
		 * uma personaliza��o maior de seus trabalhos java
		 */
		this.setIconImage(new ImageIcon("images/marte1.jpg").getImage());
		/* pronto */
	}

	public static void main(String[] args) {
		new MudaIconeJanela();
	}

}
