package tw.kc.chang.apps.javase.implement;

public class Implement12Loop {

	public static void main(String[] args) {
		int i = 0;
		for (printChang(); i<10; printLine()) {
			System.out.println(i++);
		}
	}
	
	static void printChang() {
		System.out.println("Chang");
	}
	
	static void printLine() {
		System.out.println("=========");
	}

}
