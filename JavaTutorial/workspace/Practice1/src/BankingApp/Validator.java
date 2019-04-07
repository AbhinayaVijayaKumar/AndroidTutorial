package BankingApp;
import java.util.Scanner;

// class that validates the user inputs
public class Validator { // get the double value
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	// get the double value within the specified range
	public static double getDoubleWithinRange(Scanner sc, String prompt,
			double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min)
				System.out.println("Error! Number must be greater than " + min);
			else if (d >= max)
				System.out.println("Error! Your account balance is: " + max
						+ "\nPlease enter a lower amount");
			else
				isValid = true;
		}
		return d;
	}

	// get the required input string
	public static String getRequiredString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (s == null || s.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			} else {
				isValid = true;
			}
		}
		return s;
	}

	// force the user to enter one of two strings
	public static String getChoiceString(Scanner sc, String prompt, String s1,
			String s2) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			s = getRequiredString(sc, prompt);
			if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
				System.out.println("Error! Entry must be '" + s1 + "' or '"
						+ s2 + "'. Try again.");
			} else {
				isValid = true;
			}
		}
		return s;
	}
}