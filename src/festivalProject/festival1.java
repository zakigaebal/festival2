package festivalProject;
/*
 * ���� �ð��� �Է¹޾� �� �ӱ��� ����ϴ� �ñް����Դϴ�.
�ñ��� 5000���̸� 8�ð����� �ʰ� �ٹ��� �ð��� ����
1.5���� �ñ��� å���˴ϴ�. 

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
		System.out.print("���: ");
		System.out.println(sum);
	}
}
