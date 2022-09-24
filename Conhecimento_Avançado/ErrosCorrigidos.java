package br.com.aed.Conhecimento_Avançado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*define que minha anotação serve tanto para classescomo para metodos*/
@Target({ ElementType.TYPE, ElementType.METHOD })
/* define que miha anotação ira aparecer no javadoc */
@Documented
public @interface ErrosCorrigidos {

	String[] erros();
}
