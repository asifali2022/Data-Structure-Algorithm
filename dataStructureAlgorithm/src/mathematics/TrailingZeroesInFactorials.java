package mathematics;

class trailing{
	int a;
	public int zeroCounter(int a)
	{
		int sum=1;
		while(a>0)
		{
			sum=sum*a;
			a--;
		}
		int count=0;
		while(sum%10==0) 
		{    sum=sum/10;
			count++;
		}
		return count;
	}
}

public class TrailingZeroesInFactorials {

	public static void main(String[] args) {
		
		 trailing v=new trailing();
		 System.out.println(v.zeroCounter(12));
	}

}
