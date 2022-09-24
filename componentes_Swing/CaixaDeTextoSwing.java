package br.com.aed.componentes_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CaixaDeTextoSwing {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 100);
		Container c = frame.getContentPane();
		frame.setLayout(new GridLayout());
		frame.setBackground(new Color(228, 228, 228));
		/* vamos instanciar uma JTextField que vai receber um texto comum */
		JTextField user = new JTextField("user");
		/*
		 * Diferente do awt para criarmos uma caixa de texto prara senhas temos que
		 * instanciar outro tipo de caixa de texto o JPasswordField
		 */
		JPasswordField senha = new JPasswordField("senha");
		/* adcionando direto ao frame */
		c.add(user);
		c.add(senha);
		/*
		 * esta linha encerrao programa quando clicarmos no X no cxabecalho do frame
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
