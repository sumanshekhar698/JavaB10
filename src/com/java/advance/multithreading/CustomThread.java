package com.java.advance.multithreading;

public class CustomThread extends Thread {

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
