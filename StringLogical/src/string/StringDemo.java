package string;

public class StringDemo {
public static void main(String[] args) {
	String s1="Jit";   //J==J, i>a    s1 max
	String s2="Java";
	int k=s1.compareTo(s2);
	if(k==0)
		System.out.println("Both Strings are equal");
	else if(k>0)
		System.out.println("s1 max");
	else
		System.out.println("s2 max");
}
}

//Alphabet to alphabet check