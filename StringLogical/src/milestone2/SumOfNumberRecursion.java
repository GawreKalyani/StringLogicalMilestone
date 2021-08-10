package milestone2;

public class SumOfNumberRecursion {
	static void add(int num,int sum){
		sum=sum+num;
		num++;
		
		if(num<=3)
		{
			add(num,sum);
		}
		else{
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		add(0,1);
	}
}
