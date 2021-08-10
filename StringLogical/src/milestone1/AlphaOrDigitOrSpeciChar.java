package milestone1;

import java.util.Scanner;

public class AlphaOrDigitOrSpeciChar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character: ");
	char c=sc.next().charAt(0);
	
	if((c>='a' && c<='z')||(c>'A' && c<='Z')){
		System.out.println(c+" is an Alphabet");
	}
	else if(c>='0' && c<='9')
	{
		System.out.println(c+"  is Digit");
	}
	else{
		System.out.println(c+" is special character");
	}
	sc.close();
}
}
