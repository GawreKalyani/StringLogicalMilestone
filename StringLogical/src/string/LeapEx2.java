package string;

public class LeapEx2 {
public static void main(String[] args) {
	int y=2001;
	if((y%100==0 && y%400==0)||(y%100!=0 && y%4==0))
	{
		System.out.println(y+" is a leap year");
	}
	else{System.out.println(y+" is not a leap year");}
}
}
