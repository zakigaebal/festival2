package festivalProject;

public class festival3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivdie(num1,num2);
		System.out.println("결과확인 : "+ result);
	}

	private static boolean isDivdie(int num1, int num2) {
		if(num1%num2 ==0) return true;
		return false;
	}

}
