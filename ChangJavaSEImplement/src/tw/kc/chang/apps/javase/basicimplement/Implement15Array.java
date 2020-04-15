package tw.kc.chang.apps.javase.basicimplement;

public class Implement15Array {

	public static void main(String[] args) {
		// Array vs Matrix
		// Array => object
		// 記憶體只有線性觀念，沒有空間
		int[] a; //整數陣列，名字為a
		a = new int[3];
		System.out.println(a.length);
		int[] b = new int[4];
		for (int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("==========");
		int[] c = new int[] {1,2,3,4};
		int[] d = {1,2,3,4};
		for (int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		int[] e;
		e = new int[] {9,8,7,6};
		// 要在宣告時同時給值才可以
		// int[] f;
		// f = {9,8,7,6};
	}

}
