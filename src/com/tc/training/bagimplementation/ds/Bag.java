package com.tc.training.bagimplementation.ds;

import com.tc.training.bagimplementation.behaviour.Printer;

public class Bag<T extends Number> implements Printer {

	private T[] bagArray; // to store Objects
	private Integer capacity; // max capacity, can be changed dynamically
	private Integer topIndex; // Maintaining index of array

	@SuppressWarnings("unchecked")
	public Bag() {
		this.capacity = 10; // by default capacity is 10, increases by 1.5 times of original size
							// dynamically
		this.bagArray = (T[]) new Number[this.capacity];
		this.topIndex = -1;
	}	

	// Resize the internal array size dynamically of size exceeds capacity,
	// increases by 1.5 times of original size
	private void resizeBagCapacity() {
		this.capacity = (int) (this.capacity * 1.5);
		@SuppressWarnings("unchecked")
		T[] temporaryBag = (T[]) new Number[this.capacity];
		for (int i = 0; i <= topIndex; i++) {
			temporaryBag[i] = bagArray[i];
		}
		this.bagArray = temporaryBag;
	}

	// Display all elements of Bag
	@Override
	public void printAll() {
		for (int i = 0; i <= this.topIndex; i++) {
			System.out.print(this.bagArray[i] + " ");
		}
		System.out.println();
	}

	// Display element by index
	@Override
	public void print(int index) {
		if (index <= topIndex && index > -1)
			System.out.println(this.bagArray[index]);
		else
			System.out.println("Invalid Index, Not Available");

	}

	// Adds an element
	public void add(T t) {
		if (this.topIndex + 1 == this.capacity) {
			this.resizeBagCapacity();
		}
		this.bagArray[++this.topIndex] = t;
	}

	// Returns random element from the bag
	public T get() {
		Integer randomIndexInteger = (int) ((Math.random() * (this.topIndex - 0)) + 0);
		return bagArray[randomIndexInteger];
	}

	// Returns current size of the bag
	public int size() {
		return topIndex + 1;
	}

	// Returns if the bag is empty
	public boolean isEmpty() {
		if (topIndex == -1)
			return true;
		return false;
	}

	// Checks if given element is in the bag
	public boolean contains(T checkingT) {
		for (int i = 0; i <= this.topIndex; i++) {
			if (this.bagArray[i].equals(checkingT))
				return true;
		}
		return false;
	}

	// Removes the element ( removes all occurrences if multiple were present ) from
	// bag
	public void remove(T t) {
		int index = 0;
		for (int i = 0; i <= this.topIndex; i++)
			if (!this.bagArray[i].equals(t))
				this.bagArray[index++] = this.bagArray[i];
		this.topIndex = index - 1;
	}

	// Returns count of the given element
	public int count(T t) {
		int count = 0;
		for (T i : bagArray) {
			if (t.equals(i)) {
				count++;
			}
		}
		return count;
	}

}
