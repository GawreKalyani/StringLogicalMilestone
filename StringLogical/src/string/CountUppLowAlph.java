package string;

public class CountUppLowAlph {
	public static void main(String[] args) {
		String s="HAQZYuvwtbb";
		int  freqUppr[]=new int[26];
		int  freqLowr[]=new int[26];
		for (int i = 0; i < s.length(); i++) 
		{	
			int index=0;
			int c=s.charAt(i);
			if(c>=65 && c<=90)
			{
				index=c-65;
				freqUppr[index]++;
			}
			else
			{
				index=c-97;
				freqLowr[index]++;
			}
		}
		System.out.println("Str:freq[]");
		for (int i = 0; i < 26; i++) {
		if(freqUppr[i]!=0){
			System.out.println((char)(65+i)+":"+freqUppr[i]);
		}
		if(freqLowr[i]!=0){
			System.out.println((char)(97+i)+":"+freqLowr[i]);
		}
		}
	}
}
