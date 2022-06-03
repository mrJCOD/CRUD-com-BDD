package Fabrica.De.Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConexao {
	// nome do usuario do MYSQL
	private static final String USERNAME = "root";

	// senha do bdd
	private static final String PASSWORD = "123456";

	// caminho da DB, porta + nome
	private static final String url_DB = "jdbc:mysql://localhost:3306/rickandmorty";

	/*
	 * Conexao com o banco de dados
	 */

	public static Connection criarConexaoComMYSQL() throws Exception {
		// faz com que a classe seja carregada pela jvm
		Class.forName("com.mysql.cj.jdbc.Driver");
		// cria conexao com o banco de dados
		Connection conexao = DriverManager.getConnection(url_DB, USERNAME, PASSWORD);

		return conexao;
	}

	public static void main(String[] args) throws Exception {
		// recuperar conexao com o BDD
		Connection con = criarConexaoComMYSQL();

		if (con != null) {
			System.out.println("Conexão obtida com sucesso.");
			con.close();

		}

	}

}
