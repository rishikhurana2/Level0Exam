import javax.swing.JOptionPane;

/* Level 0 Exam: Coding  Exercise #2 */

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age;
		int year = 2017;
		age = JOptionPane.showInputDialog("What is your age");
		int ageInt = Integer.parseInt(age);
		if (ageInt < 30) {
			JOptionPane.showMessageDialog(null, year - ageInt + " is when you were born");
		} else if (ageInt > 30) {
			JOptionPane.showMessageDialog(null, "Your too old for this game");
		}
	}
}
