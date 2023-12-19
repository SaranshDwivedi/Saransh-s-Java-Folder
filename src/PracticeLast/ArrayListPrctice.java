package PracticeLast;

import java.util.ArrayList;

public class ArrayListPrctice {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add(12);
		a.add(102);
		a.add(12);
		a.add(122);
		a.add(122);
		a.add(121);

		System.out.println(a);

		ArrayList a1 = new ArrayList();

		a1.add(12);
		a1.add(102);
		a1.add(12);
		a1.add(122);
		a1.add(124);
		a1.add(123);

		System.out.println(a1);
		
		a.removeAll(a1);
		
		System.out.println(a1);
		
		a1.removeAll(a);
		
		System.out.println(a);
		
		a.retainAll(a1);
		System.out.println(a1);
		
		a1.retainAll(a);
		System.out.println(a);
		
		
	}

}
