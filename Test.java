package jul2022;

public class Test {

	public static void main(String[] args) {
		test3();
	}
	
	public static void test1() {
		int x=10;
		x=x++ + ++x;//10+12
		System.out.println(x);
		
		x=10;
		x=++x + x++;//11+11
		System.out.println(x);
		
		x=10;
		x=++x + x;//11+11
		System.out.println(x);
		
		x=10;
		x=x++ + x;//10+11
		System.out.println(x);
		
		x=10;
		x=x++ + x++;//10+11
		System.out.println(x);
		
		x=10;
		x=++x + ++x;//11+12
		System.out.println(x);
		
		x=10;
		x=x + ++x;//10+11
		System.out.println(x);
		
		x=10;
		x=x++ + ++x + --x + x--;
		//10
		//12
		//11
		//11 = 44
		System.out.println(x);
	}
	//BODMAS
	public static void test2() {
		int x=0;
		
		x=(20+3)+12+8/4*3; // 1.Brackets 2. Division 3. Mult 4. Sub 5. Add
		/*
		 * 1. 20+3 = 23
		 * 2. 8/4 = 2
		 * 3. 2*3=6
		 * 4. 23+12=35
		 * 5. 35+6=41
		 */
		
		System.out.println(x);
		
		
		x=20+3+12+8/4*3;
		/*
		 * 
		 * 1. 8/4 = 2
		 * 3. 2*3=6
		 * 4. 20+3+12+6=41
		 * 5. 
		 */
		
		System.out.println(x);
		
		x=5+30-36;//
		//30-36 =-6
		//10-6
		System.out.println(x);
		
		x=10+30-30/30%2; //division, mod,add,sub
		System.out.println(x);
		
		//Logical Operators
		//!, && then ||
		
		
	}
	
	public static void test3() {
		int y=10;
		int z=10;
		int x=10;
		
		boolean b=(x>y)||(x==5) &&(x<=z)||!(z==1);
		
		System.out.println(b);
		
		
	}
}
