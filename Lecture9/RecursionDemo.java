package Lecture9;

import java.util.ArrayList;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSS("abc", "");
		printSSWAscii("ab", "");
		printPermutations("abc", "");

		System.out.println(getMazePath(2, 2, 0, 0));
		printMazePath(2, 2, 0, 0, "");

		boolean[][] board = new boolean[4][4];
		System.out.println(countNQueens(board, 0));
	}

	public static void printSS(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, result);
		printSS(ros, result + cc);
	}

	public static void printSSWAscii(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		printSSWAscii(ros, result);
		printSSWAscii(ros, result + cc);
		printSSWAscii(ros, result + (int) cc);
	}

	public static void printPermutations(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, result + cc);
		}
	}

	public static ArrayList<String> getMazePath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> baseresult = new ArrayList<>();
			return baseresult;
		}
		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> hResult = getMazePath(er, ec, cr, cc + 1);
		ArrayList<String> vResult = getMazePath(er, ec, cr + 1, cc);

		for (int i = 0; i < hResult.size(); i++) {
			myResult.add("H" + hResult.get(i));
		}

		for (int i = 0; i < vResult.size(); i++) {
			myResult.add("V" + vResult.get(i));
		}

		return myResult;
	}

	public static void printMazePath(int er, int ec, int cr, int cc, String result) {
		if (er == cr && ec == cc) {
			System.out.println(result);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		printMazePath(er, ec, cr, cc + 1, result + "H");
		printMazePath(er, ec, cr + 1, cc, result + "V");
	}

	public static int countNQueens(boolean[][] board, int row) {
		if (row == board.length) {
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isItSafe(board, row, col)) {
				board[row][col] = true;
				count = count + countNQueens(board, row + 1);
				board[row][col] = false;
			}

		}
		return count;
	}

	private static boolean isItSafe(boolean[][] board, int row, int col) {

		for (int i = row; i >= 0; i--) {
			if (board[i][col]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]) {
				return false;
			}
		}

		return true;
	}

}
