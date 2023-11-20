package com.invert.phrase.invert_phrase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void phrase1() {

		String expected = "afternoon Good";

		String invertedPhrase = App.invertPhrase("Good afternoon");

		assertEquals(expected, invertedPhrase);
	}

	@Test
	public void phrase2() {

		String expected = "?you are how ,Hello";

		String invertedPhrase = App.invertPhrase("Hello, how are you?");

		assertEquals(expected, invertedPhrase);
	}

	@Test
	public void phrase3() {

		String expected = "?old years twenty-one you Are";

		String invertedPhrase = App.invertPhrase("Are you twenty-one years old?");

		assertEquals(expected, invertedPhrase);
	}
}
