package ru.goncharov.memes.common;

public class NextLetter implements Letter {

    private final String phrase;
    private final Character letter;

    public NextLetter(final String phrase, final Character letter) {
        this.phrase = phrase;
        this.letter = letter;
    }

    @Override
    public String value() {
        final String result = String.valueOf(letter);
        new ConsoleProgress(phrase, result).show();
        return result;
    }
}
