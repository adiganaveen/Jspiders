package com.capgemini.java8;
class Program3
{
	public static void main(String[] args) 
	{
		int n=11;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<=n/2;col++)
			{
				if(row==0||col==0||row==n/2||col==n/2)
					System.out.print("* ");
				
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
	}
}


//* * * * * *
//*         *
//*         *
//*         *
//*         *
//* * * * * *
//*         *
//*         *
//*         *
//*         *
//*         *