package application;

public class EntryPoint {

	public static void main(String[] args) {
		Anagrammer myAnagrammer = new Anagrammer();
		
		String toAnagram = args[0];
		
		System.out.println("Anagrams for : " + toAnagram);
		System.out.println(myAnagrammer.computeAnagramsFromString(toAnagram , ""));
	}

}
