package Lecture12;

public class InPolClientA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// not allowed
		// PA obj = new PA();
		// CA obj = new PA();

		PA obj1 = new CA();
		System.out.println(obj1.num);
		obj1.Fun();
		obj1.Fun1();
		// obj1.Fun2();
		((CA) obj1).Fun2();

		// no issues with 	CA obj = new CA(); //everything allowed, everything
		// called
	}

}
