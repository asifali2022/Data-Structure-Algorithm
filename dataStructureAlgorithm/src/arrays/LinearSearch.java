package arrays;

public class LinearSearch {
public static void main(String[] args) {
	int[] arr= new int[5];
	arr[0]=66;
	arr[1]=456;
	arr[2]=851;
	arr[3]=952;
	arr[4]=7;
	System.out.println(index(arr,951));
}
public static int index(int[] arr,int e) {

	for (int i = 0; i <arr.length; i++) {
		if(arr[i]==e)
			return i;
	}
	return -1;
}
}
