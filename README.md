# CS.12.01-Tutorial.1.2.5

Consider the following partial declaration for a WordScrambler class. The constructor for the WordScrambler class takes an even-length array of String objects and initializes the instance variable scrambledWords.

public class WordScrambler {

	private String[] scrambledWords;

	public WordScrambler(String[] wordArr) {
		
		scrambledWords = mixedWords(wordArr);
	
	}

	private String recombine(String word1, String word2) {

		// To be implemented.
  
	}

	private String[] mixedWords(String[] words) {
		
		// To be implemented.

	}

}


a) Write the WordScrambler method recombine. This method returns a String created from its two String parameters as follows.
Take the first half of word1
Take the second half of word2
Concatenate the two halves and return the new string

For example, the following table shows some results of calling recombine. Note that if a word has an odd number of letters, the second half of the word contains the extra letter. 

<img width="729" alt="image" src="https://github.com/techarenz/CS.12.01-Tutorial.1.2.5/assets/57818506/a9d139d8-a43f-4e52-846d-ff5bccf2dfb1">

b) Write the WordScrambler method mixedWords. This method creates and returns a new array of String objects as follows.

It takes the first pair of strings in words and combines them to produce a pair of strings to be included in the array returned by the method. If this pair of strings consists of w1 and w2, the method should include the result of calling recombine with w1 and w2 as arguments and should also include the result of calling recombine with w2 and w1 as arguments. The next two strings, if they exist, would form the next pair to be processed by this method. The method should continue until all the strings in words have been processed in this way and the new array has been filled. For example, if the array words contains the following elements:

{“apple”, “pear”, “this”, “cat”}

then the call mixedWords(words) should return the following array.

{“apar”, “peple”, “that”, “cis”}

In writing mixedWords, you should call recombine. 
