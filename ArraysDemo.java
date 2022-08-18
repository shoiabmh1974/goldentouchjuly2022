package jul2022;

public class ArraysDemo {
	public static void main(String[] args) {
		//SINGLE DIMENSIONAL ARRAY
		
		int[] arr= {10,20,30,40};//one row and 4 column array
		
		System.out.println(arr.length);//this will return number of columns
		//length is a property of array (not available in C language)
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		int[] array2=new int[5];//just declaring an array with default initialization
		array2[1]=999;
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+"\t");//this will print the default value zero
		}
	}
}
