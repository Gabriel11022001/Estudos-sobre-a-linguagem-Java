import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException {
		String usuario = "root";
		String senha = "Gabriel@11022001";
		String banco = "db_loja_virtual";
		Connection conexao = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + banco, usuario, senha);
			System.out.println("Conexão com o banco de dados efetivada com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return conexao;
	}
}
