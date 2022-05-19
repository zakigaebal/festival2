package festivalProject;

import java.util.Arrays;
import java.util.Scanner;

public class festival8 {
	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {			
			System.out.print(i+1 + "번째 수 입력 : ");
			int a = sc.nextInt();
			array[i] = a;
		}
		
		Arrays.sort(array);
		

		System.out.println("정렬후");
		// 출력
		for (int i = 0; i < array.length; i++) {			
			System.out.print(array[i] + " ");
		}	
	}
}
//for (int i = 0; i <5; i++) {
//int temp = array[i];
//for (int j = 0; j < 5 - 1 - i; j++) {
//	array[j+1] = array[j];
//	
//	temp = array[j+1];
//	array[i] = array[j];
//	array[j+1] = temp;
//}
//}
