package com.desco.training;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First Class");
		System.out.println("DESCO");

		int b = 2;
		int c = 3;

		String x = "10";

		int a = 2;

		System.out.println(a);

		float d = ++a / --b - --c / ++a + b;
		System.out.println(d);
		System.out.println("Mostafa Kamal");

		/*
		 * Scanner input=new Scanner(System.in);
		 * 
		 * int p= input.nextInt(); int q= input.nextInt(); int r=
		 * input.nextInt();
		 * 
		 * if (p>=q) { if (p>=r) {System.out.println(p + " is large number");
		 * 
		 * } }
		 * 
		 * if (q>=p) { if (q>=r) {System.out.println(q + " is large number");
		 * 
		 * } }
		 * 
		 * if (r>=p) { if (r>=q) {System.out.println(r + " is large number");
		 * 
		 * } }
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter input P");
		int p = input.nextInt();

		switch (p) {
		case 1:
			System.out.println("You press 1");
			// break;
		case 2:
			System.out.println("You press 2");
			break;

		case 3:
			System.out.println("You press 3");
			break;

		default:
			System.out.println("You press beyond 1,2,3");
			break;
		}
	}

}
