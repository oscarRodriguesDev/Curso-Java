package br.com.aed.Conhecimento_Avan�ado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*define que minha anota��o serve tanto para classescomo para metodos*/
@Target({ ElementType.TYPE, ElementType.METHOD })
/* define que miha anota��o ira aparecer no javadoc */
@Documented
public @interface ErrosCorrigidos {

	String[] erros();
}
