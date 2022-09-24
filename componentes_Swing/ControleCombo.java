package br.com.aed.componentes_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleCombo extends JFrame implements ItemListener {
	/*
	 * nesta Classe vamos estudar o componente JCOmboBox
	 */
	/* abaixo como se inicializa uym JComboBox */
	JComboBox<String> combo;
	/* JLabels que vao receber as imagens */
	JLabel label;
	JLabel label1;
	JLabel label2;
	/* container */
	Container C;
	/* array de imagens */
	ImageIcon[] album = { new ImageIcon("images/amigos.jpg"), new ImageIcon("images/marte1.jpg"),
			new ImageIcon("images/mae.jpg") };

	/* construtor */
	public ControleCombo() {
		super("Visualizador de imagens");
		Container C = getContentPane();
		/* o parametro especificado entre<> pode ser qualquer tipo */
		combo = new JComboBox<String>();
		/* pode-se definir a fonte dentro do JComboBox */
		combo.setFont(new Font("Serif", Font.PLAIN, 26));
		/* agora podemos adcionar ao JCOmboBox as Strings desejadas */
		combo.addItem("amizade");
		combo.addItem("universo");
		combo.addItem("Familia");

		/* adcionando otratador de eventos ao JComboBox */
		combo.addItemListener(this);
		/*
		 * aqui � definido a primeira immagem que ser� apresentada na tela, e sua
		 * posi��o
		 */
		label = new JLabel(album[0]);
		C.add(BorderLayout.CENTER, label);
		C.add(BorderLayout.NORTH, combo);
		/* defini�oes para fechamento da janela */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* tamnhos e visibilidade da janela */
		setSize(600, 600);
		setVisible(true);

	}

	@Override
	/* tratador de eventos para o JComboBox */
	public void itemStateChanged(ItemEvent e) {
		/*
		 * aqui � recuperado o item selecionado e de acordo com o index � apresentado a
		 * imagem correspondente dentro do combo
		 */
		if (e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(album[combo.getSelectedIndex()]);
		}

	}

	/* mnetodo main */
	public static void main(String[] args) {
		new ControleCombo();

	}

}
