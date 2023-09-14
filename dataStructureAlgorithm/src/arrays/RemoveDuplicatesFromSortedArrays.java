package arrays;

public class RemoveDuplicatesFromSortedArrays {

	public static void main(String[] args) {
		
		int [] arr= {10,20,20,30,30,30};
		System.out.println(remove(arr));
		System.out.println(remove2(arr));

	}
	//naive method
	//time complexity:0(n) and one extra auxillary space for temp 
	//array
	public static int remove(int[] arr)
	{
		int temp[]=new int[arr.length];
		temp[0]=arr[0];
		int index=1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1]!=arr[i]) {
				temp[index]=arr[i];	
				index++;
			}	
		}
		for (int i = 0; i <index; i++) {
			arr[i]=temp[i];
			
		}
		return index;
	}
	//efficient method
	//time complexity:0(n) and NO extra auxillary space for temp 
	//array
	public static int remove2(int[] arr)
	{
		
		int index=1;
		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i]!=arr[index-1]) {
				
				arr[index]=arr[i];	
				index++;
			}	
		}
		
		return index;
	}
}
