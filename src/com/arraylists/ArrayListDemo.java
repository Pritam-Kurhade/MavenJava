package com.arraylists;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(33);
		al.add(55);
		al.add(77);

		al.stream().forEach(x->System.out.println(x));
		System.out.println("hello java");

		System.out.println(al);

	}
}
