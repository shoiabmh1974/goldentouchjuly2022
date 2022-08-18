package jul2022;

public class CompatibilityDemo {
	public static void main(String[] args) {
		int i=100;
		
		//byte b=i;//you cannot store a 32 bit type in a 8 bit type
		
		//To achieve down casting - we have use the concept of casting
		
		byte b=(byte)i;// this way of converting one type to another is called type casting
		
		System.out.println(b);
		
		byte age=10;
		
		int iage=age;//automatic type promotion will happen for age - from byte to int
		
		byte n1=10;
		byte n2=2;
		
		//byte result=n1+n2;//this is invalid because - when you do arithmetic operation then the result will be 
		//always int type
		
		byte result=(byte)(n1+n2);//only by explicit casting, the value can be stored in byte
		
		
	}
}
