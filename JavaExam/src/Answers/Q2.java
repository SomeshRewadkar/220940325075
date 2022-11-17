package Answers;

import java.util.*;

class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
class BankAccount
{
	int accno;
	double balance;
	
	public BankAccount(int accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	void show()
	{
		System.out.println("Account no. is = \n"+accno+" Account Balance is = \n"+balance);
	}
	void deposit(double amt)
	{    
		
		System.out.println("Amount deposited successfully : \n"+amt+"\n Current balance :"+(balance+amt));
	}
	void withdraw(double amt)
	{  if (amt<balance)
	{
		System.out.println("Amount withdrawn successfully : \n"+amt+"\n Current balance :"+(balance-amt));
	} else {  System.out.println("Insufficient balance");}
	}
	
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", balance=" + balance + "]";
	}
}
public class Q2 {

	public static void main(String[] args) 
	{  Scanner scan = new Scanner(System.in);
	BankAccount somesh = new BankAccount(001,2000);
	
	    System.out.println("Enter amt to withdrawn :");	    
	    try {
	    	double m = scan.nextDouble();
	    	if(somesh.balance<m)
	    	{
	    		throw new InsufficientBalanceException("Insufficient balance exception occured :");
	    	}
	    }
	    
	    catch(InsufficientBalanceException ex) { System.out.println(ex.getMessage()); };
	}
}
