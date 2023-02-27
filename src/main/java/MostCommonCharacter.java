import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

        //Iterate through string and get all chars.
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = str.charAt(i);

            if (charMap.containsKey(currentChar)) {
                charMap.put(currentChar, charMap.get(currentChar) + 1);
            } else {
                charMap.put(currentChar, 1);
            }
        }

        //Iterate through charMap and get largest
        char mostCommon = 'a';
        int largestOccurences = 0;

        for (char i : charMap.keySet()) {
            int currentOccurences = charMap.get(i);

            if (currentOccurences > largestOccurences) {
                largestOccurences = currentOccurences;
                mostCommon = i;
            }
        }

        return mostCommon;
    }
}
