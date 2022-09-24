package br.com.aed.componentes_Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JanelaSwing extends JFrame {

	/*
	 * Os componentes swing sao praticamentes os mesmos dos awt antecedidos pela
	 * letra J antes do seu nome, neste pakage vamos entender os que diferem entre
	 * as bibliotecas
	 */

	public JanelaSwing() {

		/* o labvel agora � JLabel */
		JLabel label = new JLabel("este botao nao tem a��o:");
		/* o Button agora � JButton */
		JButton botao = new JButton("Click");
		/* a��o do botao */
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicado");

			}
		});
		/* fim do tratamento do botao */
		getContentPane().add(label, BorderLayout.NORTH);
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setVisible(true);
		setTitle("minha Janela");

	}

	public static void main(String[] args) {

		new JanelaSwing();// construtor da janela

	}

}
