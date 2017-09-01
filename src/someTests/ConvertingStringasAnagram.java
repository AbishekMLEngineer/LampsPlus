package someTests;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;
public class ConvertingStringasAnagram {
	String string1;
	
	public static int numberNeeded(String first, String second) {
			
			Map<Character, Integer> mapOfCharacterCount;

	        if (first.length() >= second.length()) {
	            mapOfCharacterCount = getMapOfCharacterCount(first);
	            return getCharacterDifferenceBetweenStringAndMap(second, mapOfCharacterCount);
	        } else {
	            mapOfCharacterCount = getMapOfCharacterCount(second);
	            return getCharacterDifferenceBetweenStringAndMap(first, mapOfCharacterCount);
	        }      
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded1(a, b));
	    }

	    private static Map<Character, Integer> getMapOfCharacterCount(final String string) {
	        final Map<Character, Integer> mapOfCharacterCount = new HashMap<Character, Integer>();
	        
	        for (Integer currentIndex = 0; currentIndex < string.length(); currentIndex++) {
	            Character currentCharacter = (Character) string.charAt(currentIndex);
	            if (mapOfCharacterCount.containsKey(currentCharacter)) {
	                
	            	Integer characterCount = mapOfCharacterCount.get(currentCharacter);
	                
	            	mapOfCharacterCount.put(currentCharacter, ++characterCount);
	           
	            } else {
	                mapOfCharacterCount.put(currentCharacter, 1);
	            }
	        }
	        
	        return mapOfCharacterCount;
	    }

	    private static int getCharacterDifferenceBetweenStringAndMap(final String string, final Map<Character, Integer> mapOfCharacterCountForSecondString) {
	        int differenceCount = 0;

	        for (int i = 0; i < string.length(); i++) {
	            Character currentCharacter = string.charAt(i);
	            if (mapOfCharacterCountForSecondString.containsKey(currentCharacter)) {
	                Integer characterCount = mapOfCharacterCountForSecondString.get(currentCharacter);
	                if ((characterCount - 1) == 0) {
	                    // The count for this character has reached 0 in the second string. Remove it from the map
	                    // so that if the character comes up again in the first string, we know to add to the 
	                    // difference count.
	                    mapOfCharacterCountForSecondString.remove(currentCharacter);
	                } else {
	                    mapOfCharacterCountForSecondString.put(currentCharacter, --characterCount);
	                }
	            } else {
	                differenceCount++;
	            }
	        }

	        for (Map.Entry<Character, Integer> entry : mapOfCharacterCountForSecondString.entrySet()) {
	            differenceCount += entry.getValue();
	        }

	        return differenceCount;
	    }

	    public static int numberNeeded1(String first, String second) {

	        int numberNeeded = 0;
	        Map<Character, Integer> count = new HashMap<>();
	        for(char c : first.toCharArray()){
	            if(count.containsKey(c))
	                count.put(c, count.get(c)+1);
	            else
	                count.put(c, 1);
	        }

	        for(char c : second.toCharArray()){
	            if(count.containsKey(c))
	                count.put(c, count.get(c)-1);
	            else
	                count.put(c, 1);
	        }

	        for(int value: count.values()){
	            if(value != 0){
	                numberNeeded++;
	            }
	        }

	        return numberNeeded;
	    }
	    
	    
}
