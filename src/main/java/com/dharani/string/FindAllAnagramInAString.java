package com.dharani.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given two strings s and p, return an array of all the start indices of p's
 * anagrams in s. You may return the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * Input: s = "cbaebabacd", p = "abc" Output: [0,6] Explanation: The substring
 * with start index = 0 is "cba", which is an anagram of "abc". The substring
 * with start index = 6 is "bac", which is an anagram of "abc".
 *
 */
public class FindAllAnagramInAString {

	public static void main(String[] args) {

		String s1 = "cbaebabacd";
		String p = "abc";

		findAnagrams(s1, p).stream().forEach(System.out::println);

	}

	public static List<Integer> findAnagrams(String s, String p) {

		List<Integer> list = new ArrayList<>();

		if (s.length() < p.length()) {
			return list;
		}

		for (int i = 0; i <= s.length() - p.length(); i++) {

			if (isAnagram(s.substring(i, i + p.length()), p)) {
				list.add(i);
			}
		}

		return list;

	}

	private static boolean isAnagram(String s1, String p) {

		int[] arr = new int[26];

		for (int i = 0; i < p.length(); i++) {

			arr[s1.charAt(i) - 'a']++;
			arr[p.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}

		return true;

	}

}
