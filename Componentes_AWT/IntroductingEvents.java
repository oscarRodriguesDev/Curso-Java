package br.com.aed.Componentes_AWT;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*esta classe pode fechar qualquer janela que eu
 *  deseje, para isso ela implementa a Interface WindowListener*/
public class IntroductingEvents implements WindowListener {
	/*
	 * objetivo dessa classe � apenas dar uma introdu��o a eventos POque sao Eventos
	 * na Linguagem java: um click de um botao, uma tecla pressionada, a
	 * movimenta��o do ponteiro do mouse sao exemplods de eventos que podem ocorrer
	 * em determinado programa criado em java ou em qualquer outra linguagem, para
	 * entender mnais especificamente sobre eventos v� para o pacote de eventos,
	 * nestsa classe como a finalidade e apenas introduzir o assunto vamos apenas
	 * resolver um evento que nossas telas precisam resolver
	 */
	public static void main(String[] args) {

	}

	@Override
	public void windowActivated(WindowEvent arg0) {

	}

	@Override
	public void windowClosed(WindowEvent arg0) {

	}

	/*
	 * para podermos fechar todas as janelas que abrirmos deveremos apenas tratar
	 * este metodo da interface WindowListener
	 */
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {

	}

	@Override
	public void windowIconified(WindowEvent arg0) {

	}

	@Override
	public void windowOpened(WindowEvent arg0) {

	}

	/* esta classe vai fechar apenas a classe Buttons */

}
