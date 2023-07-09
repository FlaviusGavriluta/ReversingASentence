package org.service;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseSentence {
    public static String reverseSentence(String sentence) {
        Stack<String> wordStack = new Stack<String>();
        Queue<Character> charQueue = new LinkedList<Character>();
        StringBuilder reversedSentence = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                if (currentWord.length() > 0) {
                    wordStack.push(currentWord.toString());
                    currentWord = new StringBuilder();
                }
                charQueue.offer(' ');
            } else {
                currentWord.append(c);
                charQueue.offer(c);
            }
        }
        if (currentWord.length() > 0) {
            wordStack.push(currentWord.toString());
        }
        while (!wordStack.isEmpty()) {
            String word = wordStack.pop();
            while (!charQueue.isEmpty() && charQueue.peek() == ' ') {
                reversedSentence.append(charQueue.poll());
            }
            for (char c : word.toCharArray()) {
                reversedSentence.append(charQueue.poll());
            }
        }
        while (!charQueue.isEmpty()) {
            reversedSentence.append(charQueue.poll());
        }
        return reversedSentence.toString();
    }
}
