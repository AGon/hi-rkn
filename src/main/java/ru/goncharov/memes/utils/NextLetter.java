package ru.goncharov.memes.utils;

import static java.lang.String.valueOf;

public class NextLetter {

    private final String phrase;
    private final Character letter;

    public NextLetter(final String phrase, final Character letter) {
        this.phrase = phrase;
        this.letter = letter;
    }

    public String get() {
        final String result = valueOf(letter);
        new Progress(phrase, result).show();
        return result;
    }
}
