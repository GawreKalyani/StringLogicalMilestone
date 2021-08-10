package string;

import java.util.Scanner;

public class RepeatCharacter {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.next();
	sc.close();
	
	char a[]=str.toLowerCase().toCharArray();
	int i;
	
	for(i=0;i<str.length();i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
			if(a[i]==a[j])
			{	System.out.println("Alphabet coming only two times");
				System.out.println("Dulplicate character: "+a[i]);
				break;
			}
		}
	}
}
}
