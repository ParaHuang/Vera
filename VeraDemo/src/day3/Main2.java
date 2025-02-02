package day3;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//flow control
		//condition 
		
		//if...else if...else if...else...
		
		/*
		 * if 
		 if(statement){
		 	operation
		 }
		 when the result of statement is true, execute the operation
		 
		 * if...else...
		 if(statement){
		 	operationA
		 }else{
		 	operationB
		 }
		 when the result of statement is true, execute the operationA
		 otherwise execute the operationB
		 */
		int num = 18;
		//print hello when num is even 
		if(num%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		

		int year = 1000;
		//leap year:
		//1. divisible by 4  but not divisible by 100		     year % 4 == 0 && year % 100 != 0
		//2. divisible by 400		year % 400 == 0
		//if it's a leap year, then print "xxxx is leap year"
		//otherwise print "xxxx is a normal year"
	}

}














