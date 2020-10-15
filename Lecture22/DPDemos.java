package Lecture22;

public class DPDemos {
	public static long start = 0;
	public static long end = 0;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int[][] strg = new int[n + 1][n + 1];
		// startAlgo();
		// System.out.println(fib(n));
		// System.out.println("fib normal " + endAlgo() + " ms");
		//
		// startAlgo();
		// System.out.println(fibRS(n, strg));
		// System.out.println("fib Recursive Storage " + endAlgo() + " ms");
		//
		// startAlgo();
		// System.out.println(fibIS(n));
		// System.out.println("fib Iterative Storage " + endAlgo() + " ms");

		// startAlgo();
		// System.out.println(cbp(n, 0));
		// System.out.println("cbp normal " + endAlgo() + " ms");
		//
		// startAlgo();
		// System.out.println(cbpRS(n, 0, strg));
		// System.out.println("cbp Recursive Storage " + endAlgo() + " ms");
		//
		// startAlgo();
		// System.out.println(cbpIS(n, 0));
		// System.out.println("cbp Iterative " + endAlgo() + " ms");

		// startAlgo();
		// System.out.println(countMazePath(n, n, 0, 0));
		// System.out.println("cmp normal " + endAlgo() + " ms");
		//
		// startAlgo();
		// System.out.println(countMazePathRS(n, n, 0, 0, strg));
		// System.out.println("cmp Recursive " + endAlgo() + " ms");
		//
		// startAlgo();
		// System.out.println(cmpIS(n, n, 0, 0));
		// System.out.println("cmp iterative " + endAlgo() + " ms");

		String str1 = "abbgndjdnsscks";
		String str2 = "agbgcsjsnjssckskcmskcsk";
		startAlgo();
		System.out.println(lcs(str1, str2));
		System.out.println(" lcs recursive took time " + endAlgo() + " ms");

		startAlgo();
		System.out.println(lcsI(str1, str2));
		System.out.println(" lcs iterative storage took time " + endAlgo() + " ms");

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fibn = fnm1 + fnm2;
		return fibn;

	}

	public static int fibRS(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibRS(n - 1, strg);
		int fnm2 = fibRS(n - 2, strg);
		int fibn = fnm1 + fnm2;
		strg[n] = fibn;
		return fibn;

	}

	public static int fibIS(int n) {
		int[] strg = new int[n + 1];
		// seed
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

	public static int cbp(int end, int curr) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count = count + cbp(end, curr + i);
		}
		return count;

	}

	public static int cbpRS(int end, int curr, int[] strg) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			count = count + cbpRS(end, curr + i, strg);
		}
		strg[curr] = count;
		return count;

	}

	public static int cbpIS(int end, int curr) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				sum = sum + strg[dice + i];
			}
			strg[i] = sum;
		}
		return strg[0];
	}

	public static int countMazePath(int er, int ec, int cr, int cc) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count = count + countMazePath(er, ec, cr + 1, cc);
		count = count + countMazePath(er, ec, cr, cc + 1);
		return count;
	}

	public static int countMazePathRS(int er, int ec, int cr, int cc, int[][] strg) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		int count = 0;

		count = count + countMazePathRS(er, ec, cr + 1, cc, strg);
		count = count + countMazePathRS(er, ec, cr, cc + 1, strg);
		strg[cr][cc] = count;
		return count;
	}

	public static int cmpIS(int er, int ec, int cr, int cc) {
		int[][] strg = new int[er + 1][ec + 1];
		// seed
		strg[er][ec] = 1;
		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er || j == ec) {
					strg[i][j] = 1;
				} else {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}
			}
		}
		return strg[cr][cc];
	}

	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		int ans = 0;
		if (str1.charAt(0) == str2.charAt(0)) {
			ans = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(str1, ros2);
			int f2 = lcs(ros1, str2);
			ans = Math.max(f1, f2);
		}
		return ans;
	}

	public static int lcsI(String str1, String str2) {
		int[][] strg = new int[str1.length() + 1][str2.length() + 1];
		// seed
		strg[str1.length()][str2.length()] = 0;
		for (int i = str1.length(); i >= 0; i--) {
			for (int j = str2.length(); j >= 0; j--) {
				if (i == str1.length() || j == str2.length()) {
					strg[i][j] = 0;
					continue;
				}
				if (str1.charAt(i) == str2.charAt(j)) {
					strg[i][j] = 1 + strg[i + 1][j + 1];
				} else {
					strg[i][j] = Math.max(strg[i][j + 1], strg[i + 1][j]);
				}
			}

		}
		return strg[0][0];

	}

}
