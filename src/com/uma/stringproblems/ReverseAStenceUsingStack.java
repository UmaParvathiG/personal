package com.uma.stringproblems;

import com.uma.ds.stack.Stack;

/**
 * Created by uma.parvathi on 5/25/18.
 */
public class ReverseAStenceUsingStack {
	public static void main(String[] args) {
		Stack<String> st= new Stack<String>(3);

		st.push("This");
		st.push("is");
		st.push("Uma");

		st.print();

	}
}
