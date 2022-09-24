package br.com.aed.Componentes_AWT;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyCanvas extends Canvas {
	String coordenadas = " ";
	int x, y;

	public MyCanvas() {

		/*
		 * a classe canvas prov� uma area para que se possa desenhar sobre ela, como se
		 * fosse um quadro em branco onde podemos desenhar o que quisermos
		 */

		/* abaixo apenas tratamos o evento de mouse na tela */
		this.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				/*
				 * este tratador apenas recolhe a cordenada om=nde se encontra o ponteiro e
				 * retorna uma String contendo os valores de x e y
				 */
				x = e.getX();
				y = e.getY();
				coordenadas = "X = " + x + ", " + "Y= " + y;
				/*
				 * o metodo repaint vai repitar a tela toda vez que o ponteiro do mouse for
				 * movido
				 */
				repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

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
		g.drawString(coordenadas, x, y);

	}

	public static void main(String[] args) {
		MyCanvas canvas = new MyCanvas();
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
	}
}
