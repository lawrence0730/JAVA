package practicePkg;

class sigma {
	public static int sum(int ... numbers)
	{
		int sum = 0;
		for(int num : numbers)
		{
			sum = sum + num;
		}
		return sum;
	}
} 

public class MathTool {
	public static void main(String[] args) {
		System.out.println(sigma.sum(1,2,3,4));
	}

}
