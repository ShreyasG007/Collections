package com.tka.collection.set.treeSet;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_CustomObjects {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice age | name | rollno");
		String choice = sc.next();

		switch (choice) {
		case "age":
			treeSet = new TreeSet<>(new AgeComparator());
			break;

		case "name":
			treeSet = new TreeSet<>(new NameComparator());
			break;

		case "rollno":
			treeSet = new TreeSet<>(new RollNoComparator());
			break;

		default:
			treeSet = new TreeSet<>(new AgeComparator());
			break;
		}

		treeSet.add(new Student(101, "Shreyas", 25));
		treeSet.add(new Student(102, "Dhanashree", 24));
		treeSet.add(new Student(103, "Neha", 23));
		treeSet.add(new Student(104, "Akash", 27));
		treeSet.add(new Student(105, "Shubham", 21));

		for (Iterator<Student> iterator = treeSet.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student);

		}
		
		sc.close();
	}
}
