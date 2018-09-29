package ru.goncharov.memes.common;

import static java.lang.String.format;
import static java.lang.System.err;

public class ConsoleProgress implements Progress {

    private final String phrase;
    private final String letter;

    ConsoleProgress(final String phrase, final String letter) {
        this.phrase = phrase;
        this.letter = letter;
    }

    @Override
    public void show() {
        err.println(format("%s %s", phrase, letter.toUpperCase()));
    }
}
