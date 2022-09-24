package solution;

import java.util.Scanner;

public class TheLongestWord {

	public static String findLongestWord(String str) {
		// string split at space
		String[] word = str.split(" "); 
        String longestWord = "";

        //loop will compare words with the previous longest word
        for (int i = 0; i < word.length; i++)
        {
        	if ( word[i].length() > longestWord.length())
            	longestWord = word[i];
        }
        
        return longestWord;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
		String str = sc.nextLine();
        String longestWord = findLongestWord(str);
        
        System.out.println("Output: " + longestWord);	
	}
}
