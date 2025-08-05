package day6;

import java.util.*;
import java.util.regex.*;

public class PossibleWordsFinder {
    
    public static String identifyPossibleWords(String input1, String input2) {
      
        String incompleteWord = input1.trim();
        String[] wordList = input2.split(":");
        
        
        String patternStr = incompleteWord.replace("_", ".");
        
       
        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
        
      
        List<String> matches = new ArrayList<>();
        
        for (String word : wordList) {
            word = word.trim();
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                matches.add(word.toUpperCase());
            }
        }
        
     
        if (!matches.isEmpty()) {
            return String.join(":", matches);
        } else {
            return "ERROR-009";
        }
    }
    
    public static void main(String[] args) {
        String input1 = "Fi_er";
        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
        
        String output = identifyPossibleWords(input1, input2);
        System.out.println(output); 
    }
}
