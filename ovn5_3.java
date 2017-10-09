import javax.swing.*;

/* Övning 5.3
David Andersson
*/

public class ovn5_3{
	public static void main(String[] args){
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		String meter = JOptionPane.showInputDialog(null, "Ange vilken h" + o1 + "jd bollen sl" + a2 + "pps fr" + a1 + "n (m)");
		double hojd = Double.parseDouble(meter);
		double sum = 0;

		for (hojd = hojd; hojd > 0.01; hojd = hojd * 0.7) {
			sum = sum + 1;
		}
		JOptionPane.showMessageDialog(null, "Den har studsat " + sum + " g" + a1 + "nger");
	}
}