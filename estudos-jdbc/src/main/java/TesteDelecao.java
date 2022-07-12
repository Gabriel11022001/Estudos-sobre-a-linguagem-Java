import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteDelecao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = null;
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try {
			String query = "DELETE FROM tbl_produtos WHERE produto_id = ?;";
			conexao = connectionFactory.getConnection();
			PreparedStatement stmt = conexao.prepareStatement(query);
			stmt.setInt(1, 3);
			stmt.execute();
			int quantidadeLinhasDeletadas = stmt.getUpdateCount();
			if (quantidadeLinhasDeletadas > 0) {
				System.out.println("Produto deletado com sucesso!");	
			} else {
				System.out.println("Ops!! Ocorreu algum erro!");
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (conexao != null) {
				conexao.close();
			}
		}
	}
}
