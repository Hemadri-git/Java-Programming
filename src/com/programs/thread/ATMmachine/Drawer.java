package com.programs.thread.ATMmachine;

public class Drawer extends Thread
{
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		int []withdrawls = {100, 200, 300};
		for(int amount : withdrawls) {
			account.withdraw(amount);
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
