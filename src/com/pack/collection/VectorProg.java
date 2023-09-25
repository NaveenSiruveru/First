package com.pack.collection;

import java.util.Collection;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProg {

	public static void main(String[] args) {
		Vector list=new Vector();
		Vector<Integer> list1=new Vector<Integer>();
		Vector<String> list2=new Vector<String>();
		list.add(123);
		list.add("naveen");
		list.add('n');
		list.add(null);
		list.add(123);
		list.add('t');
		list.add("string");
		list.add("naveen");
		System.out.println(list);
		ListIterator<Object> li1=(ListIterator<Object>) list.iterator();
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}

	}

}
