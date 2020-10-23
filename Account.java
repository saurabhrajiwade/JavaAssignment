package BankingPackage;

public class Account {
	public static int balance;     
	public static int accountNo;   
	
	void displayBalance() {        
		System.out.println("The Balance of Account No. " + accountNo + " is Rs."+ balance);  
	}     
	
	synchronized int deposit(int amount) {         
		balance = balance + amount;        
		System.out.println("Rs " + amount + " has been successfully deposited.");         
		displayBalance();   
		return balance;
		
	}
	
    synchronized int withdraw(int amount) {       
    	balance = balance - amount;         
    	System.out.println("Rs "+ amount + " has been withdrawn from account.");         
    	displayBalance();     
    	return balance;
    }  

}
