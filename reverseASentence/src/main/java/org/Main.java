package org;

import org.service.ReverseSentence;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = ReverseSentence.reverseSentence(sentence);
        out.println("Reversed sentence: " + reversedSentence);
    }
}