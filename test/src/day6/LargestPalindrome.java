package day6;
import java.util.*;

public class LargestPalindrome {

    public static int charactersToRemove(String input1) {
 
        String word = input1.toLowerCase();

       
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

  
        if (oddCount <= 1) {
            return 0;
        }

      
        if (oddCount == word.length()) {
            return -1;
        }

   
        return oddCount - 1;
    }

    public static void main(String[] args) {
        System.out.println(charactersToRemove("Template")); 
        System.out.println(charactersToRemove("Magma"));    
        System.out.println(charactersToRemove("Victory"));  
    }
}
