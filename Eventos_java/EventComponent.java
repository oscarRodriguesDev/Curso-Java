package br.com.aed.Eventos_java;

import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class EventComponent implements ComponentListener {
	/*
	 * este tratador trata eventos de componentes, mas especificamente para aquele
	 * que podem ser redimensionados, minimizados e fechados a qualquer mmento do
	 * programa, aplicamos este tratador em uma janelaveja os resultados
	 */

	/* Eventos quando a janela est� invisivel */
	@Override
	public void componentHidden(ComponentEvent e) {
		System.out.println("componentHidden(ComponentEvent e) em execu��o!");
		System.out.println("janela esta invisivel");
		System.exit(0);
	}

	/* Quando o componente � movido */
	@Override
	public void componentMoved(ComponentEvent e) {
		System.out.println("componentMoved(ComponentEvent e) em execu��o");
		System.out.println(e.getComponent().getLocationOnScreen());

	}

	/* quando o componente � redimensiondo */
	@Override
	public void componentResized(ComponentEvent e) {
		System.out.println("componentResized(ComponentEvent e) em  execu��o");
		Component frame = e.getComponent();
		int x = frame.getWidth();
		int y = frame.getHeight();
		if (x > 500) {
			frame.setSize(500, 500);
		}
		if (y > 500) {
			frame.setSize(500, 500);

		}

	}

	/* componente visivel */
	@Override
	public void componentShown(ComponentEvent e) {
		System.out.println("componentShown(ComponentEvent e) em execu��o");
		Component frame = e.getComponent();
		System.out.println("componente " + frame.getName() + " esta visivel");
	}

}
