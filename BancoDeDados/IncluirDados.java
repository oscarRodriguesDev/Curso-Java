package br.com.aed.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluirDados {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		/*
		 * a string sql � o comando a ser chamado pelo statement, deve conter nos campos
		 * correspondentes sinais de interroga��o
		 */
		String sql = "insert into pessoa values(?,?,?,?)";

		/* array de pessoas a serem incluidas no banco */
		String[] nomes = { "Ester", "Elizabeth", "Sandrinha" };
		/*
		 * conexao iniciada com o bbanco de dados recebe a url do banco, o usuario e a
		 * senha
		 */
		try (Connection con1 = DriverManager.getConnection(url, "oscar", "88211663");) {

			try (PreparedStatement ps1 = con1.prepareStatement(sql)) {
				;
				for (int i = 0; i < nomes.length; i++) {
					/* indice dentro do banco de dados primeiro campo */
					ps1.setInt(1, i + 2);
					/* segundo campo o nome */
					ps1.setString(2, nomes[i]);
					/* terceiro campo o sexo */
					ps1.setString(3, "f");
					/* quarto campo o email */
					ps1.setString(4, nomes[i].toLowerCase() + "@yahooo.com.br");
					/*
					 * como vamos incluir varias solicita��oes ao banco usamos addBatch
					 */
					ps1.addBatch();
				}
				ps1.executeBatch();
			} catch (SQLException e) {
			}

		}
		/* para a classe funcionar deve-se criar a tabela pessoa */

	}

}
