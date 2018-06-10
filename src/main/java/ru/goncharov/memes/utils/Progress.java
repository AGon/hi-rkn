package ru.goncharov.memes.utils;

import static java.lang.String.format;
import static java.lang.System.err;

class Progress {

    private final String phrase;
    private final String letter;

    Progress(final String phrase, final String letter) {
        this.phrase = phrase;
        this.letter = letter;
    }

    void show() {
        err.println(format("%s %s", phrase, letter.toUpperCase()));
    }
}
