package jul2022;

public class LoopingConditions {
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			i++;
			System.out.println("i value..."+i);
		}
//		while(true) {
//			System.out.println("infinite loop");
//		}
		i=10;
		do {
			System.out.println(i);
		}while(i>10);
		
		
	}
}
