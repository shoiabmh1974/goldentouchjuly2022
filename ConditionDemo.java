package jul2022;

public class ConditionDemo {
	public static void main(String[] args) {
		int x=1;
		if(x==10) {
			System.out.println("x is 10 value....");
		}
		else {
			System.out.println("x is not 10 ...");
		}
		
		int day=4;
		if(day==1) {
			System.out.println("Sunday...");
		}
		else if(day==2){
			System.out.println("Monday....");
		}
		else if(day==3) {
			System.out.println("Tuesday...");
		}
		else {
			System.out.println("unknown day...");
		}
		
		//TERNARY OPERATOR - ?
		day=4;
		String result=day==1?"sunday":"monday";
		System.out.println(result);
		
		System.out.println(day==1?"sunday":"monday");
		
		int month=2;day=10;
		x=day==1?month==1?10:20:100;
		System.out.println(x);
		
		
	}
}
