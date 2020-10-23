package BankingPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BankingApplication {
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Account abc = new Account();       
		
		File f = new File("bank.txt");
		if(! f.exists() ) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f,true);
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		
		
			
					
		
		
		abc.balance = 2000;        
		abc.accountNo = 111; 
		
		System.out.println("Enter your Choice");
		System.out.println("1. Check Balance " + "\n" + "2. Deposit Money" + "\n" + "3. Withdraw Money" + "\n" + "4. Get Bank Statement " );
		int a = sc.nextInt(); 
		
		if(a == 1) {
			abc.displayBalance();
			fw.write("Balance Check - Balance : Rs " + abc.balance);
			fw.close();
		}
		else if(a == 2) {
			System.out.println("Enter Amount to deposit : ");
			int amt = sc.nextInt();
			int ab = abc.deposit(amt);
			fw.write("Acoount Credited - Credit : Rs " + amt + "Balance : " + ab );
			fw.close();
			
		}
		else if(a == 3) {
			System.out.println("Enter Amount to withdraw : ");
			int amt1 = sc.nextInt();
			int ab1 = abc.withdraw(amt1);
			fw.write("Acoount Debited - Debit : Rs " + amt1 + "Balance : " + ab1);
			fw.close();
		}
		
		else if(a == 4) {
			int x;
			while((x = br.read()) != -1) {
				System.out.print((char)x);
				
			}
			fr.close();
			br.close();
			
		}
		
	}

}
