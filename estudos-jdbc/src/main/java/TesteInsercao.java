import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInsercao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		conexao = connectionFactory.getConnection();
		/*
		 * Definindo setAutoCommit(false), eu defino que eu mesmo
		 * vou querer controlar os commits no banco de dados.
		 */
		conexao.setAutoCommit(false);
		try {
			PreparedStatement stmt = conexao.prepareStatement("INSERT INTO tbl_produtos(produto_nome, produto_descricao, produto_preco) VALUES(?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, "Produto de teste 2");
			stmt.setString(2, "Descrição do produto de teste 2");
			stmt.setDouble(3, 12.22);
			stmt.execute();
			ResultSet rs = stmt.getGeneratedKeys();
			int i = 1;
			if (i == 1) {
				throw new RuntimeException("Lançando uma exceção aqui!");
			}
			if (rs.next()) {
				System.out.println("Id do produto cadastrado no banco de dados: " + rs.getInt(1));
			}
			/**
			 * Ao invocar o metodo commit() o registro será
			 * salvo no banco de dados.
			 */
			conexao.commit();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			/**
			 * Ao invocar o metodo rollback() o commit será desfeito.
			 */
			conexao.rollback();
		} finally {
			if (conexao != null) {
				conexao.close();
			}
		}
	}
}
