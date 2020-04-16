package tw.kc.chang.apps.javase.object.oriented;

import tw.kc.chang.apps.javase.object.tool.Tool01Bike;
import tw.kc.chang.apps.javase.object.tool.Tool02Scooter;

//use Tool01Bike.java
//use Tool02Scooter.java
public class Main02Modifier2 {

	public static void main(String[] args) {
		Tool01Bike b1 = new Tool01Bike();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		Tool02Scooter s1 = new Tool02Scooter();
		s1.setGear(4);
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());

	}

}
