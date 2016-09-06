package practicePkg;

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
}

public class CashAPP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cashCard[] cards = {
				new cashCard("A001", 100, 1),
				new cashCard("A002", 200, 2),
				new cashCard("A003", 300, 3),
				new cashCard("A004", 500, 4),
				new cashCard("A005", 500, 5)
		};
		
		int i=0;
		while(true)
		{
			System.out.print(cards[i].number + " ");
			System.out.print(cards[i].balance + " ");
			System.out.println(cards[i].bonus);
			i++;
			if(i==cards.length) break;
		}
	}

}
