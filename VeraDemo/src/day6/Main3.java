package day6;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print every number from 1 to 100
		int i=1;
		while(i<=100) {
			System.out.println(i);   		//h1    h2		h99			h100			
			i++;							//1-2	2-3		99-100		100->101(stop)		
		}
		
		//				i=55		i=99	i=100	i=101		i=102
		//i<=100		true		true	true	false		false
		//i<101			true		true	true	false		false
	}

}
