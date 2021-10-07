package com.csi.threadconcepts;

class ExThread extends Thread {
	public void run() {
		System.out.println("CSI PUNE");
	}
}

public class ExtendsThreadException {
	public static void main(String[] args) {
		ExThread t1 = new ExThread();
		t1.run();
		
	}
}
