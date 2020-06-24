package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrammer {


	public List<String> computeAnagramsFromString(String toAnagram, String anagrammed) {
		if(toAnagram.isEmpty()) {
			return Arrays.asList(anagrammed);
		}
		else {
			return createAnagramsListUsingOneCharacter(toAnagram, anagrammed);
		}
	}
	
	private List<String> createAnagramsListUsingOneCharacter(String toAnagram, String anagrammed) {
		
		List<String> anagramsListToReturn = new ArrayList<String>();
		String toAnagramRemaining;
		
		
		for(int i = 0; i < toAnagram.length(); i++) {
			toAnagramRemaining = removeCharFromIndex(toAnagram, i);
			anagramsListToReturn.addAll(
					computeAnagramsFromString(toAnagramRemaining, anagrammed + toAnagram.charAt(i))
					);
		}
		return anagramsListToReturn;
	}

	private String removeCharFromIndex(String toEdit, int indexToRemoveFrom){
		StringBuilder sb = new StringBuilder(toEdit);
		return sb.deleteCharAt(indexToRemoveFrom).toString();
	}
}
