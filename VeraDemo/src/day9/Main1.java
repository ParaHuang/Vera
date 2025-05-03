package day9;

public class Main1 {
	public static void main(String[] args) {
		//array
		//1.define an array, set up the length, without initialize elements
		//the elements will be initialized by default value
		//int->0	double->0.0		boolean->false		String->null
		//type[] name = new type[length];
		int[] arr = new int[5];
		
		System.out.println(arr);

		//access element by name[index],  index:0~length-1
		arr[0] = 89;
		arr[1] = 22;
		arr[2] = 45;
		arr[3] = 7;
		arr[4] = 12;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 //access array element 1 by 1 with a for loop
		 for(int i=0 ; i<name.length ; i++){
		 	with name[i]  you can access array element 1 by 1 
		 }
		 */
		
		//System.out.println(arr[5]);
		
		
	}

}
