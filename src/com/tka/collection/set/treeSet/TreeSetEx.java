package com.tka.collection.set.treeSet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 4, 6, 2, 8));

		treeSet.add(3);

		System.out.println(treeSet);

		for (Iterator<Integer> iterator = treeSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);

		}

		Iterator<Integer> iterator = treeSet.iterator();
		boolean status = false;
		while (iterator.hasNext()) {
			int num = (Integer) iterator.next();

			if (num == 4) {
				status = true;
				break;
			}
		}

		if (status) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
		
		System.out.println(treeSet.contains(3));
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);
		
		List<Integer> asList = Arrays.asList(3,1,77,88);
		
		System.out.println(treeSet.containsAll(asList));
		
		System.out.println(treeSet.containsAll(descendingSet));
		
		System.out.println(treeSet.size());
		
		System.out.println(treeSet.last());
		
		System.out.println(treeSet.isEmpty());

		System.out.println(treeSet.first());
	}
}
