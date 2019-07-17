import java.util.Scanner;

public class GrandCircusLab3 {
	public static void main(String[] args) {
		
		System.out.println("Welcome! What is your name?");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		System.out.printf("Input your number and I will tell you more about it, %s. Type \"quit\" to quit.\n", name);
		while (true) {
			long number = -1; // makes it harder for the user to unintentionally overflow the program
			while (true) {
				String tmp = s.nextLine();
				if (tmp.replace(" ", "").equals("")) {
					tmp = "0";
				}
				try {
					number = Long.parseLong(tmp);
					if (number > 0 && number <= 100) {
						break;
					} else {
						System.out.println("Please enter a number between 1 and 100.");
					}
				} catch (NumberFormatException e) {
					if (tmp.equals("quit")) {
						System.out.printf("Goodbye, %s.", name);
						s.close();
						return;
					} else {
						System.out.println("Not an integer or too large to parse. Enter \"quit\" to quit.");
					}
				}
			}
			
			if ((number % 2) > 0) {
				System.out.printf("%d: Odd.", number);
				if (number > 60) {
					System.out.printf("\n%d: Odd and > 60.", number);
				}
			} else {
				if (number >= 2 && number < 25) {
					System.out.println("Even and < 25.");
				} else if (number >= 26 && number != 60) {
					System.out.println("Even.");
				}
			}
			System.out.println("\nPlease enter a number between 1 and 100. Enter \"quit\" to quit.");
		}
	}
}
