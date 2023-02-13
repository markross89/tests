package org.example.HackerRank.day3;

public class Task3 {


    public String caesarCipher(String s, int k) {

        s = s.trim().replace(" ", "");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder();

        if (k > alphabet.length()) {
            k = k - k / alphabet.length() * alphabet.length();
            System.out.println(k);
        }

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i))) {

                for (int j = 0; j < alphabet.length() - k; j++) {

                    if (s.toLowerCase().charAt(i) == alphabet.toLowerCase().charAt(j)) {
                        if (Character.isUpperCase(s.charAt(i))) {
                            sb.append(Character.toUpperCase(alphabet.charAt(j + k)));
                        } else {
                            sb.append(alphabet.charAt(j + k));
                        }
                        break;
                    }
                }

                for (int m = 0; m < k; m++) {
                    if (s.toLowerCase().charAt(i) == alphabet.toLowerCase().charAt(alphabet.length() - k + m)) {
                        if (Character.isUpperCase(s.charAt(i))) {
                            sb.append(Character.toUpperCase(alphabet.charAt(m)));
                        } else {
                            sb.append(alphabet.charAt(m));
                        }
                    }
                }

            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

//                  OR
//
//      StringBuilder result = new StringBuilder();
//        for (char character : s.toCharArray()) {
//            if (character != ' ' && Character.isAlphabetic(character)) {
//                int originalAlphabetPosition = character - 'a';
//                int newAlphabetPosition = (originalAlphabetPosition + k) % 26;
//                char newCharacter = (char) ('a' + newAlphabetPosition);
//                result.append(newCharacter);
//            } else {
//                result.append(character);
//            }
//        }
//        return result.toString();