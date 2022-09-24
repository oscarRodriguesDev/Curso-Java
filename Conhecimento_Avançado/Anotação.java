package br.com.aed.Conhecimento_Avançado;



import java.io.Serializable;

/** Esta classe destina-se a representar o uso de anota��es */

@Cabecalho(Instituição = "minha casa", Projeto = "curso", Criador = "oscar", Revisoes = 2, DataCriação = "23/10/2013"

)
/*usado para suprimir erros*/
@SuppressWarnings("serial")
/*anota��o criada em erros corrigidos*/
@ErrosCorrigidos(erros = { "0001", "0002" })
public class Anotação implements Serializable {

	/*
	 * indicar que metodo ser� depreciado, nao ser� usado e provavelmente
	 * eliminado em versoes futuras
	 */
	@Deprecated
	public void anotar() {}
	/*indica que metodo foi sobrescrito*/
	@Override
	public String toString(){
		return null;
	}
	
	
}
