package com.uma.ds.stack;

import java.net.SocketPermission;
import java.net.SocketTimeoutException;

/**
 * Created by uma.parvathi on 5/25/18.
 */
public class Stack<T> {

	int top;
	int size;
	T[] arr;

	public Stack(int size) {
		this.size=size;
		this.top=-1;
		arr= (T[]) new Object[size];
	}


	public boolean isEmpty(){
		return (top==-1);
	}

	public boolean isFull() {
		return (top==(size-1));
	}

	public void push(T data){
		if(!isFull()){
			arr[++top]=data;
		}
		else
			System.out.println("Stack is Full");
	}

	public T pop(){
		T data= null;
		if(!isEmpty()){
			return arr[top--];
		}
		else {
			System.out.println("Stack is empty");
			return data;
		}
	}

	public T peek(){
		T data= null;
		if(!isEmpty()){
			return arr[top];
		}
		else {
			System.out.println("Stack is empty");
			return data;
		}
	}

	public void print() {
		for(int i =top; i>=0;i--)
			System.out.println(arr[i]);
	}
}
