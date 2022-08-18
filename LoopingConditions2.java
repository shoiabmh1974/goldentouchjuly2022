package jul2022;

public class LoopingConditions2 {
	public static void main(String[] args) {
//		for(;;) {
//			System.out.println("infinite loop..");
//		}
		
		for(int i=0;i<10;++i) {
			System.out.println(i);
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}
