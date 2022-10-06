package com.dharani.problems2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Marks {

	double average;

	int count;

}

public class HighestAverageScore {

	public static void main(String[] args) {

		String[][] scores = { { "jerry", "65" }, { "bob", "91" }, { "jerry", "23" }, { "Eric", "83" } };

		System.out.println(getAverage(scores));

	}

	private static String getAverage(String[][] scores) {

		String name = "";

		double average = 0;

		Map<String, Marks> avg = new HashMap<>();

		for (int i = 0; i < scores.length; i++) {

			Marks marks = avg.get(scores[i][0]);

			if (Objects.nonNull(marks)) {

				marks.average = (marks.average + Double.valueOf(scores[i][1])) / marks.count++;
			} else {
				marks = new Marks();
				marks.average = Double.valueOf(scores[i][1]);
				marks.count = 1;
				avg.put(scores[i][0], marks);
			}

			if (marks.average > average) {
				average = marks.average;
				name = scores[i][0];
			}

		}

		return name;
	}

}
