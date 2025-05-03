package day9;

import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Random random = new Random();
		
//		arr[0] = random.nextInt(1, 101);//1~100
//		arr[1] = random.nextInt(1, 101);
//		arr[2] = random.nextInt(1, 101);
//		arr[3] = random.nextInt(1, 101);
//		arr[4] = random.nextInt(1, 101);
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = random.nextInt(1, 101);
		}
		
		
		

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		Random random = new Random();
		//int x = random.nextInt();		//generate a big number
		//int x = random.nextInt(5);	//generate a number in the range of 0~bound-1
		int x = random.nextInt(1, 5);	//generate a number in the range of origin~bound-1
		System.out.println(x);
		*/
		
	}

}
