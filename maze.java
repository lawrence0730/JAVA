package practicePkg;

import java.util.Random;

public class maze {

	static int[][] maze = {
			{2,2,2,0,2,2,2},
			{0,0,0,0,0,0,2},
			{2,0,2,0,2,0,0},
			{0,0,0,2,0,2,2},
			{2,2,0,2,0,2,2},
			{2,0,0,0,0,0,2},
			{2,2,0,2,2,0,2}
	};
	
	static String[][] path = {
			{"2","2","2","0","2","2","2"},
			{"0","0","0","0","0","0","2"},
			{"2","0","2","0","2","0","0"},
			{"0","0","0","2","0","2","2"},
			{"2","2","0","2","0","2","2"},
			{"2","0","0","0","0","0","2"},
			{"2","2","0","2","2","0","2"}
	};
	
	static class Detect {

		static boolean roundresult[] = {false, false, false, false}; // {up,down,left,right}
		
		static void trypath(int row, int colum)
		{
			if(row+1 <= maze.length)
			{
				if(maze[row+1][colum] == 2) //up
				{
					Detect.roundresult[0] = false;
				} else {
					Detect.roundresult[0] = true;
				}	
			}
			
			if(row>0)
			{
				if(maze[row-1][colum] == 2) // down
				{
					Detect.roundresult[1] = false;
				} else {
					Detect.roundresult[1] = true;
				}	
			}
			
			if(colum > 0){
				if(maze[row][colum-1] == 2) //left
				{
					Detect.roundresult[2] = false;
				} else {
					Detect.roundresult[2] = true;
				}
			}
			
			if(colum+1 <= maze[0].length)
			{
				if(maze[row][colum+1] == 2) // right
				{
					Detect.roundresult[3] = false;
				} else {
					Detect.roundresult[3] = true;
				}
			}

		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int j=0;
		Random random = new Random();
		
		while(true)
		{
			if(i==1 && j==0)
			{
				path[i][j] = "*";
//				break;
			}
			
			Detect.trypath(i,j);
			
			while(true)
			{
				int tmp = random.nextInt(4);
//				System.out.println(tmp);
				if(Detect.roundresult[tmp])
				{
					switch(tmp)
					{
						case 0: // up
							i=i+1;
							break;
						case 1: // down
							if(i>0) 
								i=i-1;
							break;
						case 2: // left
							if(j>0)
								j=j-1;
							break;
						case 3: // right
							j=j+1;
							break;
					}
					
					path[i][j] = "-";
					
					break;
				}
			}
//			System.out.println(i + "/" + j);
			if(i == maze.length-1 || j == maze[0].length-1)
			{
				path[i][j] = ">";
				break;	
			}
			
		}
		
		for(int ii=0; ii<path.length; ii++) // print row
		{
			for(int jj=0;jj<path[0].length;jj++) // print column
			{
				System.out.print(path[ii][jj] + " ");
				
				if(jj == maze[0].length-1) 
					System.out.println("");
				
			}
		}
		
	}

}
