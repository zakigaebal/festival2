package festivalProject;

import java.util.Scanner;

public class festival2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("�ݿø��� : ");
		if( a%10 >=5) {
			System.out.println((a/10+1)*10);
			
		}
		else  {
			System.out.println((a/10)*10);
		}
	}

}
