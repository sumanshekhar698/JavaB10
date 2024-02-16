package com.java.advance.multithreading;

public class StatesOfThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");
		System.out.println(Thread.currentThread() + "| " + Thread.currentThread().getState());

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i + " " + Thread.currentThread() + "| " + Thread.currentThread().getState());
					Thread.sleep(300);// 0.3 secon
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println("| " + t1.getState());

		t1.start();
		System.out.println("| " + t1.getState());

		t1.join();// Other thread will wait for t1 to complete
		System.out.println("| " + t1.getState());
		System.out.println(Thread.currentThread() + "| " + Thread.currentThread().getState());

		System.out.println(Thread.currentThread());
		System.out.println("END");

	}

}
