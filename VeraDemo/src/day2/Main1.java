package day2;

public class Main1 {

	public static void main(String[] args) {
		// operators
		// math operators: + - * / %
		// relational operators: >   >=    <   <=    ==   !=  (the result is true/false)
		// logical operator:  ! (not)    && (and)     || (or)

		//priority：  math>relational>logical
		
		// defines 2 variables, represent the width and height of a rectangle
		// calculate the perimeter and the area
		int w = 4;
		int h = 3;

		// calculate;
		int perimeter = 2 * (h + w);
		int area = h * w;

		System.out.println("the width of reactanle is:" + w);
		System.out.println("the height of reactanle is:" + h);
		System.out.println("the perimeter of reactanle is:" + perimeter);
		System.out.println("the area of reactanle is:" + area);

		System.out.println(10/3);
		System.out.println(10%3);
		
		//prove if a number is even 
		System.out.println(8%2);//even
		System.out.println(9%2);//odd
		
	}

}
