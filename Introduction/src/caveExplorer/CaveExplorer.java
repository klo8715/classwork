package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static caveRoom caves[][];
	public static Scanner in;
	public static caveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args)
	{
		Connect4.play();
		in=new Scanner(System.in);
		caves= new caveRoom[5][5];
		for( int row =0; row< caves.length; row++)
		{
			//in each row go by col by col
			for(int col = 0; col<caves[row].length;col++)
			{
				caves[row][col] = new caveRoom("This cave has coordinates "+row+col);
			}
		}
		currentRoom = caves [0][1];
		currentRoom.enter();
		caves[0][1].setConnection(caveRoom.EAST,caves[0][2],new Door());
		caves[0][2].setConnection(caveRoom.SOUTH,caves[1][2],new Door());
		caves[1][2].setConnection(caveRoom.SOUTH,caves[2][2],new Door());
		inventory = new Inventory();
		startExploring();
	}

	private static void startExploring()
	{
		while(true)
		{
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("what would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
			
		}
	}
	
}
