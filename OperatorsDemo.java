package jul2022;

public class OperatorsDemo {
	public static void main(String[] args) {
		//ARITHMETIC OPERATION
		int x=10;
		int y=2;
		
		int sum=x+y;//+ is a addition operator
		
		System.out.println("Addition...:"+sum);//+ is also a concatenation operator
		
		int sub=x-y;//- is substraction
		
		System.out.println("Substraction..:"+sub);
		
		int mul=x*y;//* is for multiplication
		
		System.out.println("multiplication..:"+mul);
		
		int div=x/y;// / is for division to get quotient
		
		System.out.println("Quotient...:"+div);
		
		int mod=x%y;// % is for division to get reminder
		
		System.out.println("Reminder...:"+mod);
		
		//INCREMENT AND DECREMENT OPERATOR
		
		//x=x+1;//instead you can say x++ or ++x
		
		//POST INCREMENT
		System.out.println(x++);//first it prints and then increments -10
		System.out.println(x);//print 11
		
		//PRE INCREMENT
		x=10;
		System.out.println(++x);//first it increments then prints - 11
		System.out.println(x);//11
		
		//POST DECREMENT (x=x-1)
		x=10;
		System.out.println(x--);//first it prints and then decrements - 10
		System.out.println(x);//prints 9
		
		//PRE DECREMENT
		x=10;
		System.out.println(--x);//first it decrements then prints - 9
		System.out.println(x);//prints 9
		
		//IIT JEE Question
		x=10;
		x=++x + x++;
		System.out.println(x);
		
		x=10;
		x=++x + x;
		System.out.println(x);
		
		//x=x+10; -shortcut for this is - x+=10
		x=10;
		x+=10;//x=x+10
		System.out.println(x);
		
		x=10;
		x-=5;//x=x-5
		System.out.println(x);
		
		x=10;
		x*=20;//x=x*10
		System.out.println(x);
		
		x=10;
		x/=2;//x=x/10
		System.out.println(x);
		
		x=10;
		x%=3;//x=x%3
		System.out.println(x);
		
		//RELATIONAL OPERATORS
		x=10;y=10;
		System.out.println(x==y);//true-comparison operator - returns a boolean true or false...
		x=10;y=20;
		System.out.println(x==y);//false-comparison operator - returns a boolean true or false...
	
		x=10;y=10;
		System.out.println(x<y);//false-comparison operator - returns a boolean true or false...
		System.out.println(x>y);//false-comparison operator - returns a boolean true or false...
		
		System.out.println(x<=y);//true-comparison operator - returns a boolean true or false...
		System.out.println(x>=y);//true-comparison operator - returns a boolean true or false...
		
		System.out.println(x!=y);//false-comparison operator - returns a boolean true or false...
		System.out.println(!(x>y));//true-comparison operator - returns a boolean true or false...
		
		//LOGICAL OPERATORS  - && -AND || - OR
		
		x=10;y=10;
		boolean result=x==y && x<=y;//since both are true, the result will be true
		System.out.println(result);
		
		result=x==y && x!=y;//since first one is true and the second one is false the result will be false
		System.out.println(result);
		
		x=10;y=10;
		result=x==y || x<=y;//since both are true, the result will be true
		System.out.println(result);
		
		result=x==y || x!=y;//even if only one is true and the second one is false still the result will be true
		System.out.println(result);
		
		
	}
}
