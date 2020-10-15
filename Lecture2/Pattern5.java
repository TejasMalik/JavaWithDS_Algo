package Lecture2;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int col = 1;
		int n = 5;
		int value=1;
		while (row <= n) {
			col=1;
			while(col<=row){
				System.out.print(value+" ");
				value++;
				col++;
			}
			System.out.println();
			row++;
		}
	}

}
