package br.com.aed.Componentes_AWT;

import java.awt.Dialog;
import java.awt.Frame;//importa��o nesse�aria para usar o componente frame
import java.awt.Label;

/*Esta classe exemplifica o componente Frame AWT*/
public class Frames {
	/* metodo main */
	public static void main(String[] args) {
		/*
		 * Instanciamos um objeto Frame A String usada como parametro ser� exibida como
		 * titulo do frame
		 */
		Frame f = new Frame("primeira janela");
		/*
		 * de sua variaaveis podemos definir atributos, como tamanho da janela como
		 * parametro dois inteiros com o tamanho da janela
		 */
		f.setSize(500, 500);
		/*
		 * visibilidade da janela, parametro booleano informando a visibilidade da
		 * janela
		 */
		f.setVisible(true);

		/*
		 * esta � uma janela simples sem finalidade alguma apenas para demonstra ��o da
		 * cria��o de janelas
		 */

		Dialog d = new Dialog(f);
		d.setSize(500, 200);
		d.setVisible(true);
		d.add(new Label("teste"));

	}

}
