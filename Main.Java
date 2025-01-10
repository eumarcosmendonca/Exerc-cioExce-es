package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import Exceptions.MainException;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: R$ ");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: R$ ");
		Double withdrawLimit = sc.nextDouble();
			
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
		System.out.print("Enter amount for withdraw: R$ ");
		Double withdraw = sc.nextDouble();
		
		try {
			account.withdraw(withdraw);
			System.out.print("Balance Updated: R$ " + account.getBalance());
		}
	
		catch (MainException msg) {
			System.out.println(msg.getMessage());
		}
		
		sc.close();
		
	}

}
