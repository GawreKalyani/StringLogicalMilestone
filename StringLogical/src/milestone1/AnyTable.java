package milestone1;

import java.util.Scanner;

public class AnyTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number whose table wants to be printed:");
	int j=sc.nextInt();
	for(int i=1;i<11;i++){
		System.out.println(" "+j+" * "+i+" = "+i*j);
	}
	sc.close();
}
}
