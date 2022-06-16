package linecomparisonproblem;

import java.util.Scanner;

public class UC3 {

	public static void main(String[] args) {
		int x1, x2, x3, x4, y1, y2, y3, y4;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type 'x' and 'y' co-ordinates of first point of first line, respectively:");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.println("Type 'x' and 'y' co-ordinates of second point of first line, respectively:");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		System.out.println("Type 'x' and 'y' co-ordinates of first point of second line, respectively:");
		x3 = scanner.nextInt();
		y3 = scanner.nextInt();
		System.out.println("Type 'x' and 'y' co-ordinates of second point of second line, respectively:");
		x4 = scanner.nextInt();
		y4 = scanner.nextInt();
		System.out.println("The first point of first line is: " + "(x1,y1) = " + "(" + x1 + "," + y1 + ")");
		System.out.println("The second point of first line is: " + "(x2,y2) = " + "(" + x2 + "," + y2 + ")");
		System.out.println("The first point of second line is: " + "(x3,y3) = " + "(" + x3 + "," + y3 + ")");
		System.out.println("The second point of second line is: " + "(x4,y4) = " + "(" + x4 + "," + y4 + ")");
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		System.out.println("The length of first line is: " + length1);
		System.out.println("The length of second line is: " + length2);
		if (length1 > length2)
			System.out.println("Length of first line is greater than that of second line.");
		else if (length1 < length2)
			System.out.println("Length of first line is lesser than that of second line.");
		else
			System.out.println("Lengths of both the lines are equal.");
	}

}
