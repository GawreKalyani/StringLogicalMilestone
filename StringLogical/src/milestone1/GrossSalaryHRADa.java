package milestone1;

import java.util.Scanner;

public class GrossSalaryHRADa {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter basic salary of employee:");
    double basicSal=sc.nextDouble();
	double hra=0 ,da=0,grossSal;
	
	
		if (basicSal <= 10000) {
			hra = basicSal * 20/100;
			da = basicSal * 80 / 100;
		}

		if (basicSal <= 20000) {
			hra = basicSal * 25 / 100;
			da = basicSal * 90 / 100;

		}
		if (basicSal > 20000) {
			hra = basicSal * 30 / 100;
			da = basicSal * 95 / 100;
		}
	
		System.out.println("He got HRA with rupees :- "+hra);
		System.out.println("He got Da with rupees:- "+da);
	 grossSal=basicSal+hra+da;
	System.out.println("Gross salary Of Employee:"+grossSal);
	sc.close();
}
}
