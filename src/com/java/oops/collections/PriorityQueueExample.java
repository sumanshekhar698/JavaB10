package com.java.oops.collections;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {// give me the nth largest element in a colection

		int n = 3;
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(55);
		numList.add(5);
		numList.add(5);
		numList.add(4);
		numList.add(104);
		numList.add(4);
		numList.add(4);

		PriorityQueue<Integer> priorityQueue = new PriorityQueue();//MIN HEAP
		for (Integer integer : numList) {
			priorityQueue.add(integer);
		}

		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

	}

}
