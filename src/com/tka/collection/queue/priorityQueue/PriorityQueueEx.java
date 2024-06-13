package com.tka.collection.queue.priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {

		
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		
		queue.add(6);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);

		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		System.out.println(queue);
		
		System.out.println("First Position : "+queue.element());

		for (Iterator<Integer> iterator = queue.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();

			System.out.println(integer);

		}

		System.out.println("size : " + queue.size());
		
		Queue<Integer> queue2 = new ArrayBlockingQueue<>(3);
		//System.out.println(queue2.remove());
		System.out.println(queue2.poll());
		
		//queue2.element();
		System.out.println(queue2.peek());
		
		Queue<Integer> queue3 = new ArrayBlockingQueue<>(3);
		queue3.add(7);
		queue3.add(6);
		queue3.add(5);
		queue3.offer(4);
		
		System.out.println(queue3);
		
		System.out.println(queue3.remove());
		System.out.println(queue3.remove());
		System.out.println(queue3.remove());
		
	

	}

}
