package Lecture6;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr;
		// System.out.println(arr);

//		arr = new int[3][3];
//		System.out.println(arr[0][0]);
//		arr[1][0] = 10;
//		arr[0][1] = 20;
//		display(arr);
		
		//arr=new int[][4];
		arr=new int[3][];
		System.out.println(arr[0]);
		arr[0]=new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[1][0]);
		
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
