package br.com.aed.Eventos_java;

import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TrataMouse implements MouseListener {
	Component c;

	/*
	 * Esta classe se destina a tratar eventos de click do mouse,
	 */
	@Override
	/*
	 * Quando o mouse � clicado
	 */
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse foi clicado");
		/* da pra saber qual botao do mouse foi clicado */
		int botao = e.getButton();

		/* as constantes determinam qual botao do mopuse foi clicado */
		if (botao == MouseEvent.BUTTON1) {
			System.out.println("botao esquerdo pressionado");
		}
		if (botao == MouseEvent.BUTTON2) {
			System.out.println("botao rolower pressionado");
		}
		if (botao == MouseEvent.BUTTON3) {
			System.out.println("botao direto pressionado");
		}
		/*
		 * assim como nos outros eventos podemos recu�perar algumas inf importantes
		 * sobre o mouse e sobre o componente ao qual foi add o evento
		 */
		/* retorna o componente do evento */
		System.out.println(e.getComponent());
		/** vamos fazer um teste vamos mudar a cor do do componente */
		c = e.getComponent();
		int botao1 = e.getButton();
		if (botao1 == 1) {
			c.setForeground(Color.GREEN);
		}
		if (botao1 == 2) {
			c.setForeground(Color.RED);

		}
		if (botao1 == 3) {

			c.setForeground(Color.BLACK);
		}

	}

	/* quando o cursor do mouse entra no componente */
	@Override
	public void mouseEntered(MouseEvent e) {
		c = e.getComponent();
		System.out.println("mouse entrou no componente");

		c.setBackground(Color.BLUE);
		c.setForeground(Color.WHITE);
	}

	/* quando o mouse sai do componente */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		/*
		 * aqui vamos retornar ao estado que o componente estava antes do cursor do
		 * mouse ter entraedo no componente
		 */
		c = e.getComponent();
		System.out.println("mouse saiu do componente");

		c.setBackground(Color.WHITE);
		c.setForeground(Color.BLACK);

	}

	/* mouse pressionado */
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		/* recuperamos o componente e definimos o seu tipo */
		Label c = (Label) e.getComponent();
		/* modificamos o texto que � apresentado na tela */
		c.setText("Clicou!!!");

	}

	/* botao do mouse solto */
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

		/* recuperamos o componente e definimos o seu tipo */
		Label c = (Label) e.getComponent();
		/* modificamos o texto que � apresentado na tela */
		c.setText("click_me");

	}

}
