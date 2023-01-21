package mathematics;

class Power{
	
	static int compute(int a,int b)
	{
		int h=1;
		for(int i=0;i<b;i++)
		{
			
			h=h*a;
		}
		return h;
	}
	//efficient solution
	int compute2(int a,int b)
	{
		if (b==1)
		{
			return 1;
		}
		int temp= compute(a,b/2);
		if(b%2==0)
		{
			return temp;
		}
		return temp*a;
	}
}

public class ComputingPower {

	public static void main(String[] args) {
		
     Power p=new Power();
     System.out.println(p.compute(2,3));
	}

}
