package br.com.aed.Componentes_AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;//importa��o nesse�aria para usar o componente frame
import java.awt.Label;
import java.awt.Panel;

/*Esta classe exemplifica o componente Label AWT*/
public class Labels {

	/* metodo main */
	public static void main(String[] args) {

		Frame f = new Frame("primeira janela");
		f.setSize(500, 500);
		f.setVisible(true);
		Panel panel = new Panel();
		panel.setBackground(Color.ORANGE);
		f.add(panel);
		Button botao = new Button("botao teste");
		botao.setBackground(Color.BLUE);
		botao.setForeground(Color.WHITE);
		panel.add(botao);
		/*
		 * O label � um texto que � apresentado ao usuario e que nao � editavel pelo
		 * usuarionesta classe vamos criar um label para exemplificarmos seu uso
		 */
		/*
		 * instancia de Label informamos dentro do label o texto que queremos exibir
		 */
		Label label = new Label("meu primeiro label");
		/*
		 * como ja apprendemos antes o componente ao qual adcionamos o label vai ser o
		 * contair=ner panel
		 */
		panel.add(label);
		/* label tambel possui metodos mas vamos exemplificar apenas um */
		label.setForeground(Color.CYAN);

	}

}
