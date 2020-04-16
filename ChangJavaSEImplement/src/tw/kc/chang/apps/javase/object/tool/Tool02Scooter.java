package tw.kc.chang.apps.javase.object.tool;

public class Tool02Scooter extends Tool01Bike {
	// extends(繼承)：將父類別功能延伸/擴大
	private int gear;
	
	public void upSpeed() {
		// System.out.println("Hello, World!");
		speed = speed < 1 ? 1 : speed*1.2*gear;
	}
	
	public void setGear(int newgear) {
		this.gear = newgear;
	}
	
}
