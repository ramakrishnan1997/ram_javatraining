package com.assessment.hr;

import java.util.Scanner;

public class Coin {

	public static void main(String[] args) {

		int i = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Integer.parseInt(s.next());
		while (i <= num) {
			i++;
		}
		if (Math.random() < 0.5) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}

}
