package arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int [] arr= {5,12,20,25,1};
		int[] reverseArray = reverse(arr);
		for(int j:reverseArray)
		{
			System.out.print(j+" ");
		}

	}
//time complexity:theta(n)
public static int[] reverse(int[] arr) {
	
	int low=0;
	int high=arr.length-1;
	while(low<high)
	{
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		low++;
		high--;
		
	}
	return arr;
	}
}
