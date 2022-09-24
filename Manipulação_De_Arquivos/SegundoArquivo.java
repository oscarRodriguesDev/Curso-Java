package br.com.aed.Manipula��o_De_Arquivos;

/*vamos conhecer duas novas classes para manipula��o de arquivos
 * sao elas BufferedWriter e Charset e StandardCharsets*/
import java.io.BufferedWriter;//importa��o nesse�aria para BufferedWriter
import java.io.IOException;
import java.nio.charset.Charset;//importa��o nessecaria para trabalhar
import java.nio.charset.StandardCharsets;//importa��o nessecaria para trabalhar com StandardCharsets
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SegundoArquivo {
	/*
	 * nesse arquivo vamos apenas escrever no arquivo que ja foi criado usando a
	 * classe BufferedWriter
	 */
	public static void main(String[] args) {
		/*
		 * instanciamos o caminho onde j� ha um arquivo criado obs o arquivo deve ter a
		 * extensao .txt
		 */
		Path paths = Paths.get("C:/users/user/desktop/vcmd12/files/Cadastro.txt");
		/*
		 * instanciamos a classe Charset e chamamos a classe StandardCharsets e chamamos
		 * uma constante �para representar o formato do texto no caso UTF8
		 */
		/**
		 * VALORES POSSIVEIS PARA StandardCharsets StandardCharsets.UTF_16;
		 * StandardCharsets.US_ASCII; StandardCharsets.UTF_16BE;
		 * StandardCharsets.UTF_16LE; StandardCharsets.UTF_8;
		 */
		Charset utf8 = StandardCharsets.UTF_8;
		/*
		 * vamos instanciar nosso BufferedWriter ele recebe como parametro o caminho e o
		 * objeto Charset, o BufferedWriter e instanciado dentro de um escopo do try
		 * cath
		 */
		try (BufferedWriter w = Files.newBufferedWriter(paths, utf8)) {
			/* metodo para escrever no arquivo */
			w.write("Texto1");
			w.write("Texto2");
			w.write("Texto3");
			/*
			 * metodo que deve ser chamado de tempos em tempos para a grava���o no arquivo
			 */
			w.flush();
			/*
			 * de forma geral o BufferedWriter serve para escrevermos textos maiores dentro
			 * arquivo que fora criado anteriormente
			 */

		} catch (IOException e) {
			/*
			 * excessoes pode ser lancadas caso o arquivo nao exista esteja com a extensao
			 * errada
			 */
			e.printStackTrace();

		}

	}
}
/*
 * ==============finish class==========================
 */
