package pages;

import java.util.Arrays;

public class TestProgram {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 4, 5, 2, 1, 3, 3, 5 };
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		int uniqueIndex = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1])
				arr[uniqueIndex++] = arr[i];
		}
		System.out.println(uniqueIndex);
		System.out.println(Arrays.toString(arr));

		arr[uniqueIndex++] = arr[arr.length - 1];
		System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, uniqueIndex)));
	}
}
