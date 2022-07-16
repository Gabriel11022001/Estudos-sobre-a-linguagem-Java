import java.time.LocalDate;

import br.com.gabriel.cursojpa.models.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Teste1 {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Aluno aluno = new Aluno();
			aluno.setNome("Gabriel Rodrigues dos Santos");
			aluno.setEmail("gabriel@teste.com");
			LocalDate dataNascimento = LocalDate.of(2001, 2, 11);
			aluno.setDataNascimento(dataNascimento);
			aluno.setMatriculado(true);
			aluno.setRa("12345678");
			// O método persist(entidade) persiste a entidade no banco de dados
			entityManager.persist(aluno);
			entityTransaction.commit();
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			entityTransaction.rollback();
		}
		entityManagerFactory.close();
		entityManager.close();
	}
}
