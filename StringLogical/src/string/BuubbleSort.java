package string;

public class BuubbleSort {
	
void bubbleSort(int arr[])
{
		int n=arr.length;
	for (int i = 0; i < n-1; i++) 
	{
		for (int j = 0; j < n-i-1; j++) 
		{
			
			if(arr[j] > arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
	
	//Print array
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		BuubbleSort ob=new BuubbleSort();
		int arr[]={64,34,25,12,11,22,90};
		ob.bubbleSort(arr);
		System.out.println("Sorted Array:");
		ob.printArray(arr);
	}
}

