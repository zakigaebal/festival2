package festivalProject;
/*
 * 일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다.
시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
1.5배의 시급이 책정됩니다. 

 */
public class festival1 {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int sum = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				System.out.print((i+1)+ " ");
				sum += (i+1);
			}
			
			if(i%2==1) {				
				System.out.print(-(i+1)+ " ");
				sum += -(i+1);
			}
			
			
		}
		System.out.println();
		System.out.print("결과: ");
		System.out.println(sum);
	}
}
