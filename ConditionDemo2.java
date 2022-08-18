package jul2022;

public class ConditionDemo2 {
	public static void main(String[] args) {
		int day=5;
		
		switch(day) {
		default:{
			System.out.println("unknown.........");
			break;
		}
		case 1:{
			System.out.println("sunday...");
			break;
		}
		case 2:{
			System.out.println("monday...");
			break;
		}
		case 3:{
			System.out.println("tuesday..");
			break;
		}
		case 4:{
			System.out.println("wednesday..");
			break;
		}
		
		}
		
		String days="sunday";
		
		switch(days) {
		case "sunday":{
			System.out.println("this is day 1");
			break;
		}
		case "monday":{
			System.out.println("this is day2..");
			break;
		}
		default:{
			System.out.println("unknown..");
		}
		}
		
		char x='a';
		
		switch(x) {
		case 'a':{
			System.out.println("a for apple...");
			break;
		}
		case 'b':{
			System.out.println("b for bat...");
			break;
		}
		default:{
			System.out.println("unknown..");
		}
		}
		
		
	}
}
