package com.dharani.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Given a string s, find the length of the longest substring without repeating
 * characters. Input: s = "abcabcbb" Output: 3
 * 
 * Explanation: The answer is "abc", with the length of 3.
 *
 * 
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "pwwkew";

		System.out.println(lengthOfLongestSubstring(s));

	}

	public static int lengthOfLongestSubstring(String s) {

		int result = 0;

		Map<Character, Integer> dupMap = new HashMap<>();

		int start = 0;

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			Integer index = dupMap.get(arr[i]);

			if (index == null || index < start) {

				result = Math.max(result, (i - start) + 1);

			} else {
				start = index + 1;
			}

			dupMap.put(arr[i], i);

		}

		return result;

	}

}
