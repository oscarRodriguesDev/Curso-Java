package br.com.aed.Exceoptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LancaException {

	/*
	 * nesta classe vamos mostrar como lancar excessoes, greralmente quando lancamos
	 * uma excessao, estamos dizendo ao programa que futuramente iremos trata-las e
	 * vc deve tratar todas as excessoes para evitar erros, pra tratarmos excessoes
	 * ultilizamos a palavra chave throws(com s) observe a classe
	 */
	/**
	 * para exemplificarmos melhor vamos criar um metodo que verifica um diretorio
	 * 
	 * @throws IOException
	 */
	public static void verificadiretorio() throws IOException {
		Path pat = Paths.get("c:/users/user/desktop/minha pasta");
		/*
		 * este metodo da classe File lanca uma excessao do tipo IOException, apague o
		 * inscri��o apos a escrita do metodo e veja que o programa nem mesmo consegue
		 * ser executado
		 */
		Files.createDirectories(pat);

	}

	public static void main(String[] args) throws IOException {
		/*
		 * aqui poderemos lancar as excessoes ou mesmo tratala mas aqui vamos apenas
		 * lancar novamente
		 */
		verificadiretorio();
	}

}
