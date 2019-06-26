package com.capgemini.java8;
class Triangle5
{
	public static void main(String[] args) 
	{
		int n=6;
		for(int row=0;row<n;row++)
		{
			for(int col=0;row>=col;col++)
			{
					System.out.print("#");	
			}
			System.out.println();
		}
	}
}

//row>=col
//#
//##
//###
//####
//#####
//######