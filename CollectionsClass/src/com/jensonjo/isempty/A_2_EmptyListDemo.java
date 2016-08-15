package com.jensonjo.isempty;

import java.util.Arrays;

public class A_2_EmptyListDemo {

	public static void main(String[] args) {
		A_1_Flowers flowers = new A_1_Flowers();
		System.out.println(flowers.toString());
		System.out.println(flowers.getFlowers().getClass());

		flowers = new A_1_Flowers("Rose", "Lilly", "Jasmine");
		System.out.println(flowers.toString());

		int arr[] = { 1, 4, 3, 2, 5, 9, 7, 8, 10, 9 };
		Arrays.sort(arr);
		System.out.println("arr should be sorted");
	}

}
