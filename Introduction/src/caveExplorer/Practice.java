package caveExplorer;


public class Practice {
	public static int random()
	{
		double roll = Math.random();//random double (0,1)
 		int answer = (int) (7 * roll);
		return answer+3;
	}
	public static void main(String[] args)
	{
		boolean[][] mines = new boolean[6][6];
		createMines(mines, 10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field,mines);
		printPlc(field);
//		boolean[][] grid = new boolean[16][5];
//		createBorders(grid, 16, 5);
		createMap(10,10);
		
		
	}
	private static void createMap(int row, int col){
		String[][] map = new String[row*3][col*3];
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				(map[i][j]) = " ";
			}
		}
		for(int j = 0; j < map[0].length; j++){
			for(int third = 0; third < row*3; third+=3){
				map[third][j] = "_";
			}
			//map[3][j] = "_";
			map[map.length-1][j] = "_";
		}

		for(int i = 1; i < map.length; i++){
			for(int third = 0; third < col*3; third+=3){
				map[i][third] = "|";
			}
			//map[i][0] = "|";
			map[i][map[0].length-1] = "|";
		}
		
		printPlc(map);
	}
//	private static void createBorders(boolean[][] grid, int i, int j) 
//	{
//		for(int row = 0; row<=i;row++)
//		{
//				for(int col = 0; col<=j;col++)
//				{
//					if(i%3==1)
//					{
//						grid[row][col] = true;
//					}
//				}
//		}
////		matchValues();
//	}
	
	private static void matchValues(String[][] field, boolean[][] mines)
	{
		for(int row = 0; row<field.length;row++)
		{
				for(int col = 0; col<field[0].length;col++)
				{
					if (mines[row][col])
						field[row][col]="x";
					else
					{
						field[row][col]=countAdjacent(mines,row,col);
						
					}
				}
		}
	}
	private static String countAdjacent(boolean[][] mines, int r, int c)
	{
		int count = 0;
//		for(int row = 0; row<mines.length;row++)
//		{
//			for (int col = 0; col<mines[0].length; col++)
//			{
//				if (row !=r&& col!=c)
//				{
//					if (row >=0 && row< mines.length&& col>=0&&col< mines[row].length)
//					{
//						
//					}
//				}
//			}
//		}
//		for(int row = 0; row<mines.length;row++)
//		{
//			for(int col = 0; col<mines[row].length;col++)
//			{
//				if(Math.abs(row-r)*Math.abs(col-c)==1 && mines[row][col])
//				{
//					count++;
//			}
//		}
//		return count+"";
//		}
		count+=validAndTrue(mines,r-1,c); //up
		count+=validAndTrue(mines,r+1,c); //down
		count+=validAndTrue(mines,r,c+1); //right
		count+=validAndTrue(mines,r,c-1); //left
		
		return count+"";
		
	}
	private static int validAndTrue(boolean[][] mines,int i, int j)
	{
		if (i>0 && i<mines.length && j>=0 && j<mines[i].length && mines[i][j])
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	private static void createMines(boolean[][] mines, int numberofMines) 
	{
		while(numberofMines > 0)
		{
			int row = (int)(Math.random()* mines.length);
			int col = (int)(Math.random()* mines[0].length);
			if(!mines[row][col])
			{
				mines[row][col] = true;
				numberofMines--;
			}
		}
		
	}
//	public static void picDraw()
//	{
//		//rows,columns
//				int count = 4;
//				String[][] plc = new String[10][12];
//				for( int row =0; row< plc.length; row++)
//				{
//					//in each row go by col by col
//					for(int col = 0; col<plc[row].length;col++)
//					{
//						plc[row][col] = " ";
//					}
//				}
//				while (count>0)
//				{
//					int rand = random();
//					plc[rand][rand] = "v";
//					count--;
//				}
//
//				plc[1][2] = "O";
//				plc[0][2] = "|";
//				plc[2][2] = "|";
//				plc[1][1] = "-";
//				plc[1][3] = "-";
//				plc[0][1] = "\\";
//				plc[2][3] = "\\";
//				plc[0][3] = "/";
//				plc[2][1] = "/";
//				for (int row = 7; row<plc.length; row++)
//				{
//					for(int col = 0; col<plc[row].length;col++)
//					{
//						plc[row][col] = "M";
//					} 
//				}
//				printPlc(plc);
//				
//				
//				//iterate row by row
//
//				//print contents of string[][] without using arrays.tostring
//				
//	}
	public static void printPlc(String[][]plc)
	{
		for( int row =0; row< plc.length; row++)
		{
			//in each row go by col by col
			for(int col = 0; col<plc[row].length;col++)
			{
				System.out.print(plc[row][col]);
			}
			System.out.println();
		}
	}

}
