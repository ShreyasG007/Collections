package com.tka.collection.set.treeSet;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		
		return Integer.compare(stud1.getRollNumber(), stud2.getRollNumber());
	}
	
}
