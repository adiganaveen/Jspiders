package com.capgemini.java8;
class Triangle8
{
	public static void main(String[] args) 
	{
		int n=7;
		for(int row=0;row<n;row++)
		{
			for(int col=0 ; row+col <= n-1  ;col++)
			{
				
					System.out.print("#");	
				
			}
			System.out.println();
		}
	}
}


//row+col<=n-1
//#######
//######
//#####
//####
//###
//##
//#