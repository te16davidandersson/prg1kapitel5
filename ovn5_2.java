import javax.swing.*;

/* Övning 5.2
David Andersson
9/10 2017
*/

public class ovn5_2{
	public static void main(String[] args){

		String nn = JOptionPane.showInputDialog(null, "Ange heltal");
		double n = Double.parseDouble(nn);
		double summa = 0;
		while (n > 0) {
			summa = summa + 1 / n;
			n = n - 1;
		}
		JOptionPane.showMessageDialog(null, "Summa: " + summa);
	}
}