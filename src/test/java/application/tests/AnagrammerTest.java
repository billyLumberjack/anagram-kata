package application.tests;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import application.Anagrammer;

public class AnagrammerTest {
	
	private Anagrammer toTestAnagrammer = new Anagrammer();

	@Test
	public void computeAnagramsFromEmptyStringTest() {
		List<String> expectedAnagrams = Arrays.asList("expectedAnagram");
		List<String> actualAnagrams = toTestAnagrammer.computeAnagramsFromString("" , expectedAnagrams.get(0));
		
		assertThat(actualAnagrams, is(expectedAnagrams));
	}
	
	@Test
	public void computeAnagramsFromStringTest() {
		String inputString = "in";
		List<String> expectedAnagrams = Arrays.asList("in" , "ni");
		List<String> actualAnagrams = toTestAnagrammer.computeAnagramsFromString(inputString, "");
		
		toTestAnagrammer.computeAnagramsFromString("in","");
		assertThat(actualAnagrams, is(expectedAnagrams));
	}

}