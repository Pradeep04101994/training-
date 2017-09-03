package com.vinnovateLabz.pradeep;

public class BubbleSort {

	public static void main(String[] args) {
		try {

			int bubbleArray[] = { 5, 1, 4, 2, 8 };

			 bubbleSort(bubbleArray);
			System.out.print("Sorting array using bubbleSort :   ");
			printArrayElements(bubbleArray);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * @description : method to sort arrays in ascending order 
	 * @param bubbleArray
	 * @return bubbleArray in sorted form 
	 */
	public static void bubbleSort(int bubbleArray[]) {
		for (int i = 0; i < bubbleArray.length - 1; i++) {
			for (int j = 0; j < bubbleArray.length - 1 - i; j++) {
				if (bubbleArray[j] > bubbleArray[j + 1]) {
					int temp = bubbleArray[j];
					bubbleArray[j] = bubbleArray[j + 1];
					bubbleArray[j + 1] = temp;
				}
			}
		}

		
	}
	/**
	 * @description : method takes the array elements and prints the array elements
	 * @param printArray
	 */
	public static void printArrayElements(int[] printArray) {
		for (int i = 0; i < printArray.length; i++) {
			System.out.print(printArray[i] + " ");
		}
		System.out.println();
	}
}
