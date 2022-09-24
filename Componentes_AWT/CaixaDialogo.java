package br.com.aed.Componentes_AWT;

import java.awt.Dialog;
import java.awt.Frame;

public class CaixaDialogo {

	public static void main(String[] args) {
		/*
		 * o dialog e uma caixa usada para criar alguma intera��o com o usuario, nesta
		 * classe vamos inicializar um simples dialog apenas para compreensao
		 */
		/* cria��o do dialog */
		/*
		 * precisaremos de um frame para que o dDialog possa ser apresentado ao usuario
		 */
		Frame frame = new Frame();
		/* existem outras op��es de parametros passados para objeto */
		Dialog dialogo = new Dialog(frame, "meu dialog", false);
		dialogo.setSize(600, 200);
		dialogo.setVisible(true);
		/*
		 * obs: caso queiramos que o dialog exiba algo, como um label ou um botao
		 * devemos cria-lo e adcionalos ao dialog para que seja
		 */

	}

}
