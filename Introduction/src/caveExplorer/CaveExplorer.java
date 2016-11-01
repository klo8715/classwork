package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static caveRoom caves[][];
	public static Scanner in;
	public static caveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[] args)
	{
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
		caves[0][1]
	}
}
