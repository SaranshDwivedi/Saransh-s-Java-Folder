package PracticeLast;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		
		TreeSet <Integer> t = new TreeSet<Integer>(); 
		t.add(11);
		t.add(222);
		t.add(3333);
		t.add(44444);
		t.add(11);
		
		t.size();
		System.out.println(t);
		t.remove(3333);
		System.out.println(t);
		
	}

}
