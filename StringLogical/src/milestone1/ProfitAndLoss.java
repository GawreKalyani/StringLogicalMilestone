package milestone1;

import java.util.Scanner;

public class ProfitAndLoss {
	public static void main(String[] args) {

		float profit, loss;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter selling price :");
		float sp = sc.nextFloat();
		System.out.println("Enter cost price :");
		float cp = sc.nextFloat();
		if (sp > cp) {
			profit = sp - cp;
			System.out.println("Profit = Rs " + profit);
		} else {
			loss = cp - sp;
			System.out.println("Loss = Rs " + loss);
		}
		sc.close();
	}
}