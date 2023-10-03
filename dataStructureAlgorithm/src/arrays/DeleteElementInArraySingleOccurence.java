package arrays;

public class DeleteElementInArraySingleOccurence {

	public static void main(String[] args) {
		
		int [] arr={1,1,1,1,1,1,1,1,12,2,22,2,2,2,2,2,2,2,2,9,9,9,9,9,9,9,9,9,9,9,9};
		int len=arr.length;
		int [] aux=new int[len];
		for (int i=0;i<len; i++) {
		    
		    int index=arr[i];
		    aux[index]++;
		}
		for(int j:aux)
		{
		    System.out.print(j+" ");
		}
		
		

	}
public static int [] delete(int[] arr,int size,int element)
{
	int i;
	for(i=0;i<size;i++)
	{
		if(arr[i]==element)
		{
			break;
		}
	}
	if(i==size) {
		System.out.println("Element Not Found");
		return arr;
	}
	for (int j = i; j < size-1; j++) {
		arr[j]=arr[j+1];
	}
	arr[size-1]=0;
	return arr;
}
}
