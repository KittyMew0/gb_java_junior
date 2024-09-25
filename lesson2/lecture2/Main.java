package geekbrains_course.java_junior.lesson2.lecture2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sun.jdi.Field;
import com.sun.jdi.Method;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> car = Class.forName("Car");
		Constructor<?>[] constructors = car.getConstructors();
		
		//Car car = new Car("BMW");
		//System.out.println(constructors);
		
		Object gaz = constructors[0].newInstance("GAZ");
		System.out.println(gaz);
		
		java.lang.reflect.Field[] fields = gaz.getClass().getFields();
		int tmp = fields[fields.length - 1].getInt(gaz);
		fields[fields.length - 1].setInt(gaz, tmp *= 2);
		
		System.out.println();
		
		java.lang.reflect.Method[] methods = gaz.getClass().getDeclaratedMethods();
		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
	}
	
}
