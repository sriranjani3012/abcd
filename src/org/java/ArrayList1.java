package org.java;

import java.util.ArrayList;;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<String>();

		s.add("10");
		s.add("sri");
		s.add("sri1");
System.out.println("for loop");
		
		for (String x : s) {
			System.out.println(x);
		}
		
	}
}