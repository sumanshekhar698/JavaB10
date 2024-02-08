package com.java.oops.collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {

		ArrayDeque<Integer> stack = new ArrayDeque<>();// LIFO FILO
		stack.addLast(6);
		stack.addLast(16);
		stack.addLast(-6);
		stack.addLast(4336);
		stack.addLast(643);

		System.out.println(stack.peekLast());

		while (!stack.isEmpty()) {
			System.out.println(stack.removeLast());
		}

		ArrayDeque<Integer> queue = new ArrayDeque<>();// LILO FIFO
		queue.addLast(6);
		queue.addLast(16);
		queue.addLast(-6);
		queue.addLast(4336);
		queue.addLast(643);
		System.out.println(queue);

		System.out.println(queue.peekFirst());

		while (!queue.isEmpty()) {
			System.out.println(queue.removeFirst());
		}
	}

}
