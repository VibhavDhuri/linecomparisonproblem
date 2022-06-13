package linecomparisonproblem;

import java.util.Scanner;

public class UC1 {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type 'x' and 'y' co-ordinates of first point of first line, respectively:");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		System.out.println("Type 'x' and 'y' co-ordinates of second point of first line, respectively:");
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		System.out.println("The first point of line is: " + "(x1,y1) = " + "(" + x1 + "," + y1 + ")");
		System.out.println("The second point of line is: " + "(x2,y2) = " + "(" + x2 + "," + y2 + ")");
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("The length of first line is: " + length1);
	}

}
