package string;
//output:Tbjmbhbl
public class ReplacingChar {
	public static void main(String[] args) {
		String str="Tajmahal";
		char []arr=str.toCharArray();     //[T,a,j,m,a,h,a,l]
		
		for(int i=0;i<arr.length;i++)
		{
			char j=arr[i];               //j=T          j= a        j=j    m    a    h    a    l
			if(j=='a')                   //T==a false   a==a      false false true  fal  true  false
			{
				arr[i]='b';              //              arr[i]=b              a=b        a=b
			}
		}                               //T              b        j      m      b    h     b   l
		System.out.println(arr);
	}//mainEnd
	
}//classEnd