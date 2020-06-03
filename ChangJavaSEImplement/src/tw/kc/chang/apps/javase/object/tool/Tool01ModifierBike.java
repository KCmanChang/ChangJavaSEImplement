package tw.kc.chang.apps.javase.object.tool;

public class Tool01ModifierBike {
	protected double speed;
	protected int color; // 0: no color
	
	public Tool01ModifierBike() {
		// super();
		System.out.println("Bike()");
		color = 1;
	}

	public Tool01ModifierBike(int color) {
		// 建構式名稱與類別名稱相同，做物件初始化
		// 一個物件初始化後只會做一次的
		System.out.println("Bike(int)");
		if (color > 0) {
			this.color = color;
		} else {
			this.color = 1;
		}
	}

	public void setColor(int color) {
		if (color > 0) {
			this.color = color;
		}
	}

	public int getColor() {
		return color;
	}

	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}

	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}

	public double getSpeed() {
		return speed;
	}

}
