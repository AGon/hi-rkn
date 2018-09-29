package ru.goncharov.memes.common;

import java.util.ArrayList;
import java.util.List;

public class RussianAlphabet implements Alphabet {

    @Override
    public List<String> value() {
        final List<String> russianAlphabet = new ArrayList<>();
        for (int code = 1040; code < 1072; code++) { // Коды символов русских букв
            russianAlphabet.add(upperChar(code));
            if (code == 1045) {
                russianAlphabet.add(upperChar(1025)); // Код буквы Ё
            }
        }
        return russianAlphabet;
    }

    private String upperChar(final int code) {
        return String.valueOf((char) code).toUpperCase();
    }
}
