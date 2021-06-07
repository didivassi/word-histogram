package academy.mindswap;

import java.util.*;

public class WordHistogram implements Iterable<String>{

    private Map<String,Integer> wordHistogram = new  HashMap<>();

    public void analyseString(String string) {
        String[] bags=string.toLowerCase().split(" ");
        for (String word:bags) {
            Integer occurrences=wordHistogram.get(word)==null?1:wordHistogram.get(word)+1;
            wordHistogram.put(word,occurrences);
        }

    }
    public Integer get(String word){
        return wordHistogram.get(word);
    }

    @Override
    public Iterator<String> iterator() {
        return wordHistogram.keySet().iterator();
    }
}
