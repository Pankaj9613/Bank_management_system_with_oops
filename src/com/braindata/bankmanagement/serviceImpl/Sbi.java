package com.braindata.bankmanagement.serviceImpl;
import com.braindata.bankmanagement.model.*;
import com.braindata.bankmanagement.service.*;
import java.util.*;
public class Sbi implements Rbi{

	Scanner sc = new Scanner(System.in);
	Account a = new Account();
	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Account No");
		a.setAccNo(sc.nextInt());
		System.out.println("Enter Your Name");
		a.setName(sc.next());
		System.out.println("Enter Your Adhar no");
		a.setAdharNo(sc.next());
		System.out.println("Enter your Mobile no");
		a.setMobNo(sc.next());
		System.out.println("Enter Your Gender");
		a.setGender(sc.next());
		System.out.println("Enter Your Age");
		a.setAge(sc.nextInt());
		System.out.println("Enter your Balance");	
		a.setBalance(sc.nextDouble());
		System.out.println("Account Created Successfuly");
	}

	@Override
	public void displayAllDetails() {
		// TODO Auto-generated method stub
		System.out.println("Account Details Are:\n Account No:"+a.getAccNo()+" Name: "+a.getName()+" Adhar No: "+a.getAdharNo()+" Mobile No: "+a.getMobNo()+" Gender: "+a.getGender()+" Age is: "+a.getAge()+" Balance is: "+a.getBalance());
		
	}

	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter Money To Deposite");
		double dmoney = sc.nextInt();
		double tmoney=dmoney+a.getBalance();
		System.out.println("Money Deposited Successfuly");
		a.setBalance(tmoney);
		System.out.println("Total Account Balance is "+tmoney);
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Enter Money To Withdraw");
		double wmoney = sc.nextInt();
		double tmoney=a.getBalance()-wmoney;
		System.out.println("money withdrawn Successfully");
		a.setBalance(tmoney);
		System.out.println("Total Account Balance is "+tmoney);
		
	}

	@Override
	public void balanceCheck() {
		// TODO Auto-generated method stub
		System.out.println("Total Balance is: "+a.getBalance());
		
		
	}

}
