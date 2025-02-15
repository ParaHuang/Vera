package day4;

public class Main2 {

	public static void main(String[] args) {
		//define a variable, save a 3 digit integer number
		//find out if the sum of every digit plus together is greater than 10
		
		//number		sum			answer
		//123 	->		6		-> 	no
		//381	->		12		->	yes
		//492	->		15		->	yes
		
		int number = 344;   
			
		int a = number/100;		//hundreds
		int b = number/10%10;	//tens		//math:167/10=16.7	java:16
		int c = number%10	;	//ones
		
		int sum = a+b+c;
//		System.out.println(a+"   "+b+"   "+c);
		if(sum > 10) {
			System.out.println("every digit of "+number+" plus together is greater than 10");
		}else {
			System.out.println("no");
		}
		
	}

}
