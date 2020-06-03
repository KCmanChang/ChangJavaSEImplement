package tw.kc.chang.apps.javase.object.oriented;

import tw.kc.chang.apps.javase.object.tool.Tool01ModifierBike;
import tw.kc.chang.apps.javase.object.tool.Tool02ModifierScooter;

//use Tool01Bike.java
//use Tool02Scooter.java
public class Main02Modifier2 {

	public static void main(String[] args) {
		Tool01ModifierBike b1 = new Tool01ModifierBike();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		Tool02ModifierScooter s1 = new Tool02ModifierScooter();
		s1.upSpeed(1);s1.upSpeed(2);s1.upSpeed(3);
		System.out.println(s1.getSpeed());

	}

}
