package Lecture4;

public class FunWithQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 32;
		System.out.println(DecToBin(dec));
		System.out.println(BinToDec(100000));
		System.out.println(DecToAny(32, 2));
		System.out.println(AnyToDec(100000, 2));
		System.out.println(AnyToAny(37, 8, 2));

		System.out.println(log(32, 2));
	}

	public static int DecToBin(int dec) {
		int bin = 0;
		int tenPowers = 1;

		while (dec != 0) {
			int rem = dec % 2;
			bin = bin + rem * tenPowers;
			tenPowers = tenPowers * 10;
			dec = dec / 2;
		}

		return bin;
	}

	public static int BinToDec(int bin) {
		int dec = 0;
		int twoPowers = 1;

		while (bin != 0) {
			int rem = bin % 10;
			dec = dec + rem * twoPowers;
			twoPowers = twoPowers * 2;
			bin = bin / 10;
		}

		return dec;
	}

	public static int DecToAny(int dec, int db) {
		int num = 0;
		int tenPowers = 1;

		while (dec != 0) {
			int rem = dec % db;
			num = num + rem * tenPowers;
			tenPowers = tenPowers * 10;
			dec = dec / db;
		}

		return num;
	}

	public static int AnyToDec(int num, int sb) {
		int dec = 0;
		int sbPowers = 1;

		while (num != 0) {
			int rem = num % 10;
			dec = dec + rem * sbPowers;
			sbPowers = sbPowers * sb;
			num = num / 10;
		}

		return dec;
	}

	public static int AnyToAny(int num, int sb, int db) {
		int dec = AnyToDec(num, sb);
		int ans = DecToAny(dec, db);
		return ans;
	}

	public static int log(int x, int n) {
		int counter = 0;
		while (x != 1) {
			counter++;
			x = x / n;
		}

		return counter;
	}

}
