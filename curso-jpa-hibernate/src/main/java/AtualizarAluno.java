import br.com.gabriel.cursojpa.models.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AtualizarAluno {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			Aluno aluno = entityManager.find(Aluno.class, 2);
			aluno.setNome("Pedro José da Silva");
			entityTransaction.begin();
			entityManager.merge(aluno);
			entityTransaction.commit();
			System.out.println("Aluno atualizado com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			entityTransaction.rollback();
		}
		entityManager.close();
		entityManagerFactory.close();
	}
}
