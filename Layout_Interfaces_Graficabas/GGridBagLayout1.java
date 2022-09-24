package br.com.aed.Layout_Interfaces_Graficabas;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class GGridBagLayout1 extends JFrame {

	public GGridBagLayout1() {
		super("Exemplo2");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.getContentPane().setLayout(new GridBagLayout());

		add("C�digo", new JTextField(), "Nascimento", new JTextField());
		add("Nome", new JTextField());
		add("Nome Pai", new JTextField());
		add("Nome M�e", new JTextField());
		add("RG", new JTextField(), "CPF", new JTextField());
		add("Endere�os", new JScrollPane(new JTable()));

		this.setSize(600, 600);
	}

	/**
	 * Adiciona um label e um componente horizontalmente
	 * 
	 * @param label      String que ir� aparecer no label
	 * @param componente Componente de edi��o
	 */
	public void add(String label, JComponent componente) {
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.NORTHWEST;
		cons.insets = new Insets(4, 4, 4, 4);

		cons.weightx = 0;
		cons.gridwidth = 1;
		this.getContentPane().add(new JLabel(label), cons);

		cons.fill = GridBagConstraints.BOTH;
		cons.weightx = 1;
		cons.gridwidth = GridBagConstraints.REMAINDER;
		this.getContentPane().add(componente, cons);
	}

	/**
	 * Adiciona um label e um componente horizontalmente. O componente ocupar� todo
	 * o reto da tela
	 * 
	 * @param label      String que ir� aparecer no label
	 * @param componente Componente de edi��o
	 */
	public void add(String label, JScrollPane componente) {
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.NORTHWEST;
		cons.insets = new Insets(4, 4, 4, 4);
		cons.weighty = 1;
		cons.gridheight = GridBagConstraints.REMAINDER;

		cons.weightx = 0;
		cons.gridwidth = 1;
		this.getContentPane().add(new JLabel(label), cons);

		cons.fill = GridBagConstraints.BOTH;
		cons.weightx = 1;
		cons.gridwidth = GridBagConstraints.REMAINDER;
		this.getContentPane().add(componente, cons);
	}

	/**
	 * Adiciona um label, um componente de edi��o, mais um label e outro componente
	 * de edi��o. Todos na mesma linha
	 * 
	 * @param label       Label 1
	 * @param componente  Componente de edi��o
	 * @param label2      Label 2
	 * @param componente2 Componente de edi��o 2
	 */
	public void add(String label, JComponent componente, String label2, JComponent componente2) {
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.BOTH;
		cons.insets = new Insets(4, 4, 4, 4);

		cons.fill = GridBagConstraints.NONE;
		cons.anchor = GridBagConstraints.NORTHWEST;
		cons.weightx = 0;
		cons.gridwidth = 1;
		this.getContentPane().add(new JLabel(label), cons);

		cons.weightx = 1;
		cons.gridwidth = 1;
		cons.fill = GridBagConstraints.BOTH;
		this.getContentPane().add(componente, cons);

		cons.fill = GridBagConstraints.NONE;
		cons.weightx = 0;
		cons.gridwidth = 1;
		this.getContentPane().add(new JLabel(label2), cons);

		cons.weightx = 1;
		cons.fill = GridBagConstraints.BOTH;
		cons.gridwidth = GridBagConstraints.REMAINDER;
		this.getContentPane().add(componente2, cons);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GGridBagLayout1();

	}
}
