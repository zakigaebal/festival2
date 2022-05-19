package festivalProject;

public class festival7 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		// Ãâ·Â
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
