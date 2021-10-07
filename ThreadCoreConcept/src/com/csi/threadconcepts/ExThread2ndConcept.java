package com.csi.threadconcepts;
class ExData extends Thread{
	public void run(){
		int i;
		for(i=1;i<=10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ExThread2ndConcept {
public static void main(String[] args) {
	ExData t1= new ExData();
	t1.start();
	t1.start();
}
}
