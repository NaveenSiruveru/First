package com.pack.collection;


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<String> list2=new LinkedList<String>();
		list.add(123);
		list.add("naveen");
		list.add('n');
		list.add(null);
		list.add(123);
		list.add('t');
		list.add("string");
		list.add("naveen");
		list2.add("ngin56");
		System.out.println(list.size());
		ListIterator<Object> li= (ListIterator<Object>) list.iterator();
		System.out.println("jbrugiuh==============");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("jbrugiuh=======================");
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println("====================================");
		ListIterator<String> li1= (ListIterator<String>) list2.iterator();
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}
	}

}
