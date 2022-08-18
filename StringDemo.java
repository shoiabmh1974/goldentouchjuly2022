package jul2022;

public class StringDemo {
	public static void main(String[] args) {
		String str="Bicycle";
		
		String s=str.substring(0,3);
		
		System.out.println(s);
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.indexOf('B'));
		
		String x="a";
		String y="b";
		
		int i=x.compareTo(y);
		
		//it will return 0 if both are equal
		//it will return -1 or +1 if they are not equal
		//a - ascii value is 97
		//b - ascii value is 98
		//when you compare a with b, then it is 97-98
		
		System.out.println(i);//the answer of i will be -1
		
		i=y.compareTo(x);
		System.out.println(i);
		
		
		System.out.println(x.equals(y));//its mandatory that you should use equals method for comparing two strings
	}
	
	
}
