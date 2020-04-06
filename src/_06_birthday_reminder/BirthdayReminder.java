
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "March 21st";
		String dadsBirthday = "September 8th";
		String myBirthday = "August 22st";
		String sistersBirthday = "December 19th";
		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String answer = JOptionPane.showInputDialog(null, "Which birthday do you want to know?");
		// 3. Print out what the user typed
		System.out.print(answer);
		// 4. if user asked for "mom"
		if (answer.equalsIgnoreCase("mom")) {
			System.out.print(momsBirthday);
		}
		else if (answer.equalsIgnoreCase("dad")) {
			System.out.print(dadsBirthday);
		}
		else if (answer.equalsIgnoreCase("me")) {
			System.out.print(myBirthday);
		}
		else if (answer.equalsIgnoreCase("sister")) {
			System.out.print(sistersBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Birthday not stored in program");
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
