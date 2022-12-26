package com.arraylists;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs= new HashSet<>();
		hs.add(22);
		hs.add(44);
		hs.stream().forEach(x->System.out.println(x));
	}
}
