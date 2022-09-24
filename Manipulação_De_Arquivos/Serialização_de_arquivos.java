package br.com.aed.Manipula��o_De_Arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import br.com.aed.Estudo_objetos.Conta;

/*Esta classe tem como finalidade explicar como se serializa objetos na linguagem java
 * este processo consiste serializar o objeto deixando ilegivel
 *  para pessoas, mas codificavel por maquinas, computadores*/

public class Serializa��o_de_arquivos
{
	/*
	 * abaixo os objetos que serao serializados esta classe est� no pacote
	 * Escrot�rio
	 */
	Conta oscar;
	Conta sara;

	/* o construtor aqui foi usado apenas para instanciar as contas */
	public Serializa��o_de_arquivos() {
		/*
		 * para entender os parametros dos objetos instanciados abaixo vide
		 * classe conta
		 */
		oscar = new Conta("oscar", 10_000_000);
		sara = new Conta("sara", 10_00);
	}

	/* metod gravaObjeto, bem sugestivo sua fun��o e gravar o objeto */
	public void gravaObjeto() {
		/* todo o codigo dentro do bloco try catch */
		try {
			/* primeiro o caminho deve ser apresentado */
			Path path = Paths.get("c:/users/user/contas/cta.ser");
			/* depois de apresentado o camiho ele deve ser criado */
			Files.createDirectories(path.getParent());
			/*
			 * o caminho para a seria�iza��o � apresentado o caminho � o mesmo do Path
			 */
			FileOutputStream fos = new FileOutputStream("c:/users/user/desktop/contas/cta.ser");
			/*
			 * o serializador dos objetos ObjectOutPutStream e chamado e recebe como
			 * parametro o FileOutPutStream
			 */
			ObjectOutputStream G = new ObjectOutputStream(fos);
			/* o metodo write Object escreve o objeto */
			G.writeObject(oscar);
			G.flush();
			G.writeObject(sara);
			G.close();
			System.out.println("gravou");
			/*
			 * se voce navegar at� o diretorio informado vc vai perceber que o diretorio foi
			 * criado e um arquivo foi gravado la dentro dentro
			 */
		} catch (Exception e) {
			/* qualquer excessao sera realizado o procedimento abaixo */
			System.out.println("erro : " + e);
		}
	}

	@SuppressWarnings("resource")
	/* tambem bem sugestivo o metodo faz leitura dos objetos gravados */
	public void LerObjeto() {
		// dentro do bloco try catc tambem
		try {
			/*
			 * instancia do deserializador de objetos, como paramtros o caminho onde se
			 * encontra o objeto serializado
			 */
			FileInputStream ler = new FileInputStream("c:/users/user/contas/cta.ser");
			/*
			 * ObjectInputStream reaponsavel pela leitura dos objetos serializados recebe
			 * como �parametro o FileInputStream
			 */
			ObjectInputStream leer = new ObjectInputStream(ler);
			/* vamos usar o metodo Read */
			Conta c1 = (Conta) leer.readObject();// leitura das contas
			Conta c2 = (Conta) leer.readObject();// leitura das contas
			/* contas desserializadas exibindo os saldos e o dono da conta */
			c1.exibeSaldo();
			c2.exibeSaldo();

		} catch (Exception e) {
			/* todo e qualquer erro � tratado aqui */
			System.out.println("erro : " + e);
		}
	}

	public static void main(String[] args) {
		/**/
		Serializa��o_de_arquivos sda = new Serializa��o_de_arquivos();
		sda.gravaObjeto();
		sda.LerObjeto();

	}
}
