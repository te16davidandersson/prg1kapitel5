import javax.swing.*;

/* Övning 5.1
David Andersson
9/10 2017
*/

public class ovn5_1{
	public static void main(String[] args){


		String nn = JOptionPane.showInputDialog(null, "Ange ett heltal");
		int n = Integer.parseInt(nn);
		int summa = 0;
		while (n > 0) {
			summa = summa + n * n;
			n = n - 1;
		}
		JOptionPane.showMessageDialog(null, "Summan blir: " + summa);
	}
}