package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArraySort {
public static void main(String[] args) {
	
	String arr[]={"23","88","33","11"};
	 Arrays.sort(arr);
	 
     System.out.println(Arrays.toString(arr)+" is sorted array");
	
	
	ArrayList<String>al=new ArrayList<>();
	al.add("11");
	al.add("99");
	al.add("00");
	//Ascending
	Collections.sort(al);
	System.out.println("Sorted ArrayList "+ "in Ascending order : "+al);
	
	//decreasing
	Collections.sort(al, Collections.reverseOrder());
	  
    // Print the sorted ArrayList
    System.out.println("Sorted ArrayList "+ "in Descending order : "+ al);
	
	
}
}
