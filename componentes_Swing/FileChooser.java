package br.com.aed.componentes_Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileChooser extends JFrame implements ActionListener {
	/*
	 * VAmos estudar o uso do JFileChooser, ele basicamente igual ao FileDialog a
	 * mas moldado �s caracteristicas da Biblioteca swing
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * para exemplificarmos o seu uso vamos criar um programinha que abre arquivos
	 * de texto para edi��o, mas para que nao fique extenso vamos apenas
	 * implemnentar a leitura e nao edi��o dos arquivos abertos
	 */
	/* precisamos de u TextArea onde o texto ser� aberto */
	JTextArea edit;

	/* o construtor */
	public FileChooser() {
		super("Editor");
		Container C = getContentPane();
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		edit = new JTextArea();
		JScrollPane ss = new JScrollPane(edit);
		C.add(BorderLayout.CENTER, ss);
		/* este � o botao responsavel por fazer a chamada do nosso JFileChooser */
		JButton Botao = new JButton("Abrir");
		C.add(BorderLayout.SOUTH, Botao);
		/* tratador de eventos */
		Botao.addActionListener(this);

	}

	/* Aqui vamos tratar a a��o do botao criado acima */
	@Override
	public void actionPerformed(ActionEvent e) {
		/* Instancia do FileChooser */
		JFileChooser C = new JFileChooser();
		/* op��o para fazer leitura do arquivo */
		C.showOpenDialog(this);
		File file = C.getSelectedFile();
		try {
			Path pat = Paths.get(file.getAbsolutePath());
			String retorno = new String(Files.readAllBytes(pat));
			edit.setText(retorno);
			/* op��o para salvar o arquivo */
			// C.showSaveDialog(this);

		} catch (Exception e1) {
			/* se ocorrer algum erro na procura do arquivo */
			JOptionPane.showMessageDialog(this, "nao encontrado");

		}
	}

	public static void main(String[] args) {
		new FileChooser();

	}

}
