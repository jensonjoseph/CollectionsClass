package com.jensonjo.isempty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_1_Flowers {
	private List<String> flowers;

	public List<String> getFlowers() {
		return flowers;
	} 
	public void setFlowers(List<String> flowers) {
		this.flowers = flowers;
	}

	public A_1_Flowers() {
		flowers = Collections.emptyList();
	}

	A_1_Flowers(String... flowerName) {
		flowers = new ArrayList<>();
		for (String flower : flowerName) {
			flowers.add(flower);
		}
	}

	@Override
	public String toString() {
		return flowers.toString();
	}
}
