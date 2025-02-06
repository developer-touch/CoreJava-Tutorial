//FirstService class
package com.bank.customer;

import java.util.Scanner;

public class FirstService extends First {
	 private double bal = 5000;
	    private int pwd;
	    public double money;

	    public void Deposite()
	    {
	        System.out.println("Enter Your Password:-");
	        Scanner s=new Scanner(System.in);
	        pwd=s.nextInt();

	        if (pwd==123)
	        {
	            System.out.println("Enter Your Deposite Amount:-");
	            money=s.nextDouble();
	            bal=bal+money;
	            System.out.println("Your Deposite Money:-"+money);
	            System.out.println("Your Total Balance:-"+bal); 
	        }
	        else
	        {
	            System.out.println("Incorrect Password......");
	        }
	    }
	    public void Withdraw()
	    {
	        System.out.println("Enter Your Password:-");
	        Scanner s=new Scanner(System.in);
	        pwd=s.nextInt();

	        if (pwd==123)
	        {
	            System.out.println("Enter Your Withdraw Amount:-");
	            money=s.nextDouble();
	            bal=bal-money;
	            System.out.println("Your Withdraw Money:-"+money);
	            System.out.println("Your Total Balance:-"+bal); 
	        }
	        else
	        {
	            System.out.println("Incorrect Password......");
	        }
	    }
	    public void checkBal()
	    {
	        System.out.println("Enter Your Password:-");
	        Scanner s=new Scanner(System.in);
	        pwd=s.nextInt();

	        if (pwd==123)
	        {
	            System.out.println("Your Total Balance:-"+bal); 
	        }
	        else
	        {
	            System.out.println("Incorrect Password......");
	        }
	    }
}
