package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Student> courseA = new HashSet<>();
		Set<Student> courseB = new HashSet<>();
		Set<Student> courseC = new HashSet<>();
		Set<Student> all = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();

		setAddStudent(courseA, n);
		all.addAll(courseA);

		System.out.print("How many students for course B? ");
		n = sc.nextInt();

		setAddStudent(courseB, n);
		all.addAll(courseB);

		System.out.print("How many students for course C? ");
		n = sc.nextInt();

		setAddStudent(courseC, n);
		all.addAll(courseC);

		System.out.println("Total students: " + all.size());

		sc.close();
	}

	public static void setAddStudent(Set<Student> set, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("ID#: ");
			Integer id = sc.nextInt();
			set.add(new Student(id));
		}

	}

}
