package string;

public class SortingString {
public static void main(String[] args) {
	String s="kalyani";
	char a[]=s.toCharArray();
	char temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j])
			{	//swaping
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Arays are sorted:");
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]+" ");
	}
	
}
}
