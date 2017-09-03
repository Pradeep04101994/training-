package com.vinnovateLabz.pradeep;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerInput = new Scanner(System.in);

		try {

			System.out.println("Hello Steve enter the string ");

			String inputString = scannerInput.nextLine();
			int stringLength = inputString.length();

			int i = 0;
			while (i < stringLength - 1) {
				char current = inputString.charAt(i);
				char next = inputString.charAt(i + 1);

				if (current == next) {
					/* compare string with the next element if equal then the reduction takes place 
					 * eg : aaabccddd -> abccddd 
					 *  */
					inputString = inputString.substring(0, i) + inputString.substring(i + 2); 
					stringLength = inputString.length();
					i = 0;
					continue;
				}
				i++;
			}

			if (inputString.length() == 0)
				System.out.println("Empty String");
			else
				System.out.println("Reduced String is " + inputString);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scannerInput.close();
		}

	}

}
