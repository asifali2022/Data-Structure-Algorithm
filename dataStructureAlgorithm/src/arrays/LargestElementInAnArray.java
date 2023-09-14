package arrays;
//operations on arrays
//linear search:: O(n);
//binary Search::log(n)
//adding element at end::O(1)
//adding element at beginning(must have space for element):O(n)
//deleting element::O(n)(for all cases)
// get    ith element::O(1)
// update ith elemrnt::O(1)

public class LargestElementInAnArray {

	public static void main(String[] args) {
	
     int [] arr= {5,12,15,25,96};
     System.out.println(getLargest(arr));
     System.out.println(getLargest2(arr));
	}
	
//Time Complexity :: O(n*n)	
public static int getLargest(int[]ar)
{
	for (int i = 0; i < ar.length; i++) {
		boolean flag =true;
		for(int j=0;j<ar.length;j++)
		{
			if(ar[j]>ar[i])
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			return i;
		}
	}
	
	return -1;
}
//Time Complexity :: O(n)	
public static int getLargest2(int[]ar)
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
