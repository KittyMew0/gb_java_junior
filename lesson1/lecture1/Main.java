package geekbrains_course.java_junior.lesson1.lecture1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hi", "there");
		
//		list = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
//		
//		for (String item : list) {
//			System.out.println(item);
//		}
		
		list.stream().filter(str -> str.length() > 4).forEach(System.out::println);
		
//		System.out.println("Hi");
//		
//		PlainInterface plainInterface = new PlainInterface() {
//			@Override
//			public String action(int x, int y) {
//				return String.valueOf(x + y);
//			}
//		};
		
//		PlainInterface plainInterface = Integer::sum;
//				
//		PlainInterface plainInterface1 = Integer::compare;
//		
//		System.out.println(plainInterface.action(5, 3));
//		System.out.println(plainInterface1.action(5, 3));
	}
}
