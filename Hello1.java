package jul2022;

public class Hello1 {
	public static void main(String[] args) {
		System.out.println("Welcome To Java.......");
		
		//NUMBER TYPES
		byte b=-128;//8 bit size
		b=127;
		
		short s=-32768;//16 bit size
		s=32767;
		
		int i=-2147483648;//32 bit size
		i=2147483647;
		
		int acno=1200_00_00_10;//underscore is for decoration - for readability
		
		System.out.println(acno);
		
		long distanceToMoon=-9223372036854775808L;//64 bit data type
		
		distanceToMoon=9223372036854775807L;
		
		//FLOATING TYPES
		
		float price=123;//32 bit size
		price=1323.45f;
		
		double d=3344;
		d=343434.56;//64 bit
		
		//CHARACTER
		
		char c=97;//16 bit - cannot accept negative values - 0 to 65535
		System.out.println(c);
		c='a';
		
		//BOOLEAN
		
		boolean boo=true;
		boo=false;
		//boo=0; - not acceptable
		
		//STRING TYPE
		
		String name="July 2022 Batch";//unlimited size - more over String is a class in java
		
		//Note - byte,short,int,long,float,double,boolean,char - PRIMITIVE TYPES
		//String - Complex Type (because String is a java Class)
		
		
	}
}
