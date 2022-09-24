package br.com.aed.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AcessoBanco {
	/* precisaremosde uma conexao */
	static Connection con;
	/* precisaremos de um preparedstatement */
	static PreparedStatement ps;
	/* precisamos de um ResultSet */
	static ResultSet rs;

	/* nesta classe vamos exemlificar o acesso a bancos de dados */

	public static void main(String[] args) throws SQLException {
		/*
		 * A conexao com o banco nessecita de uma url, que ir� localizar o banco de
		 * dados na rede ou computador local
		 */
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		/*
		 * a string sql � o comando a ser chamado pelo statement, � o mesmo comando
		 * usado em linhas de codigo sql
		 */
		String sql = "select codigo,nome,sexo,email from pessoa";
		try {
			/*
			 * forma de recuperar uma conexao, os parametros sao a url do banco, o usuario e
			 * a senha do mesmo
			 */
			con = DriverManager.getConnection(url, "oscar", "88211663");
			/*
			 * objeto statement, ultilizado para gerenciar requisi�oes ao servidor
			 */
			ps = con.prepareStatement(sql);
			/* o metodo executeQuery retorna um objeto ResultSet */
			rs = ps.executeQuery();

			/* o fluxo percorre os dados do banco e retorna-os */
			while (rs.next()) {
				/* metodo para retornar o valor dentro do banco */
				String str = rs.getString("codigo") + "        " + rs.getString("nome") + "           "
						+ rs.getString("sexo") + "         " + rs.getString("email");
				System.out.println(str);

			}
			/* importante fechar as conexoes abertas */

		} catch (SQLException e) {
			/*
			 * se ocorrer alguma excessao, a mensagem abaixo e enviada ao usuario
			 */
			System.out.println("erro ao conectar com o banco" + e);
		}

	}

}
