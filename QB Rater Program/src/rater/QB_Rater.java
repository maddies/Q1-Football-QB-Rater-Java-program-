package rater;

import java.util.Scanner;

public class QB_Rater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter QB's number of touchdowns:");
		double TD = sc.nextDouble();

		System.out.println("Enter QB's number of total yards:");
		double YARDS = sc.nextDouble();

		System.out.println("Enter QB's number of interceptions:");
		double INT = sc.nextDouble();

		System.out.println("Enter QB's number of completions:");
		double COMP = sc.nextDouble();

		System.out.println("Enter QB's number of passes attempeted:");
		double ATT = sc.nextDouble();

		double a = (((COMP / ATT) - 0.3) * 5);
		if (a >= 2.375)
			a = 2.375;
		else if (a <= 0)
			a = 0;
		else
			;

		double b = (((YARDS / ATT) - 3) * 0.25);
		if (b >= 2.375)
			b = 2.375;
		else if (b <= 0)
			b = 0;
		else
			;

		double c = (((TD / ATT) * 20));
		if (c >= 2.375)
			c = 2.375;
		else if (c <= 0)
			c = 0;
		else
			;

		double d = (2.375 - ((INT / ATT) * 25));
		if (d >= 2.375)
			d = 2.375;
		else if (d <= 0)
			d = 0;
		else
			;

		double rating = (((a + b + c + d) / 6) * 100);

		System.out.printf("The Quarterback's rating is: %.2f", rating);
	}
}
