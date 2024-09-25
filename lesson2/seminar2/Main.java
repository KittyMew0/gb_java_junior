package geekbrains_course.java_junior.lesson2.seminar2;

import java.lang.reflect.Constructor;

import com.sun.jdi.Method;

//»спользу€ Reflection API, напишите программу, котора€ выводит на экран все методы класса String.

public class Main {
	public static void main(String[] args) throws SecurityException {
		
		java.lang.reflect.Method[] methods = String.getClass().getMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		
	}
}
