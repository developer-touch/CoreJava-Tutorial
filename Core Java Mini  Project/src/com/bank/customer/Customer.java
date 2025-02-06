//Main method class (Custmor)
package com.bank.customer;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) 
    {
        FirstService b=new FirstService();
        b.bankDetail();
        
        int ch;
        System.out.println("1. Deposite:");
        System.out.println("2. Withdraw:");
        System.out.println("3. checkBalance:");

        System.out.println("Enter Your Choice:-");
        Scanner s2=new Scanner(System.in);
        ch=s2.nextInt();

        switch (ch) 
        {
            case 1: b.Deposite();
            break;
            case 2: b.Withdraw();
            break;
            case 3: b.checkBal();
            break;
            default: System.out.println("Invalid Choice.....");
        }
    }
}
