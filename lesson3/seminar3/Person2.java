package geekbrains_course.java_junior.lesson3.seminar3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Person2 {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { 
    	return name; 
    }
    
    public void setName(String name) { 
    	this.name = name; 
    }

    public int getAge() { 
    	return age; 
    }
    
    public void setAge(int age) { 
    	this.age = age; 
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
