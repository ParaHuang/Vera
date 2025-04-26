package day8;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loop
		/*
		 
		for( initial value ; condition ;  increment ){
			operations
		}
		for(A ; B ; C){
			D
		}
		execute orders: A->B->D->C->B->D->C->B->D->C->B(stop when it's false)
		 */
		//print hello for 5 times
		for(int i=1 ; i<=5 ; i++) {	//i=1->2,3,4,5,6
			System.out.println("hello");
		}
		
		//print 1 to 100
		for(int i=1 ; i<=100 ; i++) {
			System.out.println(i);
		}
		System.out.println();
		//print the odd number from 1 to 100
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println();
		for(int i=1 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		//print all even number from 1 to 100
		for(int i=1 ; i<=100 ; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println();
		for(int i=2 ; i<=100 ; i+=2) {
			System.out.println(i);
		}
		
		
		int x = 5;
		x+=3;	//x = x+3
		
		//i+=2
		//i=1 -> 3,5,7,9
	}

}
