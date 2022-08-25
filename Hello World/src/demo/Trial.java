package demo;

import java.util.ArrayList;
import java.util.HashMap;

public class Trial {
    public static void main(String[] args) {
		String sampleInput = "Hello World How Are You";
		
		//Sample Output
		// H : Hello How
		// W : World 
		// A : Are
		// Y : You
		
		
		display(formatTheInput(sampleInput));
	}

	private static HashMap<Character, ArrayList<String>> formatTheInput(String sampleInput) {

		HashMap<Character, ArrayList<String>> MapToReturn = new HashMap<Character, ArrayList<String>> ();
        
        String[] words = sampleInput.split(" ");

        for (int i = 0; i<words.length; i++){
            if (MapToReturn.get(words[i].charAt(0)) != null ){
                MapToReturn.get(words[i].charAt(0)).add(words[i]);
            }else{
                ArrayList<String> word = new ArrayList<String>();
                word.add(words[i]);
                MapToReturn.put(words[i].charAt(0), word);
            }
        }

        System.out.println(MapToReturn);
		
		return MapToReturn;
	}

	private static void display(HashMap<Character, ArrayList<String>> outputString) {
	}
}
