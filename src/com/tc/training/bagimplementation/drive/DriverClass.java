package com.tc.training.bagimplementation.drive;

import com.tc.training.bagimplementation.ds.Bag;

public class DriverClass {
	public static void main(String[] args) {
		// Checking for Integer Type, testing all methods
		Bag<Integer> bagInteger = new Bag<>();
		System.out.println("bag empty " + bagInteger.isEmpty());
		bagInteger.add(21);
		bagInteger.add(22);
		bagInteger.add(23);
		bagInteger.add(24);
		bagInteger.add(25);
		bagInteger.add(26);
		bagInteger.add(26);
		bagInteger.add(28);
		bagInteger.add(29);
		bagInteger.add(30);
		System.out.println("size " + bagInteger.size()); // size reached at max 10
		bagInteger.add(31); // adding one more element
		System.out.println("size " + bagInteger.size()); // size increased dynamically
		System.out.println("Random Integer " + bagInteger.get());
		System.out.println("Size of Integer Bag " + bagInteger.size());
		System.out.println("bag empty " + bagInteger.isEmpty());
		System.out.println("Integer bag contains 23 " + bagInteger.contains(23));
		System.out.println("Integer bag contains 233 " + bagInteger.contains(233));
		bagInteger.printAll();
		System.out.println("count for 26 is " + bagInteger.count(26));
		bagInteger.remove(26);
		System.out.println("size after remove 26 is " + bagInteger.size()); // size reduced
		bagInteger.printAll();
		bagInteger.print(7);

		System.out.println("\n\n\n\n\n\n");

		// Checking for Float Type, testing all methods
		Bag<Float> bagFloat = new Bag<>();
		System.out.println("bag empty " + bagFloat.isEmpty());
		bagFloat.add(21.21f);
		bagFloat.add(22.11f);
		bagFloat.add(23.92f);
		bagFloat.add(24.98f);
		bagFloat.add(25.22f);
		bagFloat.add(26.11f);
		bagFloat.add(26.11f);
		bagFloat.add(28.21f);
		bagFloat.add(29.92f);
		bagFloat.add(30.92f);
		System.out.println("size " + bagFloat.size()); // size reached at max 10
		bagFloat.add(31.877f); // adding one more element
		System.out.println("size " + bagFloat.size()); // size increased dynamically
		System.out.println("Random Float " + bagFloat.get());
		System.out.println("Size of Float Bag " + bagFloat.size());
		System.out.println("bag empty " + bagFloat.isEmpty());
		System.out.println("Float bag contains 23.92 " + bagFloat.contains(23.92f));
		System.out.println("Float bag contains 233.22 " + bagFloat.contains(233.22f));
		bagFloat.printAll();
		System.out.println("count for 26.11 is " + bagFloat.count(26.11f));
		bagFloat.remove(26.11f);
		System.out.println("size after remove 26.11 is " + bagFloat.size()); // size reduced
		bagFloat.printAll();
		bagFloat.print(7);

	}
}
