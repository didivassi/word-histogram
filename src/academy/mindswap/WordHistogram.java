package academy.mindswap;

import java.util.*;

/**
 * Creates a histogram for words after invoking the analyseString method.
 * You can Iterate the key strings created by analyseString method.
 * Get the number of occurrences of a string by invoking the get(string) method.
 */
public class WordHistogram implements Iterable<String>{

    private Map<String,Integer> wordHistogram = new  HashMap<>();

    /**
     * PARAMS String to analyse
     * */
    public void analyseString(String string) {
        String[] bags=string.toLowerCase().replace(".","").replace(",","").split(" ");
        for (String word:bags) {
            Integer occurrences=wordHistogram.get(word)==null?1:wordHistogram.get(word)+1;
            wordHistogram.put(word,occurrences);
        }
    }

    /**
     * PARAMS String word
     * RETURNS Integer with number of occurrences in a string
     * */
    public Integer get(String word){
        return wordHistogram.get(word);
    }

    @Override
    public Iterator<String> iterator(){
        return wordHistogram.keySet().iterator();
    }
}
