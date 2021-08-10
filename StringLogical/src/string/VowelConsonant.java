package string;

import java.util.Scanner;

public class VowelConsonant {
public static void main(String[] args){ 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character:");
	char ch=sc.next().charAt(0);
	sc.close();
	
	boolean isVowel=false;
	
	switch(ch){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':isVowel=true;
	}
	if(isVowel==true)
	{
		System.out.println(ch+" is a vowel");
	}
	else
	{
		System.out.println(ch+"  is a consonant");
	}
}
}
