package festivalProject;

import java.util.Scanner;

public class festival5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �Է�>> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String st = "";
		while (a > 0) {
				st = a%2 + st;
				a= a/2;	
		}
		System.out.println(st);
	}
}