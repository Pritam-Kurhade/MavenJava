package com.arraylists;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(33);
		al.add(55);
		al.add(77);

		al.stream().forEach(x->System.out.println(x));
<<<<<<< HEAD
		al.add(555);
		
		System.out.println(al);
		System.out.println("Hello worjing on bug 100");
		/*
		 * some random code
		 */
=======
		System.out.println("hello java");

		System.out.println(al);
>>>>>>> 83ab6551a6fb8146157748c920347f317937f18e

	}
}
