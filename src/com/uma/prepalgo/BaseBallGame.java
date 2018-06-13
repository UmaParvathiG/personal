package com.uma.prepalgo;

import java.util.Stack;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

/**
 * Created by uma.parvathi on 5/24/18.
 */
public class BaseBallGame {
	public static int calPoints(String[] ops) {
		Stack<Integer> scoreStack = new Stack<Integer>();
		int opsLength = ops.length;
		int score = 0, score1 = 0, score2 = 0,top=0;
		for (int i = 0; i < opsLength; i++) {
			if (ops[i] == "+") {
				if (!scoreStack.isEmpty()) {
					score1 = scoreStack.peek();
					top=scoreStack.pop();
					if (!scoreStack.isEmpty()) {
						score2 = scoreStack.peek();
					}
					score += score1 + score2;
					scoreStack.push(top);
					scoreStack.push(score1 + score2);

				}
			}
			else if (ops[i] == "D") {
				if (!scoreStack.isEmpty()) {
					scoreStack.push(scoreStack.peek()+scoreStack.peek());
					score += scoreStack.peek();
				}
			}
			else if (ops[i] == "C") {
				if (!scoreStack.isEmpty()) {
					score = score - scoreStack.peek();
					scoreStack.pop();
				}
			}
			else {
				score += Integer.valueOf(ops[i]);
				scoreStack.push(Integer.valueOf(ops[i]));
			}
		}
		return score;
	}

	public static void main(String[] args) {
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(ops));

	}

}