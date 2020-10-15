package Lecture7;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PD(5);
		// PI(5);
		// PDI(5);
		// PDISkip(5);
		System.out.println(fact(5));
		System.out.println(power(2, 5));
		System.out.println(fib(5));

		int[] arr = { 3, 8, 8, 10, 8, 1 };
		System.out.println(isSorted(arr, 0));
		System.out.println(firstIndex(arr, 0, 8));

		System.out.println(lastIndex(arr, 0, 8));
		int[] ans = allIndices(arr, 0, 8, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

		pattern(5, 1, 1);

		System.out.println(moveAllXatEnd("aabbxdexxxfghxxikxl"));
	}

	public static void PD(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		PD(num - 1);
	}

	public static void PDI(int num) {
		if (num == 0) {
			return;
		}

		System.out.println(num);
		PDI(num - 1);
		System.out.println(num);
	}

	public static void PI(int num) {
		if (num == 0) {
			return;
		}
		PI(num - 1);
		System.out.println(num);

	}

	public static void PDISkip(int num) {
		if (num == 0) {
			return;
		}

		if (num % 2 != 0) {
			System.out.println(num);
		}
		PDISkip(num - 1);
		if (num % 2 == 0) {
			System.out.println(num);
		}
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		int fnm1 = fact(n - 1);
		int fn = n * fnm1;
		return fn;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pnm1 = power(x, n - 1);
		int pn = x * pnm1;
		return pn;

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fibnm1 = fib(n - 1);
		int fibnm2 = fib(n - 2);
		int fibn = fibnm1 + fibnm2;
		return fibn;
	}

	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}

		if (arr[si] <= arr[si + 1]) {
			return isSorted(arr, si + 1);
		} else {
			return false;
		}
	}

	public static int firstIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == data) {
			return si;
		} else {
			return firstIndex(arr, si + 1, data);
		}
	}

	public static int lastIndex(int[] arr, int si, int data) {
		if (si == arr.length) {
			return -1;
		}
		int ans = lastIndex(arr, si + 1, data);
		if (ans == -1) {
			if (arr[si] == data) {
				return si;
			} else {
				return -1;
			}
		} else {
			return ans;
		}

	}

	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			return new int[count];
		}
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}

		if (arr[si] == data) {
			indices[count] = si;
		}

		return indices;
	}

	public static void pattern(int n, int row, int col) {
		if (row > n) {
			return;
		}
		if (col > row) {
			System.out.println();
			pattern(n, row + 1, 1);
			return;
		}
		System.out.print("*");
		pattern(n, row, col + 1);
	}

	public static String moveAllXatEnd(String str) {
		if (str.length() == 0) {
			return "";
		}
		String myans = "";
		if (str.charAt(0) == 'x') {
			String yourresult = moveAllXatEnd(str.substring(1));
			myans = yourresult + 'x';
		} else {
			String yourresult = moveAllXatEnd(str.substring(1));
			myans = str.charAt(0) + yourresult;
		}

		return myans;
	}

}
