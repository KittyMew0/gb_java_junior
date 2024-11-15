package geekbrains_course.java_junior.lesson4.seminar_four.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Database {
    public static final String URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "admin";
    public static final String PASSWORD = "admin";

    public static void connector() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        SessionFactory sf = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

    }


}