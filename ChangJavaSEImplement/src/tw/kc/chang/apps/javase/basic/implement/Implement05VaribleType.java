package tw.kc.chang.apps.javase.basic.implement;

import javax.swing.JOptionPane;

public class Implement05VaribleType {

	public static void main(String[] args) {
		float f1 = 123;
		float f2 = 123.0f;
		double d1 = 123;
		double d2 = 123.0;
		float f3 = f1 + f2;
		
		String x = JOptionPane.showInputDialog("Input a float");
		String y = JOptionPane.showInputDialog("Input a float");
		
		float fX = Float.parseFloat(x);
		float fY = Float.parseFloat(y);
		float fR = fX + fY;
		
		JOptionPane.showMessageDialog(null, fX + " + " + fY + " = " + fR );

	}

}
