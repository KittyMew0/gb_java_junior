package geekbrains_course.java_junior.lesson3.seminar3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonDAO {
    private EntityManagerFactory entityManagerFactory;

    public PersonDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("PersonPU"); // Название persistence-unit
    }

    public void addPerson(Person person) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Person added: " + person);
    }

    public void updatePerson(Long id, String newName, int newAge) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Person person = entityManager.find(Person.class, id);
        if (person != null) {
            person.setName(newName);
            person.setAge(newAge);
            entityManager.getTransaction().commit();
            System.out.println("Person updated: " + person);
        } else {
            System.out.println("Person not found for ID: " + id);
        }
        entityManager.close();
    }

    public void deletePerson(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Person person = entityManager.find(Person.class, id);
        if (person != null) {
            entityManager.remove(person);
            entityManager.getTransaction().commit();
            System.out.println("Person deleted: " + person);
        } else {
            System.out.println("Person not found for ID: " + id);
        }
        entityManager.close();
    }

    public void close() {
        entityManagerFactory.close();
    }
}
