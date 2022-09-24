package br.com.aed.BancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCrud {

	/* metodo para trasferencia */
	public void transferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException {

		if (origem.saldo >= valor) {
			try {
				con.setAutoCommit(false);
				/* saque */
				origem.saldo -= valor;
				alterar(con, origem);
				/* deposito */
				destino.saldo += valor;
				alterar(con, destino);
				// confirma a transa��o
				con.commit();
				System.out.println("transa��o realizada com sucesso");
			} catch (Exception e) {
				System.out.println("transa��o nao realizada");
				// desfaz transa��o

				con.rollback();

			}
		}
	}

	/* vai criar a conta correspondente no banco de dados */
	public void criar(Connection con, Conta conta) throws SQLException {

		String sql = "insert into conta values(?,?,?)";
		try (PreparedStatement stm = con.prepareStatement(sql);) {
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.nome);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}

	}

	/* vai alterar os dados no banco de dados */
	public void alterar(Connection con, Conta conta) throws SQLException {

		String sql = "update conta  set cliente =?,saldo=? where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql);) {
			stm.setString(1, conta.nome);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
		}

	}

	/* vai excluir os dados no banco de dados */
	public void excluir(Connection con, Conta conta) throws SQLException {

		String sql = "delete conta where numero=?";
		try (PreparedStatement stm = con.prepareStatement(sql);) {

			stm.setInt(1, conta.numero);
			stm.executeUpdate();
		}

	}

	/* retorna uma lista com as contas no banco */
	public List<Conta> ler(Connection con) throws SQLException {

		List<Conta> lista = new ArrayList<>();

		String sql = "select numero, cliente ,saldo from conta";
		try (PreparedStatement stm = con.prepareStatement(sql);) {
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}

		return lista;
	}

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try (Connection con = DriverManager.getConnection(url, "oscar", "88211663");) {
			ContaCrud crud = new ContaCrud();

			// Conta conta1 = new Conta(1,"nicoli",1000.1);
			// Conta conta2 = new Conta(2, "sara", 2000.2);
			// Conta conta3 = new Conta(3,"aika",3000.3);

			/** cria��o das contas */
			// crud.criar(con, conta1);
			// crud.criar(con, conta2);
			// crud.criar(con, conta3);
			/** altera��o da conta */
			// conta1.saldo = 3000.3;
			// crud.alterar(con, conta1);
			/** exclusao da conta */
			// crud.excluir(con, conta2);

			/**
			 * para realiuzar as solicita�oes basta tirar o codigo do bloco de comentarios
			 */

			List<Conta> lista = crud.ler(con);
			for (Conta conta : lista) {

				System.out.println(conta);
				/* criar uma nova tabela a antiga foi apagada */
			}
			/** transa��o das contas */
			/* recuperamos a conta que esta no banco de dados */
			Conta origem = lista.get(0);
			Conta destino = lista.get(1);
			/* realizamos a transferencia de valores */
			crud.transferir(con, destino, origem, 1500.0);
			/* abaixo apenas apresentamos os valores das contas */
			System.out.println(origem.toString());
			System.out.println(destino.toString());

		}

	}
}
