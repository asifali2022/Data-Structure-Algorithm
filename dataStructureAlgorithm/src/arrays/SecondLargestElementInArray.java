package arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		
		int [] arr= {5,8,20,15};
	     System.out.println(getSecondLargest(arr));
	     System.out.println(getSecondLargest2(arr));

	}
	//time complexity::O(n) {2  traversal less efficient}
		public static int getSecondLargest2(int[]ar)
		{
			int largest=0;
			int secondLargest=-1;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>ar[largest])
				{
					secondLargest=largest;
					largest=i;
					
				}
				else if(ar[i]!=ar[largest]) {
				
				if(secondLargest==-1||ar[i]<ar[largest])
				{
					secondLargest=i;
				}
				
				}
			}
			return secondLargest;
			
		}
//time complexity::O(n) {only one traversal}
	public static int getSecondLargest(int[]ar)
	{
		int largest=getLargest(ar);
		int secondLargest=-1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=ar[largest])
			{
				if(secondLargest==-1) {
					secondLargest=i;
				}
				else if(ar[i]>ar[secondLargest]) {
					secondLargest=i;
				}
				
			}
		}

		return secondLargest;
		
	}
	
	//helper fuction
	public static int getLargest(int[]ar)
	{
		int max=0;
		for (int i = 1; i < ar.length; i++) {
			
				if(ar[i]>ar[max])
				{
					max=i;
			    }
		}
	    return max;
	}
}
