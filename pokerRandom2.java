package practicePkg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class pokerCard {
	String category;
	int number;
	boolean cardExist = false;
	
	pokerCard (String c, int n)
	{
		this.category = c;
		this.number = n;
	}
	
}

public class pokerRandom2 {
	
	public static void main(String[] args) {
		String[] category = {"Flower", "Diamond", "Heart", "Pitch"};
		int[] number = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] numString = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K"};

		List<pokerCard> cardSet = new ArrayList<pokerCard>(); 
		// initial
		for(int cat=0;cat<category.length;cat++)
		{
			for(int num=0;num<number.length;num++)
			{
				pokerCard pCard = new pokerCard(category[cat], number[num]);
				cardSet.add(pCard);
			}
		}
		
//		int i=0;
		Random random = new Random();
//		while(true)
//		{
//			int random_index = random.nextInt(51);
//			if(cardSet.get(random_index).cardExist == false)
//			{
//				System.out.print(cardSet.get(random_index).category + "-" + numString[cardSet.get(random_index).number-1]);
//				cardSet.get(random_index).cardExist = true;
//				i++;
//				if(i%13 == 0) System.out.println("");
//				if(i == 51) break;
//			}
//		}
		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
		while(true)
		{
//			sc.next();
			System.out.println("Computer choose : ");
//			pokerCard userChoose = new pokerCard(sc.next(), sc.nextInt());
			int random_index = random.nextInt(51);
			if(cardSet.get(random_index).cardExist == false)
			{
				System.out.print(cardSet.get(random_index).category + "-" + numString[cardSet.get(random_index).number-1]);
				cardSet.get(random_index).cardExist = true;
			}
//			sc.next();
			try {
				System.in.read();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int user_random_index = random.nextInt(51);
			if(cardSet.get(user_random_index).cardExist == false)
			{
				System.out.print(cardSet.get(user_random_index).category + "-" + numString[cardSet.get(user_random_index).number-1]);
				cardSet.get(user_random_index).cardExist = true;
			}
			
			if(cardSet.get(random_index).number > cardSet.get(user_random_index).number)
			{
				System.out.println("User loose.");
			} else if(cardSet.get(random_index).number < cardSet.get(user_random_index).number)
			{
				System.out.println("User win.");
			} else 
			{
				int computer=0;
				int user=0;
				for(int x=0;x<category.length;x++){
					if(cardSet.get(random_index).category.equals(category[x]))
						computer = x;
					if(cardSet.get(user_random_index).category.equals(category[x]))
						user = x;
				}
				
				if(computer > user)
				{
					System.out.println("User loose.");
				} else System.out.println("User win.");
			}
			
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
