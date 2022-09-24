package br.com.aed.Eventos_java;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TrataJanela implements WindowListener {
	/*
	 * este tratador vai tratar as op��es de janela como fechar, redimensionar,
	 * maximizar etc...
	 */

	/* metodo quando a janela estiver ativa */
	@Override
	public void windowActivated(WindowEvent e) {
		/* retorna informa��oes importantes sobre a janela */
		System.out.println(e.getWindow());
		/* informa o novo estdado da janela */
		System.out.println(e.getNewState());

		System.out.println("janela ativa");

	}

	/* metodo quando a janela estiver fechada */
	@Override
	public void windowClosed(WindowEvent e) {

		System.out.println("fechada");

	}

	/* sendo fechada */
	@Override
	public void windowClosing(WindowEvent e) {
		this.windowClosed(e);
		e.getComponent().setVisible(false);
		/*
		 * aqui a janela apenas fica invisivel no tratador de componente o programa ser�
		 * encerrado
		 */
	}

	/* janela minimizada */
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("desativada");

	}

	/* janela reativada */
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("reativada");

	}

	/**/
	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("minimizada");

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("aberta");

	}

}
