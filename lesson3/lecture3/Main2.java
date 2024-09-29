package geekbrains_course.java_junior.lesson3.lecture3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main2 {
	public static void main(String[] args) {
		MyFCs myFCs = new MyFCs("Ivanov", "Ivan", "Ivanovich");
		serialObj(myFCs, "ser");
	}
	
	public static void serialObj(Object o, String file) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(o);
		objectOutputStream.close();
	}
	
	public static Object deSerialObj(String file) throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return objectInputStream.readObject();
	}
	
	static class MyFCs implements Serializable {
		public String lName;
		public String fName;
		public String patronymic;
	}
	
	public MyFCs (String lName, String fName, String patronymic) {
		this.lName = lName;
		this.fName = fName;
		this.patronymic = patronymic;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s",
				fName,
				lName.toUpperCase().charAt(0),
				patronymic.toUpperCase().charAt(0));
	}
}
