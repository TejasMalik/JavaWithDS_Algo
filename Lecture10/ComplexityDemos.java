package Lecture10;

public class ComplexityDemos {

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
		// int[] one = { 1, 3, 5, 7 };
		// int[] two = { 2, 4, 6 };
		// int[] sorted = merge(one, two);
		// for (int i = 0; i < sorted.length; i++) {
		// System.out.print(sorted[i] + " ");
		// }

		// int[] arr = { 50, 40, 30, 20, 10, 5 };
		// int[] sorted = mergeSort(arr, 0, arr.length - 1);
		// for (int i = 0; i < sorted.length; i++) {
		// System.out.print(sorted[i] + " ");
		// }

		// int n = 1000000;
		// int[] arr = new int[n];
		// for (int i = 0; i < n; i++) {
		// arr[i] = n - i;
		// }
		//
		// startAlgo();
		// mergeSort(arr, 0, arr.length - 1);
		// System.out.println("The merge sort took time " + endAlgo() + " ms");
		// for (int i = 0; i < n; i++) {
		// arr[i] = n - i;
		// }
		// startAlgo();
		// bubbleSort(arr);
		// System.out.println("The bubble sort took time " + endAlgo() + " ms");

		// System.out.println(power(2, 5));

		int N = 1000000;
		startAlgo();
		SOE(N);
		System.out.println("The seive took time " + endAlgo() + " milliseconds");

		startAlgo();
		printPrimes(N);
		System.out.println("The print prime took time " + endAlgo() + " milliseconds");

	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] base = new int[1];
			base[0] = arr[low];
			return base;
		}
		int mid = (low + high) / 2;
		int[] one = mergeSort(arr, low, mid);
		int[] two = mergeSort(arr, mid + 1, high);
		int[] sorted = merge(one, two);
		return sorted;
	}

	public static int[] merge(int[] one, int[] two) {
		int i = 0, j = 0, k = 0;
		int[] three = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				three[k] = one[i];
				i++;
				k++;
			} else {
				three[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			three[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			three[k] = two[j];
			j++;
			k++;
		}
		return three;

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int ans = 1;
		if (n % 2 == 0) {
			int pnb2 = power(x, n / 2);
			ans = pnb2 * pnb2;
		}
		if (n % 2 == 1) {
			int pnb2 = power(x, n / 2);
			ans = pnb2 * pnb2 * x;
		}

		return ans;
	}

	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		// Write your logic
		int n2test = 2;
		while (n2test * n2test <= n) {
			if (primes[n2test]) {
				for (int multiplier = 2; multiplier * n2test <= n; multiplier++) {
					primes[n2test * multiplier] = false;
				}
			}
			n2test++;
		}

		for (int i = 2; i <= n; i++) {
			if (primes[i]) {
				// System.out.println(i);
			}
		}
	}

	public static void printPrimes(int N) {
		int start = 2;
		int end = N;

		boolean flag = true;
		while (start <= end) {
			int divisor = 2;
			flag = true;

			while (divisor < start) {
				if (start % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}

			if (flag == true) {
				// System.out.println(start);
			}
			start++;
		}

	}

	public static String getConcatenatedValues(int N) {
		String retVal = "";

		for (int i = 0; i <= N; i++) {
			retVal = retVal + i + "\n";
		}

		return retVal;
	}

	public static String getConcatenatedValuesBtr(int N) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= N; i++) {
			sb.append(i + "\n");
		}

		return sb.toString();
	}

	// For space complexity
	public static int getFactIterative(int n) {
		int rv = 1;

		while (n != 0) {
			rv *= n;
			n--;
		}

		return rv;
	}

	// For space complexity
	public static int getFactRecursive(int n) {
		if (n == 1) {
			return 1;
		}

		int factnm1 = getFactRecursive(n - 1);
		int factn = factnm1 * n;

		return factn;
	}

}
