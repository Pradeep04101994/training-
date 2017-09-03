package com.vinnovateLabz.pradeep;

import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerInput = new Scanner(System.in);

		try {
			System.out.println("Enter the Array length");
			int arrayLen = scannerInput.nextInt();
			int inputarr[] = new int[arrayLen];

			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("Enter the arrays");

			for (int i = 0; i < arrayLen; i++) {
				inputarr[i] = scannerInput.nextInt();
			}

			System.out.println("Entered  array elements are ");

			for (int i = 0; i < arrayLen; i++) {
				System.out.println("arr[" + i + "] = " + inputarr[i]);
			}
			/* SORTING THE ELEMENTS */
			for (int i = 0; i < inputarr.length; i++) 
			{
				for (int j = 1; j < inputarr.length - i; j++) {
					if (inputarr[j - 1] > inputarr[j]) {
						int temp = inputarr[j - 1];
						inputarr[j - 1] = inputarr[j];
						inputarr[j] = temp;
					}
				}
			}
			System.out.println();
			System.out.println();
			System.out.println();

			System.out.println("Arrays after sorting  ");
			for (int i = 0; i < arrayLen; i++) {
				System.out.println("arr[" + i + "] = " + inputarr[i]);
			}
			/* Creating 2 List to add Positive and Negative elements*/
			List<Integer> positiveList = new ArrayList<Integer>();
			List<Integer> negativeList = new ArrayList<Integer>();

			for (int i = 0; i < arrayLen; i++) {
				if (inputarr[i] >= 0) {
					/* positive elements*/
					positiveList.add(inputarr[i]);
				} else {
					/* negative elements*/
					negativeList.add(inputarr[i]);
				}
			}

			int counta = positiveList.size();
			int countb = negativeList.size();

			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.println("Printing in lepending order ");
			/* printing the lepending order  */
			for (int i = 0; i < arrayLen; i++) 
			{
				if (counta > i)
					System.out.print(positiveList.get(i) + " ");
				if (countb > i)
					System.out.print(negativeList.get(i) + " ");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			scannerInput.close();
		}

	}

}
