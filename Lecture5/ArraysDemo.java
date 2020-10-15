package Lecture5;

import java.util.ArrayList;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		// System.out.println(arr);

		arr = new int[5];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[0]);

		arr[1] = 20;
		arr[0] = 10;
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int i = 0, j = 1;
		System.out.println(arr[i] + ", " + arr[j]);
		swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

	}

	public static void swap(int[] arr, int i, int j) {
		arr = new int[5];
		System.out.println(arr[i] + ", " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + ", " + arr[j]);
	}

}
