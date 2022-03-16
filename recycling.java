import java.util.*;

public class recycling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double payPerCan = 0.80;
		final double payPerNewspaper = 0.40;
		final double payPerGlass = 0.80;
		int newsPaperUnits = 10;
		int glassUnits = 100;
		String userName;
		String address;
		String address2 = null;
		String address3 = null;
		int cans;
		int newsPapers;
		int glass;
		double bonus = 0.0;

// Reading user's input
		System.out.print("Enter your name ");
		userName = sc.nextLine();

		System.out.print("Enter your address ");
		address = sc.nextLine();

		System.out.print("Enter second address ");
		address2 = sc.nextLine();

		System.out.print("Enter third address ");
		address3 = sc.nextLine();

		System.out.print("Enter Number of Cans ");
		cans = sc.nextInt();

		System.out.print("Enter Number of newspapers in unit of 10: ");
		newsPapers = sc.nextInt();

		System.out.println("Enter Number of Glass in unit of 100 ");
		glass = sc.nextInt();

// Process information
		float paymentForCans = (float) (cans * payPerCan);
		float paymentForNewspapers = (float) (newsPapers / newsPaperUnits * payPerNewspaper);
		float paymentForGlass = (float) (glass / glassUnits * payPerGlass);

// Calculate the bonus
		if (cans > 3 && newsPapers > 3 && glass > 3) {
			bonus = 2.0;
		} else {
			bonus = 0;
		}

// display information on receipt
		System.out.println("\t\t" + "Recycling Company\n");
		System.out.println("Receipt No.\t\t\t    2256786913452\n");

// prints details
		System.out.println("Name: " + userName);
		System.out.println("Address : " + address);

		if (address2.length() == 0) {
			System.out.println();
		} else {
			System.out.println("Address 2 : " + address2);
		}

		if (address3.length() == 0) {
			System.out.println();
		} else {
			System.out.println("Address 3 : " + address3);
		}

		if (cans > 0) {
			System.out.printf("\nCans\t\t\t\t\t€" + "%.2f", paymentForCans);
		}
		if (newsPapers > 0) {
			System.out.printf("\nNewspapers\t\t\t\t€" + "%.2f", paymentForNewspapers);
		}
		if (glass > 0) {
			System.out.printf("\nGlass\t\t" + "\t\t\t€" + "%.2f", paymentForGlass);
		}

		System.out.printf("\nBonus\t\t\t\t\t€" + "%.2f", bonus);
		System.out.println("\n\t\t\t\t\t--------");
		float total = (float) (paymentForCans + paymentForNewspapers + paymentForGlass + bonus);
		System.out.printf("Total\t\t\t\t\t€" + "%.2f", +total);

	}

}
