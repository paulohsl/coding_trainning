package com.algorithms.strings;

public class ReverseWordsBuffer {

    public static void main(String[] args) {

        String str = "piglet quantum";

        System.out.println(reverseWord(str));

    }

    private static String reverseWord(String word) {

        char[] buffer = new char[word.length()];

        char[] s = word.toCharArray();

        int tokenReadPos, wordReadPos, writePos = 0, wordEnd;

        // Começa a ler o token do final
        tokenReadPos = word.length() - 1;

        while (tokenReadPos >= 0) {

            if (s[tokenReadPos] != ' ') {
                wordEnd = tokenReadPos;

                // Lê o token até encontrar um espaço vazio
                while (tokenReadPos >= 0 && s[tokenReadPos] != ' ')
                    tokenReadPos--;

                // coloca a posição de leitura para uma posição a frente do espaço
                wordReadPos = tokenReadPos + 1;

                while (wordReadPos <= wordEnd) {
                    buffer[writePos++] = s[wordReadPos++];
                }


            } else {
                buffer[writePos++] = s[tokenReadPos--];
            }

        }

        return new String(buffer);
    }


}
