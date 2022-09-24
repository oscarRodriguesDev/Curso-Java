package br.com.aed.BancoDeDados;

public class Informações
{

	/**
	 * <p>
	 * Informa��es do Banco:<br>
	 * os programas java se comunicam e manipulam <br>
	 * banco de dados atraves do driver JDBC
	 * </p>
	 * 
	 * 
	 * <p>
	 * Um conjunto de dados organizdos e relacionados<br>
	 * constitui um banco de dados, um banco de dados relacional<br>
	 * relaciona dados em tabelas, esta tabelas sao composta de linhas e colunas
	 * <br>
	 * </p>
	 * 
	 * bancos de dados existenstes<br>
	 * <code> Sysbase, PostGreesql, Mysql, Oracle dentre
	 * outros</code><br>
	 * 
	 * <p>
	 * ------------------------------------------------------------------------
	 * ----------------------------------------------------------------
	 * </p>
	 * <br>
	 * 
	 * <p>
	 * Forma de conectar com o banco de dados em sql
	 * </p>
	 * <code>
connect usuario/senha;
</code><br>
	 * 
	 * criando um novo usuario:<br>
	 * 
	 * <code>
create user 'novo usuario' identified by 'senha';
</code><br>
	 * <p>
	 * concedendo alguns privilegios ao novo usuario:<br>
	 * privilegio de conectar ao banco:<br>
	 * 
	 * <code>
<grant connect, resource to> novo usuario;
</code><br>
	 * privilegio de adm no banco:
	 * 
	 * <code>
<grande dba to> novo usuario;
	 * </p>
	 * <br>
	 * <p>
	 * <code>
USUARIO DO MEU BANCO>>><br>
oscar/88211663
</code>
	 * </p>
	 * <p>
	 * CRIANDO UMA TABELA(essa tabela foi realmente criada)<br>
	 * <code>
CREATE TABLE PESSOA(<br>
CODIGO  NUMBER(2.0),<br>
NOME VARCHAR2(15),<br>
SEXO CHAR(10),<br>
EMAIL VARCHAR2(30),<br>
);<br>
</code>
	 * 
	 * visualizar a tabela:<br>
	 * 
	 * <code>
select (*) from 'nome da tabela'<br>
</code> <br>
	 * inser��o de dados na tabela criada:
	 * 
	 * <code>
insert into 'nometabela' values('valores separados por virgulas')<br>
no caso da tabela acima<br>
insert into 'nometabela' values( 1, 'nome','sexo','email');
</code> pra sair:<br>
	 * <code>
exit
</code>
	 * </p>
	 * <br>
	 * 
	 * <br>
	 * <p>
	 * <code>
	 * Banco>>>>>>>>>>>>>>>>url <br>
DB2>>>>>>>>>>>>>>>>>>jdbc:db2:porta/banco<br>
oracle>>>>>>>>>>>>>>>jdbc:oracle:thin:@servidor:porta:banco<br>
postgreeSQL>>>>>>>>>>jdbc:postgreesql://servidor:porta/banco<br>
sql server >>>>>>>>>>jdbc:sqlserver:servidor:porta;database<br>
Mysql >>>>>>>>>>>>>>>jdbc:mysql://servidor:porta/banco<br>
java db>>>>>>>>>>>>>>jdbc:derby://servidor:porta/banco<br>
Sysbase>>>>>>>>>>>>>>jdbc:sybase:tds:servidoporta/banco<br>
</code> para deletar campos de uma tabela <code>
	 * </p>
	 * delete from 'nome tabela' where 'especifica��o de deleta��o' ; <br>
	 * <p>
	 * </code> apagar toda a tabela
	 * 
	 * <code>
drop table 'nome da tabela';
</code>
	 * </p>
	 * 
	 * */
	public Informações() {
		
	}
}
