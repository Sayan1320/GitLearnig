package CoreJava;

import java.io.IOException;

import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	//DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(430720, 2000);
				data.put(132015, 2002);
				
				System.out.println("Welcome to my ATM");
				System.out.println("Enter your Customer Number");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter the pin Number");
				setPinNumber(menuInput.nextInt());
			}catch (Exception e) {
				System.out.println("Invalid Charactor(s). Only Numbers");
				x=2;
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else {
				System.out.println("Wrong Customer Number or pin Number");
			
		}
		}while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select the Account you want to Access");
		System.out.println(" Type 1 - Current Account");
		System.out.println(" Type 2 - Saving Account");
		System.out.println(" Type 3 - Exit");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getCurrent();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thanks for using this ATM");
			break;
			
		case 4:
			System.out.println("Wrong Choice");
			getAccountType();
		}
	}
	
	public void getCurrent() {
		System.out.println("Current Account");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Fund");
		System.out.println(" Type 3 - Deposit Fund");
		System.out.println(" Type 4 - Exit");
		System.out.println("Choice");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Current Account Balance" + moneyFormat.format(getCurrentBalance()));
		    getAccountType();
		    break;
		    
		case 2:
			getCurrentWithdrawInput();
			getAccountType();
			break;
		      
		case 3:
			getCurrentDepositInput();
			getAccountType();
			
		case 4:
			System.out.println("Thanks for using this ATM");
			break;
			
		case 5:
			System.out.println("Wrong Choice");
			getCurrent();
		}
	}
	
	public void getSaving() {
		System.out.println("Saving Account");
		System.out.println(" Type 1 - View Balance");
		System.out.println(" Type 2 - Withdraw Fund");
		System.out.println(" Type 3 - Deposit Fund");
		System.out.println(" Type 4 - Exit");
		System.out.println("Choice");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance" + moneyFormat.format(getSavingBalance()));
		    getAccountType();
		    break;
		    
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		      
		case 3:
			getSavingDepositInput();
			getAccountType();
			
		case 4:
			System.out.println("Thanks for using this ATM");
			break;
			
		case 5:
			System.out.println("Wrong Choice");
			getSaving();
		}
	}
}

