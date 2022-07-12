import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_loja_virtual", "root", "Gabriel@11022001");
			Statement stmt = conexao.createStatement();
			stmt.execute("SELECT * FROM tbl_produtos;");
			ResultSet rs = stmt.getResultSet();
			while (rs.next()) {
				System.out.println("==========================================");
				System.out.println("Id: " + rs.getInt("produto_id"));
				System.out.println("Nome: " + rs.getString("produto_nome"));
				System.out.println("Descrição: " + rs.getString("produto_descricao"));
				System.out.println("Preço de venda: R$" + rs.getDouble("produto_preco"));
				System.out.println("==========================================");
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
