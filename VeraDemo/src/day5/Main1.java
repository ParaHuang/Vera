package day5;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		/*
		 if...else if...else if...else...
		 
		 if(statement1){
		 	operationA
		 }else if(statement2){
		 	operationB
		 }else if(statement3){
		 	operationC
		 }else{
		 	operationD
		 }
		 */
		//let user input
		//				the input equipment of your system
		Scanner scan = new Scanner(System.in);
		//comment   ctrl+/
		//waiting for user to input a number
		//before you input a number and press enter key(confirm)
		//the program would be stuck at here
		//when you press enter, the number you input will be the result of this code
		System.out.println("please enter your score:");
		int score = scan.nextInt();	//0~100
		/*
		 <60	fail
		 60~69	pass
		 70~79	ok
		 80~89	good
		 >=90	excellent
		 */
		if(score<60) {
			System.out.println("fail");
		}else if(score<70) {
			System.out.println("pass");
		}else if(score<80) {
			System.out.println("ok");
		}else if(score<90) {
			System.out.println("good");
		}else{
			System.out.println("excellent");
		}
	}

}























