package tw.kc.chang.apps.javase.object.oriented;

import tw.kc.chang.apps.javase.object.tool.Tool01ModifierBike;
import tw.kc.chang.apps.javase.object.tool.Tool02ModifierScooter;

public class Main03ConstructorSuper {

	public static void main(String[] args) {
//		Tool01Bike b1 = new Tool01Bike(4);
//		System.out.println(b1.getColor());
//		b1.setColor(2);
//		System.out.println(b1.getColor());
//		
//		System.out.println("------------");
		
		Tool02ModifierScooter s1= new Tool02ModifierScooter();
		System.out.println(s1.getColor());
	}

}
