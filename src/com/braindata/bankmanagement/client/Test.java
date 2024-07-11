package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.serviceImpl.*;
import com.braindata.bankmanagement.service.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rbi r = new Sbi();
		
		while(true)
		{
			System.out.println("Enter your choice:\n 1: For Create Account\n 2: For Display Details\n 3: For Deposite Money\n 4: For Withdraw Money\n 5: For Check Balance\n 6: Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				r.createAccount();
				break;
			case 2:
				r.displayAllDetails();
				break;
			case 3:
				r.depositeMoney();
				break;
			case 4:
				r.withdrawal();
				break;
			case 5:
				r.balanceCheck();
				break;
			case 6:
				System.out.println("No choice is provided");
				return;
			}
		}
	}

}
