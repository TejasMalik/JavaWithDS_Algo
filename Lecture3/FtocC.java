package Lecture3;

public class FtocC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fmin = 0;
		int fmax = 300;
		int fcurrent = fmin;
		int fstep = 20;
		while (fcurrent <= fmax) {
			int c = (int)((5.0 / 9) * (fcurrent - 32));
			System.out.println(fcurrent + "\t" + c);
			fcurrent = fcurrent + fstep;
		}
	}

}
