package BitWiseOperatorInJava;

public class BitWiseSignedRightShiftOperator {

	public static void main(String[] args) {
	
		int x=33;
		int y=3;
		int z=4;
		System.out.println(x>>1);
		System.out.println(x>>4);
		System.out.println(z>>y);

	}

}
//binary     
//33::     00000000000000000000000000100001|
//33>>1    00000000000000000000000000010000|1    add 0 to MSB and  R SHIFT LSB BY 1 COUNT
//33>>4    00000000000000000000000000000010|0001 add 0000 to MSB and R SHIFT LSB BY 4
//-1         |11111111111111111111111111111111
//-1<<1     1|11111111111111111111111111111110  =-2
//-1<<2    11|11111111111111111111111111111100  =-4
//BINARY NO (+VE)==2^32
//BINARY NO (-VE)==2^32-X X{NUMBER}
//X<<Y  ===>> ( X * (2^Y) )
//3<<4  ===>> ( 3 * (2^4) ) ===>> 48

