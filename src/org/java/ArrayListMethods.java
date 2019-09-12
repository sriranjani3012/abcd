package org.java;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(15);
		boolean e = a.isEmpty();
		System.out.println(e);

		int i = a.indexOf(10);
		System.out.println(i);
		int l = a.lastIndexOf(10);
		System.out.println(l);
		ArrayList<Integer> b = new ArrayList<>();
		boolean f = b.isEmpty();
		System.out.println(f);
		System.out.println("a list" + a);
		System.out.println("blist" + b);
		b.addAll(a);
		System.out.println("after add all b list" + b);
		a.add(100);
		b.add(90);
		System.out.println(a);
		System.out.println(b);
		boolean s = a.contains(100);
		System.out.println("contains 100" + s);
		boolean con = a.containsAll(b);
		System.out.println(con);
		b.removeAll(a);
		System.out.println(b);
		b.retainAll(a);
		System.out.println(b);
		
		
	}
}
