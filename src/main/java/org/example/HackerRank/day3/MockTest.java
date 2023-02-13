package org.example.HackerRank.day3;

public class MockTest {



    public int palindromeIndex(String s) {

        char[] word = s.toLowerCase().trim().replace(" ","").toCharArray();
        int l = word.length - 1;

        for (int i = 0; i < word.length/2; i++) {
            if (word[i] == word[l]) {
                l--;
            }else if(word[i+1]==word[l]){
                return i;
            }else if(word[i]==word[l-1]){
                return l;
            }
        }
        return -1;
    }
}
