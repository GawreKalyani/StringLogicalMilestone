package string;

import java.util.Scanner;

public class String2Reverse {
public static void main(String[] args) {
	String  str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:"); //hello
	str=sc.next();
	sc.close();
	
	char ch[]=str.toCharArray();
	
	System.out.println("Reverse of string:");
	for(int i=ch.length;i>0;i--)				//5 5>0 ch[4] =o ,4 4>0 ch[3]=l
	{
		System.out.print(ch[i-1]);
	}
}
}
