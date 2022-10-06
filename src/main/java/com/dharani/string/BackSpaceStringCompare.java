package com.dharani.string;

import java.util.Stack;

/**
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * Input: s = "ab#c", t = "ad#c" Output: true Explanation: Both s and t become
 * "ac".
 *
 */
public class BackSpaceStringCompare {

	public static void main(String[] args) {

		String s = "ab##";
		String t = "c#d#";

		System.out.println(backspaceCompare(s, t));

	}

	public static boolean backspaceCompare(String s, String t) {

		Stack<Character> stack1 = new Stack<>();

		for (char c : s.toCharArray()) {

			if (c == '#') {
				if (!stack1.isEmpty()) {
					stack1.pop();
				}

			} else {
				stack1.add(c);
			}

		}
		s = stack1.toString();
		stack1.clear();
		for (char c : t.toCharArray()) {

			if (c == '#') {
				if (!stack1.isEmpty()) {
					stack1.pop();
				}

			} else {
				stack1.add(c);
			}

		}
		t = stack1.toString();

		return s.equals(t);

	}

}
