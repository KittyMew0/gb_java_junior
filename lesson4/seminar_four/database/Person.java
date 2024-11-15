package geekbrains_course.java_junior.lesson4.seminar_four.database;

import javax.persistence.*;

@Entity
@Table(name = "person")

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "Name")
    public String Name;

    @Column(name = "age")
    public int age;

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String fName) {
        this.Name = fName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}