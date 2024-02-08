package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.stream.Collectors;

public class PriorityQueueDSA {

	public static void main(String[] args) {// give me the nth largest element in a colection

		int n = 3;// no duplicate should be there
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(55);
		numList.add(5);
		numList.add(5);
		numList.add(4);
		numList.add(104);
		numList.add(4);
		numList.add(4);

		Set<Integer> collect = numList.stream().collect(Collectors.toSet());

		PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());// MAX HEAP
		
		for (Integer integer : collect) {
			priorityQueue.add(integer);
		}
		
		System.out.println(priorityQueue);
		if (n < priorityQueue.size()) {
			for (int i = 1; i <= n - 1; i++) {
				priorityQueue.poll();

			}
		}
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.peek());

	}

}
