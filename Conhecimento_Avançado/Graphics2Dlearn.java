package br.com.aed.Conhecimento_Avan�ado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

@SuppressWarnings("serial")
public class Graphics2Dlearn extends JFrame {

	/**
	 * 
	 * @author Oscar Rodrigues
	 * 
	 * @version 1.0.0<br>
	 *          <br>
	 *          Fun��o principal da classe � chamar a janela contendo todos os
	 *          outros componentes visuais do sistema
	 * 
	 *          <br>
	 *          <p>
	 *          Atributos relevantes da classe:<br>
	 *          <b>texto</b> <i>texto que informa procedimento sendo
	 *          executado</i><br>
	 *          <b>valor</b><i>valor que � setado gradualmente na barra para que ela
	 *          seja carregada</i>
	 * 
	 * 
	 * 
	 */

	//
	String textoInicial = "Loading...";

	//

	//

	//

	//
	JProgressBar barra;
	//
	int valor;
	//
	// Container container;

	//

	public void paint(Graphics g) {
		/* desenhado uma linha */
		g.setColor(Color.BLACK);
		g.drawLine(2, 50, 500, 50);
		/* desenhando Letras */
		g.setColor(Color.GREEN);
		g.drawString("Meu Primeiro Canvas", 10, 65);
		/*
		 * desenhanod um retangulo preechido primeiro valor coordenada x segundo valor
		 * coordenada y terceiro valor largura x quarto valor altura y
		 */
		g.setColor(Color.RED);
		g.fillRect(100, 100, 30, 30);
		/* desenhando formas ovais */
		g.setColor(Color.PINK);
		g.drawOval(250, 150, 30, 50);
		/* oval preenchido */
		g.setColor(Color.YELLOW);
		g.fillOval(200, 150, 30, 50);
		/*
		 * desenhando Strings* Aqui pintamos a String com as coordenadas x e y na
		 * posi��o x e y correspondente
		 */

		g.setColor(Color.BLUE);

	}

	/**
	 * O construtor instancia a barra de progresso e a inicializa, nao possui
	 * parametros<br>
	 * � filho da classe JFrame e nao � serializado
	 */
	public Graphics2Dlearn() {

		super("Genesis");

		setSize(448, 315);
		setBackground(new Color(64, 74, 0));
		setLocationRelativeTo(null);
		setResizable(false);

		//

		//

		//
		barra = new JProgressBar();
		barra.setFont(new Font("Palatino Linotype", Font.ITALIC, 13));
		barra.setToolTipText("Carregar...");
		barra.setForeground(Color.GREEN);
		barra.setBackground(Color.WHITE);

		//
		getContentPane().add(barra, BorderLayout.SOUTH);

		//
		setVisible(true);

		textoInicial = "TEste";

		// dispose();
	}

	public static void main(String[] args) {
		new Graphics2Dlearn();
	}
}
