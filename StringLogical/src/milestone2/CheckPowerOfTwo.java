package milestone2;

public class CheckPowerOfTwo {
public static void main(String[] args) {
	int no=1;
	if(no%2==1)//remainder 1
		System.out.println("This number cannot be power of two");
	else
	{
		while(no!=1)  //12  6  3
		{
			if(no%2==1)   //3%2==1
				{
					System.out.println("This number cannot be power of two");
					break;
				}
			no=no/2;	//no=12/2=6      6/2=3
		}
		if(no==1){
			System.out.println("power of two");
		}
	}
}
}
