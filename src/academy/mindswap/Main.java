package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        WordHistogram wordHistogram = new WordHistogram();
        wordHistogram.analyseString("You can always trust the untrustworthy because you can always trust that they will be untrustworthy. It's the trustworthy you cannot trust.");

        //System.out.println(wordHistogram);

        for (String word:wordHistogram) {
            System.out.println(word + " : " + wordHistogram.get(word));
        }

        WordHistogram wordHistogram2 = new WordHistogram();
        for (String word:wordHistogram2) {
            System.out.println(word + " : " + wordHistogram.get(word));
        }
    }
}
