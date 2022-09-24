package br.com.aed.obj_Date;

import java.util.Calendar;
import java.util.Date;

public class Data {
	/* Classe destinada a estudar o objeto date */

	public static void main(String[] args) {
		/*
		 * 01 de jan 1970 o metodo abaixo verifica o tempo em milisegundos decorridos
		 * desde a data de 1970
		 */
		System.out.println(System.currentTimeMillis() + " milisegundos");

		/* como se instancia um objeto date */
		Date data = new Date();

		/* imprime a data atual */
		System.out.println(data);

		/* nova data vamos chamar de data 1 */
		Date data1 = new Date();

		/* imprimimos a nova date */
		System.out.println(data1);

		/*
		 * metodo abaixo retorna um boleano com a compara��o dizendo se uma data � igual
		 * a outra
		 */
		boolean V = data1.equals(data);

		/* imprimir o boleano */
		System.out.println(V);

		/* objeto Calendar, � instanciado da forma abaixo */
		Calendar C1 = Calendar.getInstance();

		/* podemos setar dentro do nosso objeto a data que desejarmos */
		C1.set(2013, Calendar.JULY, 16);

		/* retorna a hora correta */
		System.out.println(C1.getTime());

		/* retorna o ano */
		System.out.println(C1.get(Calendar.YEAR));

		/* retorna o mes */
		System.out.println(C1.get(Calendar.MONTH));

		/* semana do mes */
		System.out.println(C1.get(Calendar.WEEK_OF_MONTH));

		/* dia do mes */
		System.out.println(C1.get(Calendar.DAY_OF_MONTH));
		/* dia da semana */
		System.out.println(C1.get(Calendar.DAY_OF_WEEK));

		/* seta o ano no objeto Calendar */
		C1.set(Calendar.YEAR, 2013);

		/* seta o mes no objeto Calendar */
		C1.set(Calendar.MONTH, Calendar.APRIL);

		/* Seta o dia do mes no objeto Calendar */
		C1.set(Calendar.DAY_OF_MONTH, 20);

		/* limpa os segundos na hora do dia */
		C1.clear(Calendar.SECOND);
		System.out.println(C1.getTime());

		/* sauda��o de acordo com o horario */

		Calendar C2 = Calendar.getInstance();
		int hora = C2.get(Calendar.HOUR_OF_DAY);

		/* Vamos imprimir a hora correta para nosso programa */

		System.out.println(C2.getTime());
		if (hora <= 12) {

			System.err.print("bom dia!!!");

		} else if (hora > 12 && hora < 18) {
			System.err.print("boa tarde");
		} else {
			System.err.print("boa noite");
		}
	}

}
