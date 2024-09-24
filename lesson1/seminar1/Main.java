package geekbrains_course.java_junior.lesson1.seminar1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.*;

//�������� ���������, ������� ���������� Stream API ��� ��������� ������ �����. 
//��������� ������ ������� �� ����� ������� �������� ���� ������ ����� � ������.

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		OptionalDouble average = list.stream()
				.filter(number -> number % 2 == 0)
				.mapToDouble(number -> number)
				.average();
		System.out.println(average);
	}
}
