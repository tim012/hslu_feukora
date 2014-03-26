package hslu_feukora;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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

		try {
			em.getTransaction().commit();

			username = password = null;

			String sql = "SELECT * FROM username";
			TypedQuery q = (TypedQuery) em.createQuery(sql);

			List<String> usernameListe = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();

			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			/* EntityManger schliessen */
			em.close();
		}
	}
}
