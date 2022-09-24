package br.com.aed.Manipula��o_De_Arquivos;

/*nesta classe vamos ver as funcionalidades daclasse Files 
 * vamos ultilizar uma nova classe a StandardCopyOption*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;//importa��o nesse�aria para usar StandardCopyOption

public class ClasseFiles {
	static Path caminho1;

	public static void main(String[] args) throws IOException {

		/* como sempre tudo se inicia por um caminho */
		Path caminho = Paths.get("C:/users/user/desktop/CONFIGURAR O  ECLIPSE PARA JAVA ME.txt");
		/* retorna um boleano informando a existencia dou nao do arquivo */
		Files.exists(caminho);
		/* retorna um booleano informando se o arquivo � ou nao um diretorio */
		Files.isDirectory(caminho);
		/*
		 * retorna um booleano informando se o arquivo � ou nao um arquivo regular
		 */
		Files.isRegularFile(caminho);
		/* verifica a ultima vez que o arquivop foi modificado */
		Files.getLastModifiedTime(caminho);
		/* informa o domno do arquivo */
		Files.getOwner(caminho);
		/* mostra o tipo do arquivo */

		Files.probeContentType(caminho);// mostra o tip do arquivo
		/* informa se o arquivo pode ser lido */
		Files.isReadable(caminho);
		/* informa se o arquivo pode ser executado */
		Files.isExecutable(caminho);
		/* informa o tamanho do arquivo */
		Files.size(caminho);

		/* deleta o arquivo se ele existir */
		Files.deleteIfExists(caminho1);

		/* cria o arquivo */
		Files.createFile(caminho1);

		/* cria��o de arquivos em branco */
		/* novo caminho */
		Path caminho2 = Paths.get("C:users/user/desktop/teste.txt");
		/* cria��o do novo arquivo */
		Files.createFile(caminho2);
		/*
		 * escrita no novo caminho informa como parametro o path, uma String para ser
		 * gravada
		 */
		Files.write(caminho2, "este � meu arquivo que tava branco".getBytes());
		/* copiando um arquivo para outro local */
		Path copia = Paths.get("C:users/user/desktop/teste/teste.txt");
		Files.copy(caminho2, copia, StandardCopyOption.REPLACE_EXISTING);
		/* movendo arquivos */
		Path mover = Paths.get("C:users/user/desktop/pasta/teste.txt");
		Files.createDirectories(mover.getParent());
		Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);
	}

}
