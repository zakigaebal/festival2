package festivalProject;

public class festival6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =10;
		int n =3;
		int result = powerN(base,n);
		System.out.println("결과 확인 : " + result);
	}

	private static int powerN(int base, int n) {
		int a = 1;
		for (int i = 0; i < n; i++) {
			a *= base;
		}
		return a;
	}

}
