package caveExplorer;

import java.util.Scanner;

public class connect4 {
	private static String[][] board;
	private static Scanner scanner;
	public static void main(String[] args)
	{
		board = new String[7][7];
		scanner = new Scanner(System.in);
		for(int i=0;i<board.length;i++)
		{
			for(int j=0; j<board[i].length;j++)
			{
				board[i][j]=(" ");
			}
		}
		printBoard();
		while (true)
		{
			userInput();
		}
		
	}
	public static void printBoard()
	{
		for(int i=board.length - 1;i> -1; i--) 
		{
			for(int j=0; j<board[i].length;j++)
			{
				System.out.print(board[j][i] + " ");
			}
			System.out.println();
		}
	}
	public static void userInput()
	{
		System.out.println("What columns do you want to put it in");
		String input = scanner.nextLine();
		while (!input.matches("[0-6]")) {
			System.out.println("Error bad input");
			
			input = scanner.nextLine();
		}
		
		int in = Integer.valueOf(input);
		
		while(checkIfColumnIsFilled(in))
		{
			System.out.println("the column is filled ");
			in = scanner.nextInt();
		}
		int top = findTheTop(in);
		
		board[in][top]=("o");
		printBoard();
		
		
		
		
	}
	public static boolean checkIfColumnIsFilled(int col)
	{
		for (int i = 0; i < board[col].length;i++ )
		{
			if (board[col][i].equals(" "))
			{
				return false;
			}
		}
		return true;
	}
	public static int findTheTop(int col)
	{
		for (int i = 0; i < board[col].length;i++ )
		{
			if (board[col][i].equals(" "))
			{
				return i;
			}
		}
		return -1;
	}
	

}
