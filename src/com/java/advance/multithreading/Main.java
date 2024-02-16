package com.java.advance.multithreading;

public class Main {

	public static void main(String[] args) {// main thread
		System.out.println("START");
		System.out.println(Thread.currentThread() + "Line 7");

//		for (int i = 0; i < 10; i++) {
//			try {
//				System.out.println(Thread.currentThread());
//				Thread.sleep(300);// 0.3 secon
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//		

		CustomThread t1 = new CustomThread();
		t1.setName("t1");
		t1.setPriority(7);// 1 -10 by default 5
		t1.start();

		CustomThread t2 = new CustomThread();
		t2.start();

		CustomThread t3 = new CustomThread();
		t3.start();

		Thread t4 = new Thread(new Work());
		t4.start();

		Thread t5 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i + " " + Thread.currentThread());
					Thread.sleep(300);// 0.3 secon
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
//				System.out.println(i);
			}
		});
		t5.start();
		
//		t5.start();
		System.out.println(Thread.currentThread() + " last line");
		System.out.println("END");

	}

}

class Work implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(i + " " + Thread.currentThread());
				Thread.sleep(300);// 0.3 secon
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println(i);
		}
	}

}
