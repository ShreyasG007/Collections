package com.tka.collection.set.treeSet;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		
		return Integer.compare(stud1.getAge(), stud2.getAge());
	}
	
}
