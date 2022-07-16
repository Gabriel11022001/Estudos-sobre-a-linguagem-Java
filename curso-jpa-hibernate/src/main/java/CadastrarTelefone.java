import br.com.gabriel.cursojpa.models.Aluno;
import br.com.gabriel.cursojpa.models.Telefone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CadastrarTelefone {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			Aluno alunoDoTelefone = entityManager.find(Aluno.class, 2);
			Telefone telefone = new Telefone();
			telefone.setNumero("(11) 998665512");
			telefone.setAluno(alunoDoTelefone);
			entityTransaction.begin();
			entityManager.persist(telefone);
			entityTransaction.commit();
			System.out.println("Telefone cadastrado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			entityTransaction.rollback();
		}
		entityManager.close();
		entityManagerFactory.close();
	}
}
