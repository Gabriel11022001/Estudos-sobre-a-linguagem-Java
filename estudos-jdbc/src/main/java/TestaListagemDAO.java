import java.util.List;

public class TestaListagemDAO {

	public static void main(String[] args) {
		List<Produto> produtos = null;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		try {
			produtos = produtoDAO.buscarTodosProdutos();
			if (produtos != null) {
				produtos.forEach((produto) -> {
					System.out.println("Id: " + produto.getId());
					System.out.println("Nome: " + produto.getNome());
				});
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
