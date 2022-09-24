package br.com.aed.Manipula��o_De_Arquivos;

/*importa��es nesse�arias para manipula��o de arquivos em java*/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrimeiroArquivo {

	public static void main(String[] args) throws IOException {
		/*
		 * toda vez que formos trabalhar com arquivos em java, devemos iniciar o
		 * trabalho apresentando um caminho no caso a classe Path que recebe o caminho
		 * que iremos apresentar esse caminho nada mais � que o esquema de diretorios
		 * formados para que se localize um arquivo Instancia de Path new Path(String
		 * caminho);
		 */
		Path caminho = Paths.get("C:/users/user/desktop/vcmd12/files/Cadastro.txt");
		/*
		 * a partir dai podemos recuperar varias informa�oes sobre o caminho apresentado
		 */
		/*
		 * determina o caminho absoluto do arquivo gerado
		 */
		caminho.toAbsolutePath();
		/* apresenta todo caminho para se chegar ao arquivo */
		caminho.getParent();
		/* mostra o diretorio raiz de onde est� o arquivo */
		caminho.getRoot();
		/* retrna o nome do arquivo que est� no caminho */
		caminho.getFileName();
		/** CRIA��O DE DIRETORIOS EM JAVA */
		/* comando abaixo cria o caminho para o arquivo */
		Files.createDirectories(caminho.getParent());
		/** ESCRITA */
		/* instancia-se um aray de bytes */
		byte[] By = "MEUS CADASTROS DE CONSOLIDA��O".getBytes();
		/* o comando abaixo escreve no arquivo */
		Files.write(caminho, By);
		/** LEITURA */
		/*
		 * Instancia-se um novo array de bytesa partir da classe Files e do metodo
		 * static readAllBytes
		 */
		byte[] retorno = Files.readAllBytes(caminho);
		/*
		 * depois so apresentar o resultado em uma objeto do tipo String, informando
		 * como parametro o array de bytes
		 */
		new String(retorno);
		/* podemos se quisermos imprimir este valor */
	}

}
