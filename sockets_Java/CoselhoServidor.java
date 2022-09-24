package br.com.aed.sockets_Java;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CoselhoServidor {

	/* Classe representa o servidor */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		/*
		 * forma de instanciar um servidor,precisa informar apenas a porta TCP, pois o
		 * ip � o da maquina onde ele esta rodando
		 */
		ServerSocket server = new ServerSocket(5002);
		System.out.println("servidor Rodando...");
		/* este fluxo vai ficar esperando uma conexao eternamente */
		while (true) {
			/* o metodo aceept fica esperando uma conexao */
			Socket socket = server.accept();
			/*
			 * quando encontra imprime a msg abaixo, atraves do PrintWriter que recebe como
			 * parametro uma getOutputStream()
			 */
			try (PrintWriter w = new PrintWriter(socket.getOutputStream());) {
				/* metodo para imprimir a msg */
				w.println("Estude java, seja contratado!!!");
			}
		}
	}

}
