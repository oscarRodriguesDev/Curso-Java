package br.com.aed.Enumera��es;
/*enumera��es sao constantes possuem modificadores  final*/
public enum Enumera��o_String {
	/*sao criadas e ja adcionadas o seu valor como abaixo*/
 MM("milimetro"), CM("centimetro"), MT("metro");
 public String Titulo;//deve-se declarar uma variavel do tipo das constantes
	/*o construtor deve receber um parametro do mesmo tipo */
 Enumera��o_String(String Titulo){
 this.Titulo = Titulo;
		 }
}
