package mathematics;

class fact{
	
	public static int fact(int a)
	{    
		if(a==0)
			return 1;
		int mult=1;
		while(a>0)
		{
			mult=mult*a;
			a--;
		}
		
		
		return mult;
	}
}


public class factorialOfANumber {

	public static void main(String[] args) {
		
		int a=fact.fact(6);
		System.out.println("factorial is: "+a);
	}

}
