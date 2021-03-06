package com.uma.prepalgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by uma.parvathi on 5/24/18.
 */
public class NextGreaterElement {
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // map from x to next greater element of x
		Stack<Integer> stack = new Stack<Integer>();
		for (int num : nums) {
			while (!stack.isEmpty() && stack.peek() < num)
				map.put(stack.pop(), num);
			stack.push(num);
		}
		for (int i = 0; i < findNums.length; i++)
			findNums[i] = map.getOrDefault(findNums[i], -1);
		return findNums;
	}

	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
	}
}
