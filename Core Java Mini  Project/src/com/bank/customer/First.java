//First abstract class
package com.bank.customer;

public abstract class First {

    public String Name = "Ak Bank Of India";
    public String IFSC = "AK825200";

    public void bankDetail()
    {
        System.out.println("Bank Name:-"+Name);
        System.out.println("IFSC Code:-"+IFSC);
    }
    abstract void Deposite();
    abstract void Withdraw();
    abstract void checkBal();
}
