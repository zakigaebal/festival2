package festivalProject;

import java.util.Scanner;

public class festival2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("반올림수 : ");
		if( a%10 >=5) {
			System.out.println((a/10+1)*10);
			
		}
		else  {
			System.out.println((a/10)*10);
		}
	}

}
