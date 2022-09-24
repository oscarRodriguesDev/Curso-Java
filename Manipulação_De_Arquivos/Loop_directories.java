package br.com.aed.Manipula��o_De_Arquivos;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Loop_directories {
	/*
	 * esta classe mostrra diversas formas de percorrer conteudos de um diretorio
	 * vamos a eles
	 */

	public static void main(String[] args) {
		/*
		 * lista todas as unidades principais do computador, se houver algum pen driver
		 * instalado elel tambem e� mostrado
		 */
		Iterable<Path> Dirs = FileSystems.getDefault().getRootDirectories();
		for (Path Path : Dirs) {
			/* imprime o resultado na tela */
			System.out.println("unidade " + Path);

		}

		/* Lista todos os conteudos do diretorio informado */
		Path dir = Paths.get("C:/"/*
									 * informe o diretorio que sdeseja percorrer aqui
									 */);
		try (DirectoryStream<Path> C = Files.newDirectoryStream(dir);) {

			for (Path Path : C) {
				System.out.println("conteudo " + Path.getFileName());
			}
			/* excessoes que podem ocorrer */
		} catch (IOException | DirectoryIteratorException e) {

			System.out.println("erro: " + e);

		}
	}
}
