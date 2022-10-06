package com.dharani.array;

/**
 * 
 * Given a string s, return the longest palindromic substring in s.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "babad" Output: "bab" Explanation: "aba" is also a valid answer.
 * Example 2:
 * 
 * Input: s = "cbbd" Output: "bb"
 *
 */
public class LongestPalindromicSubstring {

	public static void main(String[] args) {

		String s = "a";

		System.out.println(longestPalindrome(s));
	}

	public static String longestPalindrome(String s) {

		String result = "";
		int resLength = 0;

		for (int i = 0; i < s.length(); i++) {

			int left = i, right = i;

			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

				if (right - left + 1 > resLength) {
					resLength = right - left + 1;
					result = s.substring(left, right + 1);
				}

				left--;
				right++;
			}

			left = i;
			right = i + 1;
			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

				if (right - left + 1 > resLength) {
					resLength = right - left + 1;
					result = s.substring(left, right + 1);
				}

				left--;
				right++;
			}

		}

		return result;
	}

}
