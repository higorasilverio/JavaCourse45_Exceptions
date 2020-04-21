package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exceptions.WithdrawError;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = input.nextInt();
		System.out.print("Holder: ");
		input.nextLine();
		String holder = input.nextLine();
		System.out.print("Initial balance: ");
		double balance = input.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = input.nextDouble();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = input.nextDouble();
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f", acc.getBalance());
		}
		catch (WithdrawError e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		input.close();
	}

}
