package practicePkg;

public class maxFactor {

	static int factor;
	
	static void getFactor(int max, int min)
	{
		int tmp=1;
		while(true)
		{
			// try each number
			if(((max%tmp) == 0) && ((min%tmp) == 0))
			{
				
				factor = tmp;
				System.out.print(" " + factor);
			}
			tmp++;
			if(tmp > min) break;
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		int m = 1000;
		int n = 495;
		
		if(m>n)
		{
			getFactor(m,n);
		} else if (n<m)
		{
			getFactor(m,n);
		} else System.out.println("Invalid number!!!");
		System.out.println(" *** Factor : " + factor);
	}

}
