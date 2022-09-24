package br.com.aed.Componentes_AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;//importa��o nesse�aria para usar o componente frame
import java.awt.Panel;

/*Esta classe exemplifica o componente Button AWT*/
public class Buttons {

	/* metodo main */
	public static void main(String[] args) {

		Frame f = new Frame("primeira janela");
		f.setSize(500, 500);
		f.setVisible(true);
		Panel panel = new Panel();
		panel.setBackground(Color.ORANGE);
		f.add(panel);
		/*
		 * um Button � um comntrole que pode ser adcionado diretamente ao frame ou em
		 * seu container um Panel vamos criar um nesta clase
		 */
		/* podemos passar uma String como parametro sera o nome do botao */
		Button botao = new Button("botao teste");
		/*
		 * os botoes possuem varios metodo mas vamos ultilizar dois apenas para
		 * exemplifica��o
		 */
		botao.setBackground(Color.BLUE);
		botao.setForeground(Color.WHITE);
		/* lembre-se voce precisa adcionar o botao a seu frame vamo faze-lo */
		// f.add(botao);// opa cade o nosso panel???
		/*
		 * agora que adcionamos o nosso Panel ao frame � ele quem vai adcionar o nosso
		 * botao caso contrario o panel sera "ofuscado pelo botao"
		 */
		panel.add(botao);
		/* agora podemos ver nosso panel e nosso Botao dentro do frame */
		/*
		 * nesta linha abaixo eu adciona como 'fechador de janela', a classe
		 * IntroductingEvent
		 */
		f.addWindowListener(new IntroductingEvents());

	}

}
