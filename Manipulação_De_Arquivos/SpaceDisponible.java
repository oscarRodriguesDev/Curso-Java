package br.com.aed.Manipula��o_De_Arquivos;

import java.io.IOException;
import java.nio.file.FileStore;//importa�oes nessecarias 
import java.nio.file.FileSystem;//importa�oes nessecarias 
import java.nio.file.FileSystems;//importa�oes nessecarias 

public class SpaceDisponible {
	/*
	 * classe retorna todas as unidades ativas no pc e discriminar os seus
	 * respectivos espa�os usados e disponiveis
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * Objeto FileSystem com ele podemos extrair informa��es sobreo sistema que
		 * estamos ultilizando
		 */
		FileSystem S = FileSystems.getDefault();
		/*
		 * este for each percorre o sistema e traz as informa�oes que nessecitamos
		 */
		for (FileStore Store : S.getFileStores()) {
			/* traz todas as unidades listadas no sistema */
			Store.toString();
			/* traz o total de espa�o ultilizado na unidade avaliada */
			Store.getUnallocatedSpace();
			/* traz todo o espa�o dainda disponivel na unidade avaliada */
			Store.getUsableSpace();
		}

	}
	/*---------------------finish class----------------------------*/
}
