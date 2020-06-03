package tw.kc.chang.apps.javase.object.oriented;

import tw.kc.chang.apps.javase.object.tool.Tool01ModifierBike;
import tw.kc.chang.apps.javase.object.tool.Tool02ModifierScooter;

// use Tool01Bike.java
// use Tool02Scooter.java
public class Main01Modifier {
	// 說明用，不執行
	// 存取修飾字運用 private、沒有、protected、public
	// private：僅限內部類別使用，不對外開放
	// 沒有：內部類別、同package可使用
	// protected：不同package使用要透過extends
	// public：所有都可以使用

	public static void main(String[] args) {
		Tool01ModifierBike b1 = new Tool01ModifierBike();
		Tool01ModifierBike b2 = new Tool01ModifierBike();
		// System.out.println(b1.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		// System.out.println(b1.getSpeed());
		
		b2.upSpeed();
		b2.upSpeed();
		b2.upSpeed();
		b2.upSpeed();
		b2.downSpeed();
		b2.downSpeed();
		// System.out.println(b2.getSpeed());
		
		Tool02ModifierScooter s1 = new Tool02ModifierScooter();
		// s1.setGear(4);
		s1.upSpeed(1);
		s1.upSpeed(2);
		s1.downSpeed();
		System.out.println(s1.getSpeed());
		
	}

}
