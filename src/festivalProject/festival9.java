package festivalProject;

import java.util.Random;
import java.util.Scanner;

public class festival9 {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int count = 0;
		while (count < 5) {
			int a = rd.nextInt(9) + 1;
			int b = rd.nextInt(9) + 1;
			int plus = a + b;
			
			System.out.print(a +"+"+b+"=");
			int c = sc.nextInt();

			if (c == plus) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				count++;
			}
		}
		System.out.println("GAME OVER!");
	}
}


