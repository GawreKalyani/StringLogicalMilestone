package milestone1;

import java.util.Scanner;

public class ShowGrades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics,chemistry,biology,maths,computer marks");
		float phymark = sc.nextFloat();
		float chemark = sc.nextFloat();
		float bio = sc.nextFloat();
		float maths = sc.nextFloat();
		float computer = sc.nextFloat();
		float addMarks = (phymark + chemark + bio + maths + computer);
		System.out.println("Addition of marks  " + addMarks);

		float per = ((addMarks / 500) * 100);
		System.out.println("percentage found to be : " + per);
		
		if (per >= 90)
			System.out.println("Grade A");
		else if (per >= 80)
			System.out.println("Grade B");
		else if (per >= 70)
			System.out.println("Grade C");
		else if (per >= 60)
			System.out.println("Grade D");
		else if (per >= 40)
			System.out.println("Grade E ");
		else {
			System.out.println("Grade F ");
		}
		sc.close();
	}
}
