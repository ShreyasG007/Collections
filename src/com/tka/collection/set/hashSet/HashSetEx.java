package com.tka.collection.set.hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();
		

		hashSet.add("Shreyas");
		hashSet.add("Rajashree");
		hashSet.add("Nitish");
		hashSet.add("Atish");
		hashSet.add("Dhanashree");
		hashSet.add("Sakshi");
		hashSet.add("Janhvi");
		hashSet.add("Aarti");

		System.out.println(hashSet);

		System.out.println(hashSet.size());

		Iterator<String> iterator = hashSet.iterator();
		boolean status = false;
		while (iterator.hasNext()) {
			String string = (String) iterator.next();

			if (string.equals("Shreyas")) {
				status = true;
				break;
			}
		}

		if (status) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}

		boolean contains = hashSet.contains("Rajashree");
		System.out.println(contains);

		List<String> asList = Arrays.asList("Shreyas", "Yogesh");

		boolean containsAll = hashSet.containsAll(asList);
		System.out.println(containsAll);

		Object hashSet2 = hashSet.clone();
		System.out.println(hashSet2);
		
		List<String> asList2 = Arrays.asList("aa","bb","cc");
		HashSet<String> hashSet3 = new HashSet<>(asList2);
		
		System.out.println(hashSet3);
		hashSet3.clear();
		System.out.println(hashSet3);
		
		System.out.println(hashSet3.size());
		
		System.out.println(hashSet3.isEmpty());

	}

}
