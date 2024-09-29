package geekbrains_course.java_junior.lesson3.seminar3;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        personDAO.addPerson(person1);
        personDAO.addPerson(person2);

        personDAO.updatePerson(1L, "Alice Updated", 26);
        personDAO.deletePerson(2L);

        personDAO.close();
    }
}
