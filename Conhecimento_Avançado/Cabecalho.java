package br.com.aed.Conhecimento_Avançado;



import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*define que minha anota��o pode ser usada apenas em classes*/
@Target(ElementType.TYPE)
/*
 * podemos criar um cabe�alho que ser� reconhecido por ferramentas da forma
 * abaixo
 */
public @interface Cabecalho {

	

	String Projeto();

	String Criador();

	int Revisoes();

	
	String Instituição();

	String DataCriação();
}
