package com.csi.threadcore;

class customer {
	int accountBalance = 10000;

	synchronized public void withdrawMoney(int amount) {

		System.out.println("Going to withdraw -> INR 15000/-");
		if (this.accountBalance < amount) {
			System.out.println("Ïnsufficient Funds Please wait to deposit Money");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.accountBalance -= accountBalance;

		System.out.println("Final Account Withdrawn Successfully");
	}

	synchronized public void depositMoney(int amount) {

		System.out.println("Going to deposit Money INR 25000/-");

		this.accountBalance += accountBalance;
		System.out.println("Money Deposited Successfully");
		notifyAll();

	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {

		customer cc = new customer();
		new Thread() {
			public void run() {
				cc.withdrawMoney(15000);
			};

		}.start();
		new Thread() {
			public void run() {
				cc.depositMoney(25000);
			};
		}.start();

	}
}