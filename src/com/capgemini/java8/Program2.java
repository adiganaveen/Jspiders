package com.capgemini.java8;
class Program2
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				if(row==col||row+col==n-1||row==(n-1)/2||col==n/2)
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}

//output

//* * * * * * * * * * *
//* *       *       * *
//*   *     *     *   *
//*     *   *   *     *
//*       * * *       *
//* * * * * * * * * * *
//*       * * *       *
//*     *   *   *     *
//*   *     *     *   *
//* *       *       * *
//* * * * * * * * * * *