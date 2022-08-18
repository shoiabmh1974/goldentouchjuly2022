package jul2022;

public class ArraysDemo2 {
	public static void main(String[] args) {
		//TWO DIMENSIONAL ARRAY
		
		int[][] twod= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};//this is array of size 3 rows and 4 columns
		
		System.out.println(twod.length);//this will return number of rows..
		System.out.println(twod[1].length);//this will return number of columns of second row
		
		for(int i=0;i<twod.length;i++) {
			for(int j=0;j<twod[i].length;j++) {
				System.out.print(twod[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int [][] twod2=new int[3][4];//4 columns 3 rows
		twod2[1][2]=9999;
		for(int i=0;i<twod2.length;i++) {
			for(int j=0;j<twod2[i].length;j++) {
				System.out.print(twod2[i][j]+"\t");//will print the default value which is zero
			}
			System.out.println();
		}
	}
}
