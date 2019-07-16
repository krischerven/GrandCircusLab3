import java.util.Scanner;

public class GrandCircusLab3 {
	public static void main(String[] args) {
		
		var s = new Scanner(System.in);
		long number = -1; // makes it harder for the user to unintentionally overflow the program
		for (;;) {
			var tmp = s.nextLine();
			try {
				number = Long.parseLong(tmp);
				s.close();
				break;
			} catch (NumberFormatException e) {
				if (tmp.equals("quit")) {
					System.out.println("Goodbye.");
					break;
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
		
	}
}
