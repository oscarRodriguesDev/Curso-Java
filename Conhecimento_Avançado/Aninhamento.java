package br.com.aed.Conhecimento_Avançado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Aninhamento extends JFrame {
	/**
	 * Classes e interfaces, podem ser declaradas dentro de outras classes, sao
	 * chamadas classes aninhadas, classes aninhadas tem acesso aos elementos
	 * pertencentes �s classes com as quais ela se relaciona
	 */
	JButton Botao;

	/* construimos uma janela comum */
	public Aninhamento() {
		/* definimos a estrutura da janela */
		super("aninhamento");
		/* inicializamos a janela */
		Botao = new JButton("teste");
		Botao.setForeground(Color.BLUE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		/*
		 * adcionamos o listener de eventos do botao e informamaos a classe aninhada que
		 * vai trabalhar com ele
		 */
		Botao.addActionListener(new Aninhamentoteste());
		/**
		 * aqui criamos uma classe anonima para tratar os eventos do botao, nessa forma
		 * ao invez de criarmos uma classe chamamos instanciamos a interface como se
		 * fosse uma classe, e assim temos que implementar automaticamente os metodos da
		 * interface
		 */
		Botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Botao.setText("ok");
				String A = e.getActionCommand();
				if (A == "ok") {
					Botao.setText("teste");

				}

			}

		});
		/* adicionamos o baotao ao frame */
		getContentPane().add(Botao);
	}

	/**
	 * Aqui criamos uma classe dentro da classe, chamada classe aninhada, podemos
	 * usar o modificador que desejarmos , ela tem acesso ao botao
	 */
	public class Aninhamentoteste implements ActionListener {

		/* metodo implementado automaticamente */
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe Aninhamento teste executa " + Botao.getText());

		}

	}

	public static void main(String[] args) {
		new Aninhamento();

	}

}
