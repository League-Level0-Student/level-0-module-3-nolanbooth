//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot chungus = new Robot();
		chungus.miniaturize();
		chungus.penDown();
		chungus.setPenWidth(20);
		chungus.changeRobot(
				"https://media-exp1.licdn.com/dms/image/C560BAQG-vLQJr3J3zg/company-logo_200_200/0?e=2159024400&v=beta&t=cXNxHCDmX7A_e_LGk75XIbL-eVc7VYdHQfSFH39r3Qo");
		// 3. Ask the user what color they would like the robot to draw
		String chungi = JOptionPane.showInputDialog(null, "what color do you want the robot to draw with?");

		// 5. Use an if/else statement to set the pen color that the user requested
		if (chungi.equalsIgnoreCase("red")) {
			chungus.setPenColor(100, 30, 30);
		} else {
			chungus.setRandomPenColor();

		}
		chungus.move(80);

// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}
}