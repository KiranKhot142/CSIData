package com.csi.threadcore;

class myThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("CSI PUNE");
	}
}

class myThread2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Full Stack");
	}
}

class myThread3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("React JS");
	}
}

public class ThreadPrioritiyConcept {
	public static void main(String[] args) {

		myThread1 t1 = new myThread1();
		myThread2 t2 = new myThread2();
		myThread3 t3 = new myThread3();

		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
