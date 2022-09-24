package br.com.aed.Eventos_java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TrataTeclado implements KeyListener {

	/* Quando uma tecla � pressionada */
	@Override
	public void keyPressed(KeyEvent e) {

		int codigo = e.getKeyCode();
		if (codigo == KeyEvent.VK_SPACE) {
			System.out.println("pressionou espa�o     ");
		} else {
			System.out.println("pressionou tecla " + e.getKeyCode());
		}

	}

	/* quando uma tecla e solta */
	@Override
	public void keyReleased(KeyEvent e) {
		int codigo = e.getKeyCode();
		if (codigo == KeyEvent.VK_SPACE) {
			System.out.println("soltou espa�o     ");
		} else {
			System.out.println("soltou tecla " + e.getKeyCode());
		} // TODO Auto-generated method stub

	}

	/* Quando � digitado um caractere */
	@Override
	public void keyTyped(KeyEvent e) {

		char codigo = e.getKeyChar();
		/* imprime o caractere digitado */
		System.out.println("digitou " + codigo);

	}

}
