package br.com.aed.Exceoptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Esta classe destina -se a entender o tratamento de
 *  excessoes na programa��o de java*/
public class TryCatchExemple {

	/*
	 * nesta classe vamos gera propositadametne um erro e vamos capturar este erro e
	 * trata-lo, atraves do bloco try catch
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		boolean continua = true;
		do {
			try {

				System.out.println("numero:");
				/*
				 * vamos recuperar do usuario um dois numeros um dividendo e um divisor
				 */
				int A = new Scanner(System.in).nextInt();// dividendo
				System.out.println("divisor:");
				int B = new Scanner(System.in).nextInt();// divisor
				System.out.println(A / B);
				/*
				 * se tudo estiverr correto o resultado � apresentado e um novo dividendo e
				 * divisor pode ser chamado
				 */
				continua = false;
				new Scanner(System.in).nextLine();

			} // mult catch
			catch (InputMismatchException | ArithmeticException e1) {
				System.err.println("invalid vallue");
				new Scanner(System.in).nextLine();
				System.out.println(/* imprime erro */e1.fillInStackTrace());
			}

			finally {
				System.out.println("finally Executado");
			}
		} while (continua);

		if (continua = true) {
			do {
				try {

					System.out.println("numero:");
					int A = new Scanner(System.in).nextInt();

					System.out.println("divisor:");
					int B = new Scanner(System.in).nextInt();
					System.out.println(A / B);
					continua = false;
					new Scanner(System.in).nextLine();

				} // mult catch
				catch (InputMismatchException | ArithmeticException e1) {
					System.err.println("invalid vallue");
					new Scanner(System.in).nextLine();
					System.out.println(e1.fillInStackTrace());

				}
				// catch(ArithmeticException e1){
				// System.out.println("o divisor tem que ser maior que zero");
				// s.nextLine();
				// }
				finally {
					System.exit(0);

				}
			} while (continua);

		}

	}
}
