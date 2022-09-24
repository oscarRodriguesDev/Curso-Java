package br.com.aed.Componentes_AWT;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogExemplo {
	/* nesta classe vamos instanciar um FileDialog */

	public FileDialogExemplo() {
		/*
		 * umam coisa muito importante � que precisamos de um frame para que o FileDilog
		 * seja instanciado
		 */
		/* nao precisamos dos atributos do frame */
		Frame frame = new Frame();
		/*
		 * ja podemos instaciar o FileDialog Precisamos passar alguns �parametros pra
		 * ele
		 * 
		 * Dialog(Frame frame,String title, int a��o ), onde a�ao � uma constante
		 * definida pelo FileDialog os valores possives sao,LOAD para simples
		 * leitura,SAVE para salvar um arquivo
		 */
		FileDialog dialog = new FileDialog(frame, "escolha um diretorio", FileDialog.LOAD);
		/*
		 * o FileDialog est� por default invisvel entao precisamnos torna-lo visivel
		 * para que ele seja apresentado
		 */
		dialog.setVisible(true);
		/* alguns metodos importantes do FileDialog */
		/* retorna o diretorio escolhido pelo usuario */
		System.out.println(dialog.getDirectory());
		/* retorna apenas o nome do arquivo selecionado pelo usuario */
		System.out.println(dialog.getFile());
		/* seta uma nova localiza��o para o diretorio do FileDialog */
		dialog.setDirectory("c:/users/user/desktop");
		System.out.println(dialog.getDirectory());
		/* seta um arquivo no FileDialog */
		dialog.setFile(null);
	}

	public static void main(String[] args) {
		new FileDialogExemplo();
	}
}