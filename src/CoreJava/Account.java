package CoreJava;
import java.util.*;
import java.text.DecimalFormat;
public class Account {
	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0.0;
	private double savingBalance = 0.0;
	
	 Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//Calculate Withdraw and Deposit for Current and Savings Account
	
	public double calcCurrentWithdraw(double amount) {
		currentBalance = (currentBalance - amount);
		return currentBalance;
	}
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCurrentDeposit(double amount) {
		currentBalance = (currentBalance + amount);
		return currentBalance;
	}
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	//Bigger function used in option menu class
	
	public void getCurrentWithdrawInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.println("Amount you want to Withdraw from Current Account");
		double amount = input.nextDouble();
		
		if((currentBalance - amount) >= 0) {
			calcCurrentWithdraw(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
		}else {
			System.out.println("insufficient balance");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Withdraw from Saving Account");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("insufficient balance");
		}
	}
	
	public void getCurrentDepositInput() {
		System.out.println("Current Account Balance: " + moneyFormat.format(currentBalance));
		System.out.println("Amount you want to Deposit into Checking Account");
		double amount = input.nextDouble();
		
		if((currentBalance + amount) >= 0) {
			calcCurrentDeposit(amount);
			System.out.println("New Current Account Balance: " + moneyFormat.format(currentBalance));
		}else {
			System.out.println("Balance cannot be Negative");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to Deposit into Saving Account");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance cannot be Negative");
		}
	}
}
