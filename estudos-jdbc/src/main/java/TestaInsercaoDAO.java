
public class TestaInsercaoDAO {

	public static void main(String[] args) {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		try {
			Produto produto = new Produto();
			produto.setNome("Teste 1233");
			produto.setDescricao("aiojfeoiajfoijaeofij");
			produto.setPreco(120.50);
			Produto produtoCadastrado = produtoDAO.cadastrarProduto(produto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
