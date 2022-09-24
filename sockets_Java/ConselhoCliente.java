package br.com.aed.sockets_Java;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	/**
	 * Esta classe Exemplifica uma conexao socket simples
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws Exception {
		/*
		 * O primeiro passo � criar uma conexao de socket, precisa informar como
		 * parametro o endere�o e a porta tcp do servidor
		 */
		// portas de 0-1023 nao devem ser usadas pois sao reservadas
		@SuppressWarnings("resource")
		Socket socket = new Socket("127.0.0.1", 5002);
		/* recuperamos a mensagem atraves da Classe Scaner */
		@SuppressWarnings("resource")
		Scanner S = new Scanner(socket.getInputStream());
		/* abaixo imprimimos a mensagem */
		System.out.println("mensagem: " + S.nextLine());
	}

}
