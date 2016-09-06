package practicePkg;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class cashCard {
	
	String number;
	int balance;
	int bonus;
	
	cashCard(String nbr, int blc, int bns)
	{
		this.number = nbr;
		this.balance = blc;
		this.bonus = bns;
	}
	
	void store(int money)
	{
		System.out.println("Store : " + money);
		if(money>0)
		{
			this.balance += money;
			if(money >= 1000)
			{
				this.bonus++;
			}
		} else if(money == 0 || money < 0)
		{
			System.out.println(" Warming : Invalid store number.");
		}
	}
	
	void charge(int money)
	{
		System.out.println("Charge : " + money);
		if(money>0)
		{
			this.balance += money;
			if(money <= this.balance)
			{
				this.bonus -= money;;
			} else System.out.println("Money not enough, currently remain : " + this.balance);
			
		} else if(money == 0 || money < 0)
		{
			System.out.println(" Warming : Invalid charge number.");
		}
	}
	
	int exchange(int bonus)
	{
		System.out.println("Exchange : " + bonus);
		if(bonus > 0)
		{
			this.bonus -= bonus;
		}
		return this.bonus;
	}
}

public class CashAPP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Hey! Do you want to store money?Just typing the number:");
			
			cashCard card1 = new cashCard("A001", 500, 3);
			card1.store(sc.nextInt());

			System.out.print("Which goods do u want buy? 1. iphone(price:100) 2. ear plug(price:50) 3. car(price:500)");
			switch(sc.nextInt())
			{
			case 1:
				System.out.println("You select iphone.");
				card1.charge(100);
				break;
			case 2:
				System.out.println("You select ear plug.");
				card1.charge(50);
				break;
			case 3:
				System.out.println("You select car.");
				card1.charge(500);
				break;
				default:
					System.out.println("You did a wrong select or selection not exist!");
				break;
			}
			
			System.out.println("Thank you for the purchase! Hope we can service you again.");
			
		} catch(InputMismatchException iExcp){
			System.out.println(iExcp.getMessage());
		} catch(NoSuchElementException noExcep){
			System.out.println(noExcep.getMessage());
		} catch(IllegalStateException illExcep){
			System.out.println(illExcep.getMessage());
		}

	}

}
