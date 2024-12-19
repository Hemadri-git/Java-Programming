package com.programs.thread.ATMmachine;

public class Depositor extends Thread {

	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		int []deposits = {1000, 2000, 3000};
		
		for(int deposit : deposits) {
			account.deposit(deposit);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
