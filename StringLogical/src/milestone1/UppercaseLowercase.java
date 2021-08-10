package milestone1;

public class UppercaseLowercase {
public static void main(String[] args) {
	int c=97;
	char ch=(char)c; //conversion of int to char  ascii int code to char
	
	if(c>=65 && c<=90)
		System.out.println(ch+":"+c+" is uppercase alphabet");
	else if(c>=97 && c<=122)
		System.out.println(ch+":"+c+" is lowercase alphabet");
	else if(c>=0 && c<=9)
		System.out.println(c+" is a digit");
	else
		System.out.println(c+"  is a number");
	
}
}
