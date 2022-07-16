import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

	public Produto cadastrarProduto(Produto produto) throws SQLException {
		Produto produtoCadastrado = null;
		Connection conexao = new ConnectionFactory().getConnection();
		if (conexao == null) {
			System.out.println("Ocorreu um erro ao tentar-se estabelecer uma conexão com o banco de dados!");
			return null;
		}
		conexao.setAutoCommit(false);
		try {
			String query = "INSERT INTO tbl_produtos(produto_nome, produto_descricao, produto_preco) VALUES(?, ?, ?);";
			PreparedStatement stmt = conexao.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				int idProdutoCadastrado = rs.getInt(1);
				produtoCadastrado = new Produto();
				produtoCadastrado.setId(idProdutoCadastrado);
				produtoCadastrado.setNome(produto.getNome());
				produtoCadastrado.setDescricao(produto.getDescricao());
				produtoCadastrado.setPreco(produto.getPreco());
			}
			conexao.commit();
			System.out.println("Produto cadastrado com sucesso!");
		} catch (Exception e) {
			conexao.rollback();
			System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
		} finally {
			if (conexao != null) {
				conexao.close();
			}
		}
		return produtoCadastrado;
	}
	public List<Produto> buscarTodosProdutos() throws SQLException {
		List<Produto> produtos = null;
		Connection conexao = new ConnectionFactory().getConnection();
		if (conexao == null) {
			System.out.println("Ocorreu um erro ao tentar-se estabelecer uma conexão com o banco de dados!");
			return null;
		}
		conexao.setAutoCommit(false);
		try {
			produtos = new ArrayList<Produto>();
			String query = "SELECT * FROM tbl_produtos;";
			PreparedStatement stmt = conexao.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("produto_id"));
				produto.setNome(rs.getString("produto_nome"));
				produto.setDescricao(rs.getString("produto_descricao"));
				produto.setPreco(rs.getDouble("produto_preco"));
				produtos.add(produto);
			}
			conexao.commit();
			System.out.println("Produtos listados com sucesso!");
		} catch (Exception e) {
			conexao.rollback();
			System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
		} finally {
			if (conexao != null) {
				conexao.close();
			}
		}
		return produtos;
	}
}
