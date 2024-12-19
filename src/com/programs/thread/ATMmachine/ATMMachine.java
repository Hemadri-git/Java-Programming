package com.programs.thread.ATMmachine;

public class ATMMachine {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Depositor depositor = new Depositor(account);
		depositor.setName("depositor");
		
		Drawer drawer = new Drawer(account);
		drawer.setName("drawer");
		
		depositor.start();
		drawer.start();
		
		try {
			depositor.join();
			drawer.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("final balance : " + account.balance);


	}
}
