package practicePkg;


class guanchihao {
	private int height;
	private String[] loveExercise;
	private String Job;
	
	public guanchihao(int ht)
	{
		this.height = ht;
		System.out.println("Guan, chi hao height : " + this.height + " cm");
	}
	
	public guanchihao(String[] Lexercise)
	{
		this.loveExercise = Lexercise;
		System.out.println("Guan, chi hao love : ");
		int i=0;
		while(true)
		{
			System.out.print(" "+ this.loveExercise[i]);
			i++;
			if(i == this.loveExercise.length) {
				System.out.print("\n");
				break;
			}
		}
	}
	
	public guanchihao(String JB)
	{
		this.Job = JB;
		System.out.println("Guan, chi hao's work : " + this.Job);
	}

	public guanchihao() {
		System.out.println("This constructor not initialize...");
	}
}

public class overload {
	
	public static void main(String[] args) {
		guanchihao ch_1 = new guanchihao(175);
		String[] love = {"basketball", "hiking", "swimming", "jogging", "softball"};
		guanchihao ch_2 = new guanchihao(love);
		guanchihao ch_3 = new guanchihao("Mitac BIOS engineer");
	}

}
