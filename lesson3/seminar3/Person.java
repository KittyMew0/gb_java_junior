package geekbrains_course.java_junior.lesson3.seminar3;

import java.io.*;

//Задание 1: Создайте класс Person с полями name и age. Реализуйте сериализацию и 
//десериализацию этого класса в файл.

public class Person implements Serializable {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}

	public void serialize(String filename) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(this);
			System.out.println("Object has been serialized to " + filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Person deserialize(String filename) {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))) {
			return (Person) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Alice", 25);
		person.serialize("person.ser");

		Person deserializedPerson = Person.deserialize("person.ser");
		System.out.println("Deserialized Person: " + deserializedPerson);
	}
}


