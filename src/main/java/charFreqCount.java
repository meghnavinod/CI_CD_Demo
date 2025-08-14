import java.util.HashMap;

public class charFreqCount {
    public static void main(String[] args) {
        String input="Programming";

        // Create a HashMap to store frequency of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        // Count frequency of each character in the input string
        for (char c : input.toCharArray()) {
            //converts string to charArray and char h goes through every element
           // to find character count
            if (freqMap.containsKey(c)) { //if freqmap contains a key(c) in String
                freqMap.put(c, freqMap.get(c) + 1); //print character and frequency count
            } else {
                freqMap.put(c, 1);//if only one character is present
            }
        }

        // Print the frequency of each character once after counting is complete
        for (char key : freqMap.keySet()) {
            System.out.println(key + " : " + freqMap.get(key));
        }
    }
}