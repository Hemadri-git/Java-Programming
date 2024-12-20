package com.programs.thread.ATMmachine;

public class Account {

	 int balance = 0;
	
	public synchronized void withdraw(int amount) {
		while(balance < amount) {
           
			try {
                System.out.println(Thread.currentThread().getName() + " waiting to withdraw: " + amount);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance = balance - amount;
        System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + ", Updated Balance: " + balance);
		notify();
	}
	

	public synchronized void deposit(int amount) {
		balance = amount + balance;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + ", Updated Balance: " + balance);
		notify();
	}
	
	
}
