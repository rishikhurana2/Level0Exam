
/* Level 0 Exam: Coding  Exercise #1 */

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CodingExercise1 {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String robotColor;
		robotColor = JOptionPane.showInputDialog("What would you like the color of the robot pen to be");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (robotColor.equals("Red") || robotColor.equals("red")) {
			rob.setPenColor(Color.red);
		} else if (robotColor.equals("Blue") || robotColor.equals("blue")) {
			rob.setPenColor(Color.blue);
		} else {
			JOptionPane.showMessageDialog(null, "INVALID COLOR, BLACK WILL APPEAR");
		}
		// 2. set the pen width to 10
		rob.setPenWidth(10);
		// 1. make the Robot draw a shape
		for (int i = 0; i < 4; i++) {
			rob.penDown();
			rob.move(200);
			rob.turn(90);
		}
	}
}
