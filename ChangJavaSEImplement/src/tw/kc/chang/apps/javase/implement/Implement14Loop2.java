package tw.kc.chang.apps.javase.implement;

public class Implement14Loop2 {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i == 17) {
				// break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Over");
	}

}