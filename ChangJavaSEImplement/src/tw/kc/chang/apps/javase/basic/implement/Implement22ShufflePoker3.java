package tw.kc.chang.apps.javase.basic.implement;

public class Implement22ShufflePoker3 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		for(int i = 0; i<poker.length; i++)poker[i] = i;
		
		for(int i = poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			// poker[rand] <=> poler[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		for (int v : poker) {
			System.out.println(v);
		}
				
	}

}
