import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_loja_virtual", "root", "Gabriel@11022001");
			System.out.println("Conexão realizada com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (conexao != null) {
				conexao.close();
				System.out.println("Fechando a conexão com o banco de dados!");
			}
		}
	}
}
