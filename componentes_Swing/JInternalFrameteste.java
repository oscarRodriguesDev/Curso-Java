package br.com.aed.componentes_Swing;

import java.awt.Color;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JInternalFrameteste {
	/**
	 * Esta classe se destina a demonstrar o uso de mais alguns componentes de alto
	 * nivel da biblioteca swing
	 * 
	 * @throws PropertyVetoException
	 */

	public static void main(String[] args) throws PropertyVetoException {

		/*
		 * aqui vai ficar nossa janela comum que vai treceber varias outras janelas
		 * dentro dela
		 */

		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * vamos construir um container, este container � especifico para armazenamento
		 * de janelas tipo JInternalFrame,se chama JDeskTopPane
		 */
		JDesktopPane container = new JDesktopPane();
		/*
		 * vamos cria trez J InternalFrame como o propio nome sugere sao frames que
		 * frames que ficam dentro de frames
		 */
		JInternalFrame janela1 = new JInternalFrame();
		janela1.setSize(200, 200);
		janela1.setBackground(Color.RED);
		janela1.setVisible(true);
		/*
		 * nossa janela vermelha, vai poder ser fechada, chamando o metodo abaixo
		 */
		janela1.setClosable(true);
		/* metodo abaixo inicia a janela ja fechada */
		// janela1.setClosed(true);
		/* metdo abaixo permite a janela ser minimizada */
		janela1.setIconifiable(true);
		/* metodo abaixo permite que a janela seja maximizada */
		janela1.setMaximizable(true);
		/* o metodo abaixo cria uma imagem de icone para a janela */
		janela1.setFrameIcon(new ImageIcon("images/abrir.png"));
		container.add(janela1);
		/**
		 * vamos agora criar uma segunda janela com algumas modifica��es na cor Verde
		 */

		JInternalFrame janela2 = new JInternalFrame();
		janela2.setSize(200, 200);
		janela2.setBackground(Color.GREEN);
		janela2.setVisible(true);

		/*
		 * aqui ja vamos diferenciar a cria��o vamos cria-la numa posi��o inicial
		 * diferente atraves do metodo abaixo
		 */
		janela2.setLocation(200, 0);
		/*
		 * perceba que a nova janela esta toda padrao apenas definimos sua posi��o
		 * inicial
		 */
		container.add(janela2);
		/**
		 * vamos agora criar uma terceira janela ela vai ter algumas caracteristicas
		 * particulares
		 */
		JInternalFrame janela3 = new JInternalFrame();
		janela3.setSize(200, 200);
		janela3.setBackground(Color.BLUE);
		/* primeiro vamos colcar a nossa janela no centro */
		janela3.setLocation(300, 200);
		/*
		 * agora o mais interessante vamos tirar os movimentos de nossa janela e torna
		 * uma janela fixa com bordas finas
		 */
		/* defini��o da bordas */
		((javax.swing.plaf.basic.BasicInternalFrameUI) janela3.getUI()).setNorthPane(null);
		janela3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

		janela3.setVisible(true);
		container.add(janela3);
		/* por fim vamos adcionar nosso container a nosso frame */
		frame.add(container);
		frame.setVisible(true);

	}

}
