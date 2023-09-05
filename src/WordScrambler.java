public class WordScrambler {
    private String[] scrambledWords;

    public WordScrambler(String[] wordArr) {
        scrambledWords = mixedWords(wordArr);
    }

    private String recombine(String word1, String word2) {
        return word1.substring(0,word1.length()/2) + word2.substring(word2.length()/2);
    }

    private String[] mixedWords(String[] words) {
        if(words.length %2 != 0) throw new IllegalArgumentException("Word Array must contain an even number of elements!");
        String output[] = new String[words.length];
        String temp1;
        String temp2;
        for(int i = 0; i < words.length - 1; i+=2){
            if (words[i].contains(" ")) throw new IllegalArgumentException("Word Array must contain single words only! "+ words[i]+" contains more than one word!");
            else if (words[i+1].contains(" ")) throw new IllegalArgumentException("Word Array must contain single words only! "+ words[i+1]+" contains more than one word!");

            temp1 = recombine(words[i], words[i+1]);
            temp2 = recombine(words[i+1], words[i]);
            output[i] = temp1;
            output[i+1] = temp2;
        }
        return output;
    }

    public String[] getScrambledWords(){
        return scrambledWords;
    }



}
