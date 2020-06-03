package tw.kc.chang.apps.javase.basic.implement;

public class Implement17Array3 {

	public static void main(String[] args) {
		int[] p = new int[7];
		
		for (int i = 0; i<10000; i++) {
			int ran = (int)(Math.random() * 9 + 1);
			p[ran>=7?ran-3:ran]++;
		}
		
		if (p[0] ==0) {
			for(int i = 1; i<=6; i++) {
				System.out.printf("%d點出現%d次\n",i,p[i]);
			}
		}
	}

}
