package string;

import java.util.Scanner;

public class StringSecSmall {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		char a[]=str.toCharArray(); //{d,a,n,i,l}   small=a secondsmall=d (which character is small?)
		char small=a[0];
		char secondsmall=a[0];
		for(int i=0 ; i<a.length ; i++)
		{
			if (small>a[i])
			{
				small = a[i];
			}
		}
		
		if (small==a[0])
		{
			secondsmall=a[1];
		}
		
		for(int i=0 ; i<a.length ; i++)
		{	
			if(secondsmall > a[i] && a[i] != small)
			{
				secondsmall = a[i] ;
			}
		}
		System.out.println("Small..."+small);
		System.out.println("Secondsmall..."+secondsmall);
		sc.close();
	}	
}
