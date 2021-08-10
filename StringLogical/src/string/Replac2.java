package string;

public class Replac2 {
	public static void main(String[] args) {
		String str="Tajmahal";
		char []arr=str.toCharArray();     //[T,a,j,m,a,h,a,l]
		
		for(int i=0;i<arr.length;i++)
		{
		        if(arr[i]=='a') 
		        {                
		        	arr[i]='b';            
		        }
		}                               
		System.out.println(arr);
	}

}
