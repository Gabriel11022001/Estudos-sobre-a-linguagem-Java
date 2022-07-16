import br.com.gabriel.cursojpa.models.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ListarAlunos {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			Aluno aluno = entityManager.find(Aluno.class, 1);
			if (aluno == null) {
				throw new Exception("Não existe um aluno cadastrado com esse id no banco de dados!");
			}
			System.out.println(aluno);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		entityManagerFactory.close();
		entityManager.close();
	}
}
