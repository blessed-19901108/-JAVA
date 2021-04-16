package hello;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int [][] board = new int [SIZE][SIZE];
		boolean gotResult = false;//得到结果
		int numofO = 0;//记下0的个数
		int numofX = 0;//记下1的个数
		
		//读入矩阵
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		//检查行
		for(int i=0;i<SIZE;i++)
		{
			for(int j=0;j<SIZE;j++)
			{
				if(board[i][j]==1)
				{
					numofX++;     //如果是1则numFX加1
				}
				else      
				{
					numofO++;     //如果是0则numfO加1
				}
			}
			if(numofO==SIZE||numofX==SIZE)//判断一行内是否出现SIZE个0或1
			{
				gotResult = true;
				break;
			}
			numofO=0;//计数器清零
			numofX=0;
		}
		
		//检查列
		if(!gotResult)
		{
			numofO=0;
			numofX=0;
			for(int j=0;j<SIZE;j++)   //i,j的先后和下面的board[i][j]有关
			{
				for(int i=0;i<SIZE;i++)
				{
					if(board[i][j]==1)
					{
						numofX++;     //如果是1则numFX加1
					}
					else      
					{
						numofO++;     //如果是1则numfO加1
					}
				}
				if(numofO==SIZE||numofX==SIZE)
				{
					gotResult = true;
					break;
				}
				numofO=0;//计数器清零
				numofX=0;
			}
		}
		
		//检查对角线
		if(!gotResult)
		{
			numofO = 0;
			numofX = 0;
			for(int i = 0;i<SIZE;i++)
			{
				if(board[i][i]==1)
				{
					numofX++;
				}
				else
				{
					numofX++;
				}
			}
			if(numofX==SIZE||numofO==SIZE)
			{
				gotResult = true;
			}
		}
		
		//检查反对角线
		if(!gotResult)
		{
			numofO = 0;
			numofX = 0;
			for(int i = 0;i<SIZE;i++)
			{
				if(board[i][SIZE-i-1]==1)
				{
					numofX++;
				}
				else
				{
					numofX++;
				}
			}
			if(numofX==SIZE||numofO==SIZE)
			{
				gotResult = true;
			}
		}
		if(gotResult)
		{
			if(numofX==SIZE)
			{
				System.out.println("X");
			}
			else if(numofO==SIZE)
			{
				System.out.println("O");
			}
		}
		else
		{
			System.out.println("NIL");
		}
	}

}
