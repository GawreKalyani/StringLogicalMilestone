package string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");        //listen
	String s1=sc.next();
	System.out.println("Enter second string ");      //silent
	String s2=sc.next();
	System.out.println(AnagramCheck(s1,s2));
	sc.close();
}

public static boolean AnagramCheck(String s1, String s2) {
	char c1[]=s1.toLowerCase().toCharArray();
	char c2[]=s2.toLowerCase().toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	return Arrays.equals(c1, c2);    //true as silent and listen are made from common alphabets
}
}
