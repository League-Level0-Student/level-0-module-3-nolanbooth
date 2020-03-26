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
		//chungus.miniaturize();
		chungus.penDown();
		chungus.setPenWidth(20);
		chungus.changeRobot(
				"https://media-exp1.licdn.com/dms/image/C560BAQG-vLQJr3J3zg/company-logo_200_200/0?e=2159024400&v=beta&t=cXNxHCDmX7A_e_LGk75XIbL-eVc7VYdHQfSFH39r3Qo");
		chungus.setSpeed(5);
		// 3. Ask the user what color they would like the robot to draw
		for (int a = 0; a < 8; a++) {
		String chungi = JOptionPane.showInputDialog(null,
				"what color do you want the " + "robot to draw with? The choices are limited to red, orange, "
						+ "yellow, green, blue, purple, and gold");

		// 5. Use an if/else statement to set the pen color that the user requested
		if (chungi.equalsIgnoreCase("red")) {
			chungus.setPenColor(227, 55, 36);
		}
		if (chungi.equalsIgnoreCase("orange")) {
			chungus.setPenColor(232, 133, 46);
		}
		if (chungi.equalsIgnoreCase("yellow")) {
			chungus.setPenColor(221, 224, 31);
		}
		if (chungi.equalsIgnoreCase("green")) {
			chungus.setPenColor(73, 224, 31);
		}
		if (chungi.equalsIgnoreCase("blue")) {
			chungus.setPenColor(35, 170, 219);
		}
		if (chungi.equalsIgnoreCase("purple")) {
			chungus.setPenColor(130, 35, 219);
		}
		if (chungi.equalsIgnoreCase("gold")) {
			chungus.setPenColor(207, 181, 59);

		} 
		for (int i = 0; i < 8; i++) {
		chungus.turn(45);
		chungus.move(80);
		}
		
		}
		
		/*chungus.turn(45);
		chungus.move(80);
		chungus.turn(45);
		chungus.move(80);
		chungus.turn(45);
		chungus.move(80);
		chungus.turn(45);
		chungus.move(80);
		chungus.turn(45);
		chungus.move(80);
		chungus.turn(45);
		chungus.move(80);
		chungus.turn(45);
		chungus.move(80); */

// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10

		// 2. Make the robot draw a shape (this will take more than one line of code)

	}
}