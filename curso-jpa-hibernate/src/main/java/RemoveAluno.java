import br.com.gabriel.cursojpa.models.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RemoveAluno {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			Aluno alunoRemover = entityManager.find(Aluno.class, 1);
			if (alunoRemover == null) {
				throw new Exception("Não existe um aluno cadastrado com esse id no banco de dados!");
			}
			entityTransaction.begin();
			entityManager.remove(alunoRemover);
			entityTransaction.commit();
			System.out.println("Aluno removido com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			entityTransaction.rollback();
		}
		entityManager.close();
		entityManagerFactory.close();
	}
}
