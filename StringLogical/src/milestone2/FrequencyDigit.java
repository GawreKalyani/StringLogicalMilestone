package milestone2;

public class FrequencyDigit {
	public static void main(String[] args) {
		int no = 121;
		int r = 0;
		int one = 0, zero = 0, two = 0;
		while (no != 0) {
			r = no % 10;
			if (r == 0) {
				zero++;
			}

			else if (r == 1) {
				one++;
			} else if (r == 2) {
				two++;
			}
			no = no / 10;
		}

		System.out.println("0 appeared " + zero);
		System.out.println("1 appeared " + one);
		System.out.println("2 appeared " + two);

	}
}
