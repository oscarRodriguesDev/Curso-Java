package br.com.aed.sockets_Java;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatCliente extends JFrame {
	/** Nesta classe vamos criar um Chat atraves do uso de sockets */
	JTextField msg;
	Socket socket;
	PrintWriter escritor;
	String cliente;
	JTextArea TextoRecebido;
	Scanner leitor;

	/* classe escuta servidor */

	private class EscutaServidor implements Runnable {

		@Override
		public void run() {

			try {
				String texto;
				/*
				 * um while vai verificar frequentemente a exixtencia de novas mensagens no
				 * sevidor
				 */
				while ((texto = leitor.nextLine()) != null) {
					/*
					 * caso exixtam mensagens ela ser� exibida na tela de todos os clientes
					 */
					TextoRecebido.append(texto + "\n");
					/*
					 * todo este bloco dentro de um try e catch para tratamento de excessoes
					 */
				}
			} catch (Exception e) {
			}

		}

	}

	/* o construtor rcebe como parametro o nome do cliente */
	public ChatCliente(String cliente) {
		/*
		 * vamos construir uma janela que vai receber os componentes nessecarios para o
		 * envio da mensagem
		 */
		super("chat " + cliente);
		this.cliente = cliente;
		Font font = new Font("Serif", Font.PLAIN, 15);
		JPanel panel = new JPanel();
		msg = new JTextField();
		msg.setColumns(30);
		msg.setFont(font);
		/* este botao vai ser o responsavel por enviar a mensagem */
		JButton botao = new JButton("enviar");
		botao.setFont(font);
		botao.addActionListener(new EnviarListener());
		panel.add(BorderLayout.CENTER, msg);
		panel.add(BorderLayout.EAST, botao);
		/* aqui as mensagens se�o exibidas para todos os usuario conectados */
		TextoRecebido = new JTextArea();
		TextoRecebido.setFont(font);
		JScrollPane barra = new JScrollPane(TextoRecebido);
		getContentPane().add(panel, BorderLayout.SOUTH);
		getContentPane().add(barra, BorderLayout.CENTER);
		/* chamado do metodo que configura a rede */
		configurarRede();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	/* Metodo usado para configurar a rede */
	public void configurarRede() {
		try {
			/*
			 * configura o objeto socket, recebe o ip e a porta que ele vai se comunicar
			 */
			socket = new Socket("127.0.0.1", 5000);
			/* configura o escritor */
			escritor = new PrintWriter(socket.getOutputStream());
			/* leitor que permite a leitura de novas mensagens vindas do servidor */
			leitor = new Scanner(socket.getInputStream());
			/* aqui executamos a Thread que vai escutar o servidor */
			new Thread(new EscutaServidor()).start();
			/* novamente qualquer excessao � tratada nos blocos try catch */
		} catch (Exception e) {
		}

	}

	/* classe que trata os eventosdo botao */
	class EnviarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			/* o escritor vai escrever a mensagem contida no TextField */
			escritor.println(cliente + " enviou: " + msg.getText());
			escritor.flush();
			/* seta msg vazia no textField */
			msg.setText("");
			/* e volta o foco para o textField */
			msg.requestFocus();

		}

	}

	public static void main(String[] args) {
		/* posso chamar quantos chats diferentes eu quiser */
		new ChatCliente("oscar");
		new ChatCliente("aika");

	}

}
