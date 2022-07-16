import java.time.LocalDate;

import br.com.gabriel.cursojpa.models.Aluno;
import br.com.gabriel.cursojpa.models.Telefone;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CadastrandoTelefoneEAlunoAoMesmoTempo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			Aluno aluno1 = new Aluno(null, "Aluno 1", "123456", LocalDate.of(2001, 6, 8), "aluno1@gmail.com", true);
			Aluno aluno2 = new Aluno(null, "Aluno 2", "123456", LocalDate.of(2001, 6, 8), "aluno2@gmail.com", true);
			Telefone telefone1 = new Telefone(null, "(13) 998776655", aluno1);
			Telefone telefone2 = new Telefone(null, "(11) 998776155", aluno1);
			Telefone telefone3 = new Telefone(null, "(15) 998775512", aluno2);
			entityTransaction.begin();
			entityManager.persist(aluno1);
			entityManager.persist(aluno2);
			entityManager.persist(telefone1);
			entityManager.persist(telefone2);
			entityManager.persist(telefone3);
			entityTransaction.commit();
			System.out.println("Alunos com seus respectivos telefones cadastrados com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			entityTransaction.rollback();
		}
		entityManager.close();
		entityManagerFactory.close();
	}
}
