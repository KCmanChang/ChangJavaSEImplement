package tw.kc.chang.apps.javase.basicimplement;

public class Implement07IfElse {

	public static void main(String[] args) {
		double rand = Math.random()*100+1;
		System.out.println(rand);
		
		int score = (int)rand;
		// int score = (int)(Math.random()100+1);
		System.out.println(score);
		
		if(score >=90) {
			System.out.println("A");
		}else if(score >=80) {
			System.out.println("B");
		}else if(score >=70) {
			System.out.println("C");
		}else if(score >=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}	
	}
}
