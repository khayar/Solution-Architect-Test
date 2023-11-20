package com.invert.phrase.invert_phrase;

import java.util.Stack;

public class App {
	public static void main(String[] args) {
		System.out.println(invertPhrase("Are you twenty-one years old?"));
	}

	public static String invertPhrase(String phrase) {
		String result = "";

		String[] words = phrase.split("(?<=\\W)|(?=\\W)");


		Stack<String> elements = new Stack<String>();

		for (int i = 0; i < words.length; i++) {

			if (words[i].contains("-")) {

				String beforeHyphen = words[i - 1];
				String hyphen = words[i];
				String afterHyphen = words[i + 1];

				String result1 = beforeHyphen.concat(hyphen).concat(afterHyphen);

				elements.pop();
				elements.push(result1);
				i += 2;
			}

			elements.push(words[i]);
		}

		for (int i = 0; i < words.length; i++) {

			if (!elements.isEmpty()) {

				result += elements.pop();
			}

		}

		return result;

	}

}