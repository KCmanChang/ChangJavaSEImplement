package tw.kc.chang.apps.javase.object.tool;

public class Tool02ModifierScooter extends Tool01ModifierBike {
	// extends(繼承)：將父類別功能延伸/擴大
	private int gear;
	
	public Tool02ModifierScooter() {
		// super();
		super(4);
		System.out.println("Scooter()");
		color = 1;
	}
	
	public void upSpeed() {
		super.upSpeed(); // 呼叫父類別的方法，再執行改寫
		speed *= 1.2;
	}
	
	public void upSpeed(int gear) {
		setGear(gear);
		speed = speed < 1 ? 1 : speed*1.2*gear;
	}
	
	private void setGear(int newgear) {
		gear = newgear;
	}
	
}
