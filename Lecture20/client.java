package Lecture20;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Heap<Integer> heap = new Heap<>();
		// heap.add(35);
		// heap.add(30);
		// heap.add(25);
		// heap.add(20);
		// heap.add(15);
		// heap.add(10);
		// heap.add(5);
		//
		// heap.add(8);
		// heap.add(12);
		// heap.add(45);

		// Heap<Student> heap = new Heap<>();
		// heap.add(new Student("A", 300, 7));
		// heap.add(new Student("B", 600, 4));
		// heap.add(new Student("C", 100, 9));
		// heap.add(new Student("D", 200, 8));
		// heap.add(new Student("E", 800, 2));
		// heap.add(new Student("F", 900, 1));
		// heap.add(new Student("G", 400, 6));
		//
		// heap.add(new Student("H", 500, 5));
		// heap.add(new Student("I", 700, 3));
		// heap.dipslay();
		//
		// System.out.println("********************");
		// System.out.println(heap.remove());
		// heap.dipslay();

		Student[] students = new Student[9];
		students[0] = new Student(200, 8, "A");
		students[1] = new Student(500, 5, "B");
		students[2] = new Student(700, 3, "C");
		students[3] = new Student(100, 9, "D");
		students[4] = new Student(900, 1, "E");
		students[5] = new Student(800, 2, "F");
		students[6] = new Student(600, 4, "G");
		students[7] = new Student(300, 7, "H");
		students[8] = new Student(400, 6, "I");
		Heap<Student> heap = new Heap<>(students);

		heap.dipslay();

	}

	private static class Student implements Comparable<Student> {
		String name;
		int marks;
		int rank;

		Student(int marks, int rank, String name) {
			this.name = name;
			this.marks = marks;
			this.rank = rank;
		}

		public String toString() {
			return "{name=" + this.name + " marks=" + this.marks + " rank=" + this.rank + "}";
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks - o.marks;
		}

	}

}
