package com.arraylists;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(232);
		al.add(44);
		al.add(66);
		al.stream().forEach(z->System.out.println(z));
	}
}
