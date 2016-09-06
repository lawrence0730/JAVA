package practicePkg;

class overloadPrac {
	void overloadPractice(int i)
	{
		System.out.println("int ..................");
	}
	
	void overloadPractice(Integer ii)
	{
		System.out.println(Integer.valueOf(ii));
	}
}

public class OverloadBoxing {
	
	public static void main(String[] args) {
		overloadPrac ovlP = new overloadPrac();
		ovlP.overloadPractice(11);
		ovlP.overloadPractice(new Integer(22));
	}

}
