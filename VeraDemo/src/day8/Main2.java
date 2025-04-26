package day8;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all the leap year in 21 century
		//2001~2100
		for(int i=2001 ; i<=2100 ; i++) {//i represent every year in 21 century
			if(i%4==0 && i%100!=0 || i%400==0) {
				System.out.println(i);
			}
		}
	}

}
