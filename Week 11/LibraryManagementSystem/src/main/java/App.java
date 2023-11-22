import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityFactory = Persistence.createEntityManagerFactory("deneme1");
        EntityManager entityManager = entityFactory.createEntityManager();
    }
}
