package hslu_feukora;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MockDbHandler {

	public String username;
	public String password;

	public static EntityManagerFactory emf = null;

	public void createDb() {

		try {
			/* EntityManagerFactory erzeugen */
			emf = Persistence.createEntityManagerFactory("DemoPU");
		} catch (Throwable e) {
			/* TODO - Fehlerbehandlung … */
			e.printStackTrace();
		}

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(username);
		em.persist(password);

	}
}
