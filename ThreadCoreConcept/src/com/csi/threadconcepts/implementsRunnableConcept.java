package com.csi.threadconcepts;

class ImplThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("CSI PUNE");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class implementsRunnableConcept {
	public static void main(String[] args) {
		ImplThread il = new ImplThread();
		Thread t1 = new Thread(il);
		t1.start();
	}
}
