package hslu_feukora;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MockDbHandler {
	
	private String username;
	private String password;
	
	private static EntityManagerFactory entityManagerFactory = null;

	static {
		try {
			/* EntityManagerFactory erzeugen */
			entityManagerFactory = Persistence
					.createEntityManagerFactory("DemoPU");

}
