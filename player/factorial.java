/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int m,n=1;
		Scanner sc=new Scanner(System.in);
			m = sc.nextInt();
			for(int i=m;i>1;i--){
				n=n*i;
			}
			System.out.print(n);
			
		
	}
}
