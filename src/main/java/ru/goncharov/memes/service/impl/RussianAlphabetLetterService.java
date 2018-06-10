package ru.goncharov.memes.service.impl;

import org.springframework.stereotype.Service;
import ru.goncharov.memes.service.LetterService;
import ru.goncharov.memes.utils.NextLetter;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

@Service
public class RussianAlphabetLetterService implements LetterService {

    private final List<String> russianAlphabet = getRussianAlphabet();
    private int index = 0;

    @Override
    public void banLetter(final String phrase) {
        final String letter = new NextLetter(phrase, getLetter(phrase)).get();
        if (phrase.length() > 2) {
            final String regex = "(" + letter.toLowerCase() + "|" + letter.toUpperCase() + ")";
            ++index;
            banLetter(phrase.replaceAll(regex, "").trim());
        }
    }

    private List<String> getRussianAlphabet() {
        final List<String> russianAlphabet = new ArrayList<>();
        for (int code = 1040; code < 1072; code++) { // Коды символов русских букв
            russianAlphabet.add(getUpperChar(code));
            if (code == 1045) {
                russianAlphabet.add(getUpperChar(1025)); // Код буквы Ё
            }
        }
        return russianAlphabet;
    }

    private String getUpperChar(final int code) {
        return valueOf((char) code).toUpperCase();
    }

    private Character getLetter(final String phrase) {
        final String letter = russianAlphabet.get(index);
        if (phrase.toUpperCase().contains(letter)) {
            return letter.toCharArray()[0];
        } else {
            ++index;
            return getLetter(phrase);
        }
    }
}
