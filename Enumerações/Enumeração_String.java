package br.com.aed.Enumerações;
/*enumerações sao constantes possuem modificadores  final*/
public enum Enumeração_String {
	/*sao criadas e ja adcionadas o seu valor como abaixo*/
 MM("milimetro"), CM("centimetro"), MT("metro");
 public String Titulo;//deve-se declarar uma variavel do tipo das constantes
	/*o construtor deve receber um parametro do mesmo tipo */
 Enumeração_String(String Titulo){
 this.Titulo = Titulo;
		 }
}
