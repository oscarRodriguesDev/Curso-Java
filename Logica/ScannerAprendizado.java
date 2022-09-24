/**nesta classe  vamos entender o uso da classe scaner*/
/*� importante que voce indique aqui dentro em qual pacote a classe se encontra*/
package br.com.aed.Logica;

/** a classe so vai funcionar se esta importa��o estiver aqui*/
import java.util.Scanner;

/*primeira coisa vamos iniciar nossa classe como ja de costume*/

public class ScannerAprendizado {
	/* vamos tambem criar o metodo mais com o array de argumentos do tipos tring */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * apenas para titulo de compila��o vamos exibir um texto -para ser apresentado
		 * quando nossa classe tiver sido criada
		 */
		// System.out.print("conhecendo a classe scaner");

		/* recuperando dados com a classe Scaner */
		Scanner sc = new Scanner(System.in);
		/*
		 * oq ue estamos fazendo e provendo um espaco editavel de texto no prompt ou
		 * console de erros de um IDE, depois atribuimos o texto editado a uma variave d
		 * tipo String entao recuperamos seu valor atravez do System.out.println()
		 */
		String texto = sc.nextLine();
		System.out.println("texto digitado " + texto);

	}
}