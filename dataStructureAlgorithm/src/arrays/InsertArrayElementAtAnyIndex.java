package arrays;



public class InsertArrayElementAtAnyIndex {

	public static void main(String[] args) {
		
		
		int[] arr= new int[6];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] insertedArray = insert(arr,6,3,450,5);
		// array,size of array,position,value,current no of element in array
		for (int i : insertedArray) {
			System.out.print(i+" ");
			
		}
	}
	//tme complexity:O(n)
	//ccap=no of current element in array;
	//size=length of array
	//pos=it is position where to enter value it starts withn 1
	//val=value to be inserted
	public static int[] insert(int []arr,int size,int pos,int val,int ccap)
	{   if(pos>size) {
		    System.out.println("Not Possible");
		    System.out.println("Position Value Greater Than Size Of Array");
	        return arr;
	}
		if(ccap==size) {
			System.out.println("Not Possible");
			System.out.println("Array Already Has Element Equal To Size Of Array");
			
			return arr;
		}
		int index=pos-1; // since position starts from 1 and index from 0
		for (int i =ccap-1; i>=index; i--) //5-1;i>=2;i--
		{
			arr[i+1]=arr[i];
		}
		arr[index]=val;
		return arr;
	}

}
