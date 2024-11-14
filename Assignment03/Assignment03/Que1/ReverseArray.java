package com.assignment;

public class ReverseArray {
	private int maxSize;
	private int top;
	private int[] stackArray;

	public ReverseArray(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		if (top >= maxSize - 1) {
			System.out.println("Stack is full. Can't push " + value);
			return;
		}
		stackArray[++top] = value;
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack is empty. Can't pop.");
			return -1;
		}
		return stackArray[top--];
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack is empty.");
			return -1;
		}
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

}
