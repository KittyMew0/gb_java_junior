package geekbrains_course.java_junior.lesson3.lecture3;

import java.io.*;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws Exception {
//		String str = "hi everyone";
//		FileOutputStream fileOutputStream = new FileOutputStream("serialized_object"); 
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); 
//		objectOutputStream.writeObject(str); 
//		objectOutputStream.close();
		
//		FileInputStream fileInputStream = new FileInputStream("serialized_object"); 
//		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); 
//		String s = (String) objectInputStream.readObject(); 
//		System.out.println(s);
//		objectInputStream.close();
		
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(Character.getName(i));
		}
		serialObj(list, "file");
		
		ArrayList<String> list2 = null; 
		list2 = (ArrayList<String>) deSerialObj("file"); 
		System.out.println(list2);
		
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
}
