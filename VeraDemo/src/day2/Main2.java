package day2;

public class Main2 {

	public static void main(String[] args) {
		/*
		System.out.println(10 > 3);
//		System.out.println(10 == 10);
		System.out.println(3 * 4 <= 2 * 6);
		
//		System.out.println(3+4*(2-1));
		*/
		
		//!
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//&&: and , both statement are true, then the result is true
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println();
//		System.out.println(3+2>2*2 && 4+5<2*6);
		
		//||: or , any statement is true, then the result is true
		System.out.println(true || true);	//true
		System.out.println(true || false);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		
		int year = 1000;
		//leap year:
		//1. divisible by 4  but not divisible by 100		     year % 4 == 0 && year % 100 != 0
		//2. divisible by 400		year % 400 == 0
		//if this year is leap year
		System.out.println();
		System.out.println("leap year?");
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		
		
		
	}

}
