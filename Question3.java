package com.vinnovateLabz.pradeep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scannerInput = new Scanner(System.in);
		int arrayLen;
		try {
			System.out.println("Enter the number of array elements ");   
			/* size of array */
			arrayLen = scannerInput.nextInt();
			int inputArr[] = new int[arrayLen];
			List<Integer> list = new ArrayList<Integer>();
			Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

			System.out.println("Enter the array elements");
			for (int i = 0; i < arrayLen; i++) {
				inputArr[i] = scannerInput.nextInt();
				list.add(inputArr[i]);
			}

			for (int i = 0; i < arrayLen; i++) {
				hashMap.put(inputArr[i], Collections.frequency(list, inputArr[i]));
			}
			System.out.println("HashMap = " + hashMap);
			/* Calling the method to sort the values */
			Map<Integer, Integer> sortedMap = sortByComparator(hashMap);

			System.out.println("Sorted Map = " + sortedMap);

			for (Entry<Integer, Integer> entry : sortedMap.entrySet()) {
				int count = entry.getValue();

				for (int i = 0; i < count; i++) {
					System.out.print(entry.getKey() + " ");

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scannerInput.close();

		}

	}
	/* method to sort the values in a map in descending order */
	private static Map<Integer, Integer> sortByComparator(Map<Integer, Integer> unsortMap) {

		List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(unsortMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		// Maintaining insertion order with the help of LinkedList
		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		for (Entry<Integer, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
