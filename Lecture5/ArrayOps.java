package Lecture5;

import java.util.Scanner;

public class ArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		// int[] arr=takeInput();
		// display(arr);

		// int[] arr = { 30, 20, 1, 49, 68 };
		// int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr = { 50, 40, 30, 20, 10 };
		display(arr);
		// System.out.println(max(arr));
		// System.out.println(linearSearch(arr, 100));
		// reverse(arr);
		// display(arr);
		// System.out.println(binarySearch(arr, 60));
		// bubbleSort(arr);
		// selectionSort(arr);
		insertionSort(arr);
		display(arr);
		
		char str=s.next().charAt(3);
		System.out.println(str);

	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value at " + i + "th index");
			arr[i] = s.nextInt();
		}

		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	public static void reverse(int[] arr) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	public static int binarySearch(int[] arr, int data) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (arr[mid] > data) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
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

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min_index] > arr[j]) {
					min_index = j;
				}
			}

			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

}
