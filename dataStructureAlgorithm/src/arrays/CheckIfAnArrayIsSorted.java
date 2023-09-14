package arrays;

public class CheckIfAnArrayIsSorted {

	public static void main(String[] args) {
		
		int [] arr= {5,12,20,25,1};
		System.out.println(isSorted(arr));
		System.out.println("***********");
		System.out.println(isSorted(arr));

	}
	// naive solution
	// time complexity:: 0(n*n)
	public static boolean isSorted(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i])
					return false;
			}
		}
		return true;
	}
	
	// efficient solution
	// time complexity:: 0(n)
		public static boolean isSorted2(int[] arr)
		{
			for (int i = 1; i < arr.length; i++) {
				if(arr[i]<arr[i-1])
					return false;
			}
			return true;
		}

}
