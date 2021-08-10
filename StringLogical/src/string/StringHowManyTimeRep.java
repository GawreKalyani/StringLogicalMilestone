package string;

public class StringHowManyTimeRep 
{
	public static void main(String[] args)
	{
		String str="JAVA";
		char ch[]=str.toCharArray();       //[J,A,V,A]
		int freq[]=new int[ch.length];
	
	for(int i=0;i<ch.length;i++)
	{
		freq[i]=1;
		for (int j = i+1; j < freq.length; j++)
		{
			if(ch[i]==ch[j])    //  J==A J==V J==A A==V A==A V==A
			{
				freq[i]++;
				ch[j]=0;      // 'a'(in column) will not repeats
			}
		}
	}
	System.out.println("Array ..frequency");
	for (int i = 0; i < freq.length; i++)
	{
		if(ch[i]!=0)		//freq for 'a' not repeats
		{
			System.out.println(ch[i]+"           "+freq[i]);
		}
	}
  }
}