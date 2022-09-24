package br.com.aed.sockets_Java;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta classe representa um servidoronde as mensagens enviadas por usuarios sao
 * recebidas
 */

public class ChatServer {
	/* O objeto ServerSocket inicializa um servidor */
	ServerSocket server;
	/*
	 * o Objeto socket serve para realizar a comunica��o entre o servidor e cliente
	 */
	Socket socket;
	/* uma lista de escritores, para receber varios escritores */
	List<PrintWriter> escritores = new ArrayList<>();

	public ChatServer() {
		/*
		 * Para evitar possiveis erros todo o codigo est� dentro de um bloco try catch
		 */
		try {
			server = new ServerSocket(5000);
			while (true) {
				/*
				 * o metodo accept, verifica casa verifica se ha mensagens do cliente
				 */
				socket = server.accept();
				/*
				 * toda vez que uma nova leitura for detectada os escritores vai adcionar um
				 * printwriter
				 */
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
				/*
				 * esta Thread permite que varios clientes se conectem ao servidor e ainda que
				 * mais de um cliente se conecte ao mesmo tempo
				 */
				new Thread(new EscutaCliente(socket)).start();

			}
		} catch (Exception e) {
		}
	}

	/*
	 * este metodo vai encaminhar todas as mensagens para os usuarios, recebe como
	 * parametro o texto que ser� impresso
	 */
	private void EncaminharParaTodos(String Texto) {
		try {
			/* usando um for each vamos percorrer cada um dos escritores */
			for (PrintWriter w : escritores) {
				/* para cada um encontrado vamos imprimeir seu texto */
				w.println(Texto);
				/* confirmamos a leitura */
				w.flush();

				/* try catch para tratar possiveis excessoes */
			}
		} catch (Exception e) {
		}
	}

	/* Esta classe � responsavel por receber as mensagens dos clientes */
	private class EscutaCliente implements Runnable {
		/*
		 * precisamos de um leitor que vai ler as mensagens recebidas pelo servidor
		 */
		Scanner leitor;

		public EscutaCliente(Socket socket) {
			try {
				/* o leitor recebe o metodo getImputStream do objeto socket */
				leitor = new Scanner(socket.getInputStream());
			} catch (Exception e) {
			}
		}

		@Override
		public void run() {
			try {
				/*
				 * no metodo Run vamos recolher e presentar todo texto enviado pelo servidor que
				 * seja diferente de nulo
				 */
				String texto;
				while ((texto = leitor.nextLine()) != null) {
					System.out.println(texto);
					/*
					 * no nosso metodo Run alem de imprimir, vamos tambem encaminhar para todos
					 * atravez do metodo encaminhaParaTodos(Texto)
					 */
					EncaminharParaTodos(texto);
				}

			} catch (Exception e) {
			}

		}
	}

	public static void main(String[] args) {
		new ChatServer();
	}

}
