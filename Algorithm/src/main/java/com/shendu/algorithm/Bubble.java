/**
 * 
 */
package com.shendu.algorithm;

/**
 * @author xiao
 *
 */
public class Bubble {

	public static void bubblesort(int arr[]) {
		int len = arr.length;
		int temp;
		// 0-13
		for (int i = 1; i < len; i++) {
			// 0-13
			for (int j = 1; j <= len - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number = { 4, 8, 6, 14, 23, 1, 84, 3, 2, 11, 5, 16, 34, 82 };
		bubblesort(number);
		for (int a : number)
			System.out.print(a + ",");
	}

}
