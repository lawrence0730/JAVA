package practicePkg;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
		System.out.println("List " + i + " fibonacci number.");
		int count = 0;
		int front = 0;
		int next = 1;
		int fib = 0;
		while(true){
			
			if(count == 0 )
			{	
				System.out.print(" " + front);
			}
			if(count == 1)
			{
				System.out.print(" " + next);
			}
			if(count >= 2)
			{
				fib = front + next;
				front = next;
				next = fib;
				System.out.print(" " + fib);
			}
			
			count++;
			if(count == i) break;
		}
	}

}
